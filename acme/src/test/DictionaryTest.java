package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fail_pass.Dictionary;

class DictionaryTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		Dictionary dic = new Dictionary();
		
		assertEquals(6, dic.solution("AAAAE"));
		assertEquals(10, dic.solution("AAAE"));
		assertEquals(1563, dic.solution("I"));
		assertEquals(1189, dic.solution("EIO"));
	}

}
