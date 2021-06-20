package com.example.demo.constraints;

import java.util.Objects;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;

public class ValuesMatchValidator implements ConstraintValidator<ValuesMatch, Object> {
	private String firstFieldName;
	private String secondFieldName;

	@Override
	public void initialize(ValuesMatch constraintAnnotation) {
		firstFieldName = constraintAnnotation.first();
		secondFieldName = constraintAnnotation.second();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		try {
			String valueFirstField = BeanUtils.getProperty(value, firstFieldName);
			String valueSecondField = BeanUtils.getProperty(value, secondFieldName);

			return Objects.equals(valueFirstField, valueSecondField);
			 
		} catch (final Exception ignore) {
		}
		return true;
	}
}
