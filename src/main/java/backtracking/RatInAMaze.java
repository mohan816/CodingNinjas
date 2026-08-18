package backtracking;

public class RatInAMaze {
	
	/*
	 * 1) We have to find is there any way to reach the destination from start. Start is 0 * 0 and destination
	 * is (n - 1) * (n - 1). If the cell is value 1, then we can proceed further if not we have to go the
	 * previous state
	 * 2) We can travel all the four directions, if traveling in one direction is not possible then we can go the
	 * previous state and try other three directions. 
	 * 3) If it's possible to reach the destination then return true, if not return false
	 */
    
	
	public static boolean ratInMaze(int[][] maze) {
		int[][] path = new int[maze.length][maze.length];
		return solveMaze(maze, 0, 0, path);
	}
	
	public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
		if(i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1)
			    return false;
		path[i][j] = 1;
		if(i == maze.length - 1 && j == maze.length - 1) {
			for(int r = 0; r < maze.length; r++) {
				for(int c = 0; c < maze.length; c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			return true;
		}
		if(solveMaze(maze, i - 1, j, path))
			return true;
		if(solveMaze(maze, i, j + 1, path))
			return true;
		if(solveMaze(maze, i + 1, j, path))
			return true;
		if(solveMaze(maze, i, j - 1, path))
			return true;
		return false;	
	}
	
	public static void printAllPossiblePaths(int[][] maze, int i, int j, int[][] path) {
		if(i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1)
			    return;
		path[i][j] = 1;
		if(i == maze.length - 1 && j == maze.length - 1) {
			for(int r = 0; r < maze.length; r++) {
				for(int c = 0; c < maze.length; c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}
		printAllPossiblePaths(maze, i - 1, j, path);
		printAllPossiblePaths(maze, i, j + 1, path);
		printAllPossiblePaths(maze, i + 1, j, path);
		printAllPossiblePaths(maze, i, j - 1, path);
		path[i][j] = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] maze = {{1,1,0}, {1,1,0}, {1,1,1}};
       // System.out.println(ratInMaze(maze));
        int[][] path = new int[maze.length][maze.length];
        printAllPossiblePaths(maze, 0, 0, path);
	}

}
