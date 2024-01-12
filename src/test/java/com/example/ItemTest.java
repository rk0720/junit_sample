package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
// Nestedクラスをインポートする
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class ItemTest {

	@Nested
	public class 名前がnullの場合 {
		private Item sut;
		@BeforeEach
		//itemオブジェクトのフィールドはnullのまま
		public void setUp() {
			this.sut = new Item();
		}
		
		@Test
		public void nullを返す() {
			assertThat(this.sut.getName()).isNull();
		}
	}
	
	@Nested
	public class 名前がAの場合 {
		private Item sut;
		
		@BeforeEach
		public void setUp() {
			this.sut = new Item();
			this.sut.setName("商品A");
		}
		
		@Test
		public void 商品Aを返す() {
			String expected = "商品A";
			
			assertThat(this.sut.getName()).isEqualTo(expected);
		}
	}
}
