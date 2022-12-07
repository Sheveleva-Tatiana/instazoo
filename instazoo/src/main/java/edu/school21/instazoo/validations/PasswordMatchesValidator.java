package edu.school21.instazoo.validations;

import edu.school21.instazoo.annotations.PasswordMatches;
import edu.school21.instazoo.payload.request.SignupRequest;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {


    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        SignupRequest signupRequest = (SignupRequest) o;

        return signupRequest.getPassword().equals(signupRequest.getConfirmPassword());
    }
}
