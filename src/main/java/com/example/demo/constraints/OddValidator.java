package com.example.demo.constraints;

import static java.util.Objects.isNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OddValidator implements ConstraintValidator<Odd, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return (isNull(value) || value % 2 != 0);
	}
}
