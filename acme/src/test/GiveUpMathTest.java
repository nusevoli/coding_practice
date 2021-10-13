package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pass.GiveUpMath;

class GiveUpMathTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		GiveUpMath gum = new GiveUpMath();
		
		assertArrayEquals(new int[] {1}, gum.solution(new int[]{1,2,3,4,5}));
		assertArrayEquals(new int[] {1,2,3}, gum.solution(new int[]{1,3,2,4,2}));
		
	}

}
