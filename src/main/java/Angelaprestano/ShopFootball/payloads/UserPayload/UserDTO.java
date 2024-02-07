package Angelaprestano.ShopFootball.payloads.UserPayload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



public record UserDTO(
                      @NotEmpty(message = "the name is obligatory")
                      @Size(min = 3, max = 20, message = "The name must have minim 3 characters, max 20")
                      String name,
                      @NotEmpty(message = "the surname is obligatory")
                      @Size(min = 3, max = 20, message = "The surname must have minim 3 characters, max 20")
                      String surname,
                      @Email(message = "This is not a valid address")
                      @NotNull(message = "This address is required!")
                      String email,
                      @NotEmpty(message = "The password is obligatory")
                      @Size(min = 3, max = 20, message = "The password must have minim 3 characters, max 20")
                      String password
) {
}
