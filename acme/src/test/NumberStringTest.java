package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pass.NumberString;

class NumberStringTest {

	@Test
	void test() {
		NumberString ns = new NumberString();
		assertEquals(1478, ns.solution("one4seveneight"));
	}

}
