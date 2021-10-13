package pass;

import java.util.ArrayList;

public class Acme {

	// 카카오 인턴쉽
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		Acme acme = new Acme();
		
		/*
		 * board 게임판
		 * moves 이동
		 */
//		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		int[][] board = {{1,1,1,1,1}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] moves = {1,2,3,4};
//		결과				4
		
		System.out.println(acme.solution(board, moves));
	}
	
	public static void main1(String[] args) {
		Acme acme = new Acme();
		System.out.println(acme.solution1(10));
		System.out.println(acme.solution1(12));
		System.out.println(acme.solution1(11));
		System.out.println(acme.solution1(13));
	}

	public int solution(int[][] board, int[] moves) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int removedCount = 0;
		
		for (int i = 0; i < moves.length; i++) {
			int x = moves[i] -1;

			for (int y = 0; y < board.length; y++) {
				if (board[y][x] != 0) {
					list.add(board[y][x]);
					board[y][x] = 0;
					
					int stackSize = list.size();
					if(stackSize > 1)
					{
						if(list.get(stackSize -1) == list.get(stackSize -2))
						{
							list.remove(stackSize -1);
							list.remove(stackSize -2);
							
							removedCount +=2;
						}
					}
					break;
				}
			}
		}

		return removedCount;
	}
	
	
	public boolean solution1(int x) {

		String inputString = String.valueOf(x);
		int length = inputString.length();
		int total = 0;

		for (int i = 0; i < length; i++) {
			total += inputString.charAt(i) - '0';
		}

		return x % total == 0;
	}
}
