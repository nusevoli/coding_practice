package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pass.MutualEvaluation;

class MutualEvaluationTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		
		MutualEvaluation me = new MutualEvaluation();
		
		assertEquals("FBABD", me.solution(new int[][] {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}}));
		assertEquals("DA", me.solution(new int[][] {{50,90},{50,87}}));
		assertEquals("CFD", me.solution(new int[][] {{70,49,90},{68,50,38},{73,31,100}}));
	}

}
