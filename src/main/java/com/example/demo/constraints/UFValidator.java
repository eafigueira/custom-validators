package com.example.demo.constraints;

import static java.util.Arrays.asList;
import static java.util.Objects.isNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UFValidator implements ConstraintValidator<UF, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		String[] states = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
				"PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
		return isNull(value) || asList(states).indexOf(value) >= 0;
	}
}
