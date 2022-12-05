package edu.school21.instazoo.annotations;

import edu.school21.instazoo.validations.EmailValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {
    String message() default "invalid Email";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default{};

}
