package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	
	private Calculator sut;
	
	@BeforeEach
	public void setUp() {
		this.sut = new Calculator();
	}

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
	
	@Test
	public void 整数0を除算する() throws Exception {
		assertThatThrownBy(() -> {
			Integer actual = 5 /0 ;
		})
		.isInstanceOf(ArithmeticException.class)
		.hasMessage("/ by zero");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, -9, Integer.MAX_VALUE})
	public void 複数のパラメータが奇数であるかを検証する (int param) {
		boolean actual = sut.isOdd(param);
		boolean expected = true;
		
		assertThat(actual).isEqualTo(expected);
	}
	
	@ParameterizedTest
	@CsvSource({
		"6,3,2.0",
		"5,3,1.6666666666666667",
		"0,5,0.0"
	})
	public void 一度に複数のパラメータを扱う(int x, int y, double expected) {
		double actual = sut.devide(x, y);
		assertThat(actual).isEqualTo(expected);
	}
	
	@AfterEach
	public void tearDown() {
		this.sut = null;
	}
}
