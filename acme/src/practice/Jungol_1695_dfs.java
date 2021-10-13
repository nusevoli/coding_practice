package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Jungol_1695_dfs {
	
	// http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=968&sca=3090

	int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // L R D U

	public class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return "{x:" + x + ", y:" + y + "}";
		}
	}

	public int[] solve(int length, int[][] data) {
		int[][] visited = new int[length][length];
		ArrayList<ArrayList<Point>> blocks = new ArrayList<ArrayList<Point>>();
		ArrayList<Point> route = new ArrayList<Point>();

		for (int y = 0; y < length; y++) {
			for (int x = 0; x < length; x++) {
				route.add(new Point(x, y));

				bfs(visited, data, length, blocks, route);
			}
		}

		int[][] checked = new int[length][length];

		for (int i = 0; i < blocks.size(); i++) {
			ArrayList<Point> points = blocks.get(i);

			for (int j = 0; j < points.size(); j++) {
				Point p = points.get(j);

				checked[p.x][p.y] = 1;
			}
		}

		System.out.println("----------------------------------");
		for (int i = 0; i < checked.length; i++) {
			System.out.println(Arrays.stream(checked[i]).boxed().collect(Collectors.toList()));
		}
		System.out.println("----------------------------------");

		for (int i = 0; i < blocks.size(); i++) {
			System.out.println("block(" + i + ")" + blocks.get(i));
		}
		
		int[] answer = new int[blocks.size() + 1];
		answer[0] = blocks.size();
		
		for(int i=0; i<blocks.size(); i++)
		{
			answer[i+1] = blocks.get(i).size();
		}

		return answer;
	}

	void bfs(int[][] visited, int[][] data, int length, ArrayList<ArrayList<Point>> blocks, ArrayList<Point> route) {

		ArrayList<Point> points = new ArrayList<Point>();
		
		int sX = route.isEmpty() ? -1 : route.get(0).x;
		int sY = route.isEmpty() ? -1 : route.get(0).y;
		
//		System.out.println("+" + sX + " " + sY + ">>>>>>>>>>>>>>>>>>>>>>>>");

		while (!route.isEmpty()) {
			Point pt = route.get(0);
			route.remove(0);

			int x = pt.x;
			int y = pt.y;

			if (visited[y][x] == 1)
				continue;

			visited[y][x] = 1;

//			System.out.println("bfs loop x:" + x + " y:" + y + " " + route);

			if (data[y][x] == 1) {
				addNextRoute(length, route, x, y);

				Point point = new Point(x, y);
				points.add(point);
			}
		}

		if (!points.isEmpty()) {
			blocks.add(points);
			
			System.out.println(sX + " " + sY + " " + points);
		}
		
//		System.out.println("+" + sX + " " + sY + "<<<<<<<<<<<<<<<<<<<");
	}

	public void addNextRoute(int length, ArrayList<Point> route, int x, int y) {
		for (int i = 0; i < direction.length; i++) {
			int nextX = x + direction[i][0];
			int nextY = y + direction[i][1];
			
			if (nextX > -1 && nextX < length && nextY > -1 && nextY < length) {
				route.add(new Point(nextX, nextY));
			}
		}
		
//		System.out.println("addNewRoute(" + x + ", " + y + ") " +  route);
	}

}
