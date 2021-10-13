package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pass.KeyPad;

class KeyPadTest {

	@Test
	void test() {
		/*
		 * 
numbers	hand	result
[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
		 */
		KeyPad kp = new KeyPad();
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		assertEquals("LRLLLRLLRRL", kp.solution(numbers, hand));
		
		int[] numbers1 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand1 = "left";
		assertEquals("LRLLRRLLLRR", kp.solution(numbers1, hand1));
		
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand2 = "right";
		assertEquals("LLRLLRLLRL", kp.solution(numbers2, hand2));
	}

}
