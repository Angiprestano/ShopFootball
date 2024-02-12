package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Enum.Role;
import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.exceptions.BadRequestException;
import Angelaprestano.ShopFootball.payloads.UserPayload.UserDTO;
import Angelaprestano.ShopFootball.payloads.LoginPayload.UserLoginDTO;
import Angelaprestano.ShopFootball.payloads.LoginPayload.UserLoginResponseDTO;
import Angelaprestano.ShopFootball.payloads.UserPayload.UserResponseDTO;
import Angelaprestano.ShopFootball.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public UserLoginResponseDTO login(@RequestBody UserLoginDTO body) {
        String accessToken = authService.authenticateUser(body);
        return new UserLoginResponseDTO(accessToken);
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody @Validated UserDTO newUserPayload, BindingResult validation) {
        if (validation.hasErrors()) {
            throw new BadRequestException("There are errors in Payload!");
        } else {
            String name = newUserPayload.name();
            String surname= newUserPayload.surname();
            String email = newUserPayload.email();
            String address= newUserPayload.address();
            String password = newUserPayload.password();
            Role role = newUserPayload.role();
            String avatar = newUserPayload.avatar();

            User newUser = new User();
            newUser.setName(name);
            newUser.setSurname(surname);
            newUser.setEmail(email);
            newUser.setAddress(address);
            newUser.setPassword(password);
            newUser.setRole(role);
            newUser.setAvatar(avatar);

            User user = authService.save(newUserPayload);
            return new UserResponseDTO(user.getId());
        }
    }
}
