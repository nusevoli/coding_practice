package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pass.NonCompletedParticipant;

class NonCompletedParticipantTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		NonCompletedParticipant ncp = new NonCompletedParticipant();
		
		assertEquals("leo", ncp.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
		assertEquals("vinko", ncp.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
		assertEquals("mislav", ncp.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
	}

}
