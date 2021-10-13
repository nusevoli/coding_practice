package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pass.LackMoney;

class LackMoneyTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		LackMoney lm = new LackMoney();
		
		assertEquals(10, lm.solution(3, 20, 4));
	}

}
