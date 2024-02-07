package Angelaprestano.ShopFootball.services;

import Angelaprestano.ShopFootball.entities.Enum.Role;
import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.exceptions.BadRequestException;
import Angelaprestano.ShopFootball.exceptions.UnauthorizedException;
import Angelaprestano.ShopFootball.payloads.UserPayload.UserDTO;
import Angelaprestano.ShopFootball.payloads.LoginPayload.UserLoginDTO;
import Angelaprestano.ShopFootball.repositories.UserDAO;
import Angelaprestano.ShopFootball.security.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private JWTTools jwTTools;
    @Autowired
    private UserDAO userDao;
    @Autowired
    private UserService userService;

    public String authenticateUser(UserLoginDTO body) {
        User user = userService.findByEmail(body.email());
        if (bcrypt.matches(body.password(), user.getPassword())) {
            return jwTTools.createToken(user);
        } else {
            throw new UnauthorizedException("Credenziali non valide!!");
        }
    }

    public User save(UserDTO body) {
        userDao.findByEmail(body.email()).ifPresent(user -> {
            throw new BadRequestException("This email " + user.getEmail() + " is already use!");
        });
        userDao.findByName(body.name()).ifPresent(user -> {
            throw new BadRequestException("This name " + user.getName() + " is already use!");
        });
        User newUser = new User();
        newUser.setName(body.name());
        newUser.setSurname(body.surname());
        newUser.setEmail(body.email());
        newUser.setPassword(bcrypt.encode(body.password()));
        newUser.setRole(Role.USER);
        newUser.setAvatar("https://ui-avatars.com/api/?name=" + body.name() + "+" + body.surname());
        return userDao.save(newUser);
    }
}
