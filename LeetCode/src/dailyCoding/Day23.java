package dailyCoding;

import java.util.LinkedList;
import java.util.Queue;

public class Day23 {

//	This problem was asked by Google.
//	You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.
//	Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

	static int ROW = 9;
	static int COL = 10;

	public static class Point {
		int row;
		int col;

		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static class QueueNode {
		Point node;
		int distance;

		public QueueNode(Point node, int distance) {
			this.node = node;
			this.distance = distance;
		}
	}

	public static boolean isValid(int row, int col) {
		return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL);
	}

	// to get the neighbouring row and column numbers for a given cell(node)
	static int[] rowNum = { -1, 0, 0, 1 };
	static int[] colNum = { 0, -1, 1, 0 };

	public static int BFS(int[][] mat, Point src, Point dest) {
		if (mat[src.row][src.col] != 1 || mat[dest.row][dest.col] != 1) {
			return -1;
		}
		
		boolean[][] visited = new boolean[ROW][COL];
		
		visited[src.row][src.col] = true;
		
		Queue<QueueNode> q = new LinkedList<>();
		
		QueueNode s = new QueueNode(src, 0);
		q.add(s);
		
		while (!q.isEmpty()) {
			QueueNode curr = q.peek();
			Point pt = curr.node;
			
			// if reached dest cell, were done
			if (pt.row == dest.row && pt.col == dest.col) {
				return curr.distance;
			}
			
			// otherwise dequeue front cell in queue and enqueue adjacent cells
			q.remove();
			for (int i = 0; i < 4; i++) {
				int row = pt.row + rowNum[i];
				int col = pt.col + colNum[i];
				
				// if adjacent cell is valid, has path(tile=1, not wall=0) and is not visited, enqueue
				if (isValid(row, col) && mat[row][col] == 1 && !visited[row][col]) {
					visited[row][col] = true;
					QueueNode Adjcell = new QueueNode(new Point(row, col), curr.distance + 1);
					q.add(Adjcell);
				}
			}
		}
		// return -1 if destination can't be reached
		return -1;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };

		Point source = new Point(0, 0);
		Point dest = new Point(3, 4);

		int dist = BFS(mat, source, dest);

		if (dist != -1) {
			System.out.println("Shortest Path is " + dist);
		} else {
			System.out.println("Shortest Path doesn't exist");
		}
	}
}
