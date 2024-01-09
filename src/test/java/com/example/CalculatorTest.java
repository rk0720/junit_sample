package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void multiplyで3と4の蒸散結果を取得() {
		Calculator sut = new Calculator();	
		int expected = 12;
		int actual = sut.multiply(3, 4);
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void multiplyで5と6の乗算結果を取得() {
		Calculator sut = new Calculator();
		int excepted = 30;
		int actual = sut.multiply(5, 6);
		
		assertThat(actual).isEqualTo(excepted);
	}
	
	@Test
	void devideで3と2の除算結果を取得() {
		Calculator sut = new Calculator();
		double excepted = 1.5;
		double actual = sut.devide(3, 2);
		
		assertThat(actual).isEqualTo(excepted);
	}
}
