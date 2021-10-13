package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fail.Puzzle;

class PuzzleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		Puzzle p = new Puzzle();
		
		assertEquals(14, p.solution(new int[][]{{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}}, new int[][]{{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}}));
		assertEquals(0, p.solution(new int[][]{{0,0,0},{1,1,0},{1,1,1}}, new int[][]{{1,1,1},{1,0,0},{0,0,0}}));
	}

}
