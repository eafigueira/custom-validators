package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.DummyDTO;

@SpringBootTest
public class ValuesMatchTest {
	@Autowired
	Validator validator;

	@Test
	void shouldEquals() {
		DummyDTO dto = new DummyDTO();
		dto.setPasswordOne("teste");
		dto.setPasswordTwo("teste");
		
		Set<ConstraintViolation<DummyDTO>> validations = validator.validate(dto);
		assertThat(validations.size()).isEqualTo(0);
	}
	
	@Test
	void shouldThrowError() {
		DummyDTO dto = new DummyDTO();
		dto.setPasswordOne("teste1");
		dto.setPasswordTwo("teste");
		
		Set<ConstraintViolation<DummyDTO>> validations = validator.validate(dto);
		assertThat(validations.size()).isEqualTo(1);
	}

}
