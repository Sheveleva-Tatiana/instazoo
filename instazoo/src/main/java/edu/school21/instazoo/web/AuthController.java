package edu.school21.instazoo.web;

import edu.school21.instazoo.payload.request.SignupRequest;
import edu.school21.instazoo.security.JWTTokenProvider;
import edu.school21.instazoo.services.UserService;
import edu.school21.instazoo.validations.ResponseErrorValidation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/auth")
@PreAuthorize("permitAll()")
public class AuthController {
    private JWTTokenProvider jwtTokenProvider;
    private AuthenticationManager authenticationManager;
    private ResponseErrorValidation responseErrorValidation;
    private UserService userService;

    public ResponseEntity<Object> registerUser(@Valid @RequestBody SignupRequest signupRequest, BindingResult bindingResult){
        return null;
    }

}
