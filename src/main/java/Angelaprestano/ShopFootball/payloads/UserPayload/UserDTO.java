package Angelaprestano.ShopFootball.payloads.UserPayload;

import Angelaprestano.ShopFootball.entities.Enum.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



public record UserDTO(
                      @NotEmpty(message = "the name is obligatory")
                      @Size(min = 3, max = 20, message = "The name must have minim 3 characters, max 20")
                      String name,
                      @NotEmpty(message = "the surname is obligatory")
                      @Size(min = 3, max = 20, message = "The surname must have min 3 characters, max 20")
                      String surname,
                      @Email(message = "This is not a valid email")
                      @NotNull(message = "This email is required!")
                      String email,
                      @NotEmpty(message = "Add your address.")
                      String address,
                      @NotEmpty(message = "The password is obligatory")
                      @Size(min = 3, max = 20, message = "The password must have minim 3 characters, max 20")
                      String password,
                      Role role,
                      String avatar) {

}


