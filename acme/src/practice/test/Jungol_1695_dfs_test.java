package practice.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import practice.Jungol_1695_dfs;
import practice.Jungol_1695_dfs.Point;

class Jungol_1695_dfs_test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		Jungol_1695_dfs t = new Jungol_1695_dfs();
		
		
//		t.addNextRoute(7, new ArrayList<Point>(), 5, 3);
		
		assertArrayEquals(new int[] {3,7,8,9}, t.solve(7, new int [][] {
			{0,1,1,0,1,0,0},
			{0,1,1,0,1,0,1},
			{1,1,1,0,1,0,1},
			{0,0,0,0,1,1,1},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,1,1,0,0,0}}));

	}
}
