package com.example.demo.dto;

import com.example.demo.constraints.Odd;
import com.example.demo.constraints.UF;
import com.example.demo.constraints.ValuesMatch;

@ValuesMatch(first = "passwordOne", second = "passwordTwo")
public class DummyDTO {

	@Odd
	private Integer numberOdd;

	@UF
	private String stateOfBrazil;

	private String passwordOne;
	private String passwordTwo;

	public Integer getNumberOdd() {
		return numberOdd;
	}

	public void setNumberOdd(Integer numberOdd) {
		this.numberOdd = numberOdd;
	}

	public String getStateOfBrazil() {
		return stateOfBrazil;
	}

	public void setStateOfBrazil(String stateOfBrazil) {
		this.stateOfBrazil = stateOfBrazil;
	}

	public String getPasswordOne() {
		return passwordOne;
	}

	public void setPasswordOne(String passwordOne) {
		this.passwordOne = passwordOne;
	}

	public String getPasswordTwo() {
		return passwordTwo;
	}

	public void setPasswordTwo(String passwordTwo) {
		this.passwordTwo = passwordTwo;
	}

}
