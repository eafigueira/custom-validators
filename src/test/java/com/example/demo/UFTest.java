package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.DummyDTO;

@SpringBootTest
public class UFTest {

	@Autowired
	Validator validator;

	@Test
	void isValidSateOfBrazil() {
		DummyDTO dto = new DummyDTO();
		dto.setStateOfBrazil("SC");
		Set<ConstraintViolation<DummyDTO>> validations = validator.validate(dto);
		assertThat(validations.size()).isEqualTo(0);
	}
	
	@Test
	void errorIfNotOdd() {
		DummyDTO dto = new DummyDTO();
		dto.setStateOfBrazil("WW");
		List<ConstraintViolation<DummyDTO>> validations = validator.validate(dto).stream().toList();
		assertThat(validations.size()).isEqualTo(1);
	}


}
