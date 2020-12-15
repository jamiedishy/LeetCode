package easy;

import java.util.*;

public class FloodFill {

	public static class Coordinate {
		int row;
		int col;

		public Coordinate(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Coordinate first = new Coordinate(sr, sc);
        int[][] direction = {{-1,0},{0,-1},{0,1},{1,0}};
        Queue<Coordinate> queue = new LinkedList<>();
        HashSet<Coordinate> visitedCoordinateSet  = new HashSet<>();
        
        int referenceColour = image[first.row][first.col];
        
        image[first.row][first.col] = newColor;
        queue.add(first);
        visitedCoordinateSet.add(first);
        
        while (!queue.isEmpty()) {
            Coordinate coord = queue.remove();
            
            for (int i = 0; i < direction.length; i++) {
                Coordinate neighbour = new Coordinate(coord.row + direction[i][0], coord.col + direction[i][1]);
                if (neighbour.row >= 0 && neighbour.row < image.length && neighbour.col >= 0 && neighbour.col < 3) {
                    if (image[neighbour.row][neighbour.col] == referenceColour && !visitedCoordinateSet.contains(neighbour)) {
                        image[neighbour.row][neighbour.col] = newColor;
                        queue.add(neighbour);
                        visitedCoordinateSet.add(neighbour);
                    }
                }
            }
        }
        return image;
    }

	public static void main(String[] args) {
    	int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
    	int sr = 1;
    	int sc = 1;
    	int newColor = 2;
    	
    	int[][] result = (floodFill(image, sr, sc, newColor));
    	
    	for (int i = 0; i < result.length; i++) {
    		System.out.println(Arrays.toString(result[i]));
    	}
    	
//    	bug: [[0,0,0],[0,1,1]], 1, 1, 1

    }
}
