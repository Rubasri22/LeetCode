import java.util.*;

public class Solution {
    private int rows, cols;

    public int minDays(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        // If grid is already disconnected or has only one cell.
        if (countIslands(grid) != 1) {
            return 0;
        }

        // Try changing each land cell to water and see if it disconnects the island.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (countIslands(grid) != 1) {
                        return 1;
                    }
                    grid[i][j] = 1;
                }
            }
        }

        // If changing one cell doesn't disconnect the grid, return 2.
        return 2;
    }

    private int countIslands(int[][] grid) {
        boolean[][] visited = new boolean[rows][cols];
        int islands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0 || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        int[] directions = {-1, 0, 1, 0, -1};
        for (int d = 0; d < 4; d++) {
            dfs(grid, visited, i + directions[d], j + directions[d + 1]);
        }
    }
 
}

