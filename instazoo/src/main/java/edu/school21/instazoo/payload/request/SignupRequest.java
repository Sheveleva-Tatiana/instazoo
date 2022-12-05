package edu.school21.instazoo.payload.request;

import edu.school21.instazoo.annotations.PasswordMatches;
import edu.school21.instazoo.annotations.ValidEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordMatches
public class SignupRequest {
    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
    @NotEmpty(message = "Please, enter your name")
    private String firstname;
    @NotEmpty(message = "Please, enter your lastname")
    private String lastname;
    @NotEmpty(message = "Please, enter your username")
    private String username;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;

}
