package fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Puzzle {
	public int solution(int[][] game_board, int[][] table) {

		printShapes(game_board);

		int answer = -1;
		return answer;
	}

	private void printShapes(int[][] game_board) {
		
		for(int i=0; i<game_board.length; i++)
		{
			System.out.println(Arrays.stream(game_board[i]).boxed().collect(Collectors.toList()));
		}
		
//		game_board[0][2];
		
		print(game_board, 0, 2);

		ArrayList<Block> list = new ArrayList<Block>();
	}
	
	void print(int[][] gb, int x, int y)
	{
		dfs(gb, x, y);
		
		
	}

	private void dfs(int[][] gb, int x, int y) {
		
		if(gb[x][y] == 0)
		{
			System.out.println(x + " " + y);
		}
		
		
	}

	class Block {
		ArrayList<Point> points;

		public Block() {
			points = new ArrayList<Point>();
		}
	}
	
	class Point {
		int x;
		int y;
	}
}
