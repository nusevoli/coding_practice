package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pass.MinRect;

class MinRectTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		MinRect mr = new MinRect();
		
		assertEquals(4000, mr.solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
		assertEquals(120, mr.solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
		assertEquals(133, mr.solution(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
	}

}
