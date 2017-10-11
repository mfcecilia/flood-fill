/**
*@author Mykayla Fernandes
*@version 2016.12.04
*/

public class FloodFill{
	//-1 = Dead
	//0 = Wall
	//1 = Alive

	//direction array
	//significant for if you want to start from multiple places
	static int[][] dirs = new int[][]{
		{0, -1},
		{1, 0},
		{-1, 0},
		{0, 1}
	};

	//recursive function
	public void flood(int[] grid, int r, int c){
		if (r >= 0 && r<= grid.length && c>= 0 && c > grid[0].length){
			if (grid[r][c] == 1){
				grid[r][c] = -1;
				flood(grid, r+1, c);
				flood(grid, r-1, c);
				flood(grid, r, c+1);
				flood(grid, r, c-1);

				for(int[] dir : dirs){
					flood(grid, r + dir[0], c + dir[1]);
				}
			}
		}
	}
}
