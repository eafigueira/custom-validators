package com.example.demo.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UFValidator.class)
@Documented
public @interface UF {
	String message() default "Estado inválido";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
