package juneleetcodeProblem.DFS;

/*
695. Max Area of Island

You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
Example 2:

Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0


*/
import java.util.Stack;

public class MaxAreaINIsland {

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        int[] dx = new int[] { 1, 0, -1, 0 };
        int[] dy = new int[] { 0, 1, 0, -1 };
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !seen[i][j]) {
                    int shape = 0;
                    Stack<int[]> stack = new Stack();
                    stack.push(new int[] { i, j });
                    seen[i][j] = true;
                    while (!stack.empty()) {
                        int[] node = stack.pop();
                        int rowIndex = node[0];
                        int columnIndex = node[1];
                        shape++;
                        for (int k = 0; k < 4; k++) {
                            int nrow = rowIndex + dx[k];
                            int ncol = columnIndex + dy[k];
                            if (0 <= nrow && nrow < grid.length && 0 <= ncol && ncol < grid[0].length
                                    && grid[nrow][ncol] == 1 && !seen[nrow][ncol]) {
                                stack.push(new int[] { nrow, ncol });
                                seen[nrow][ncol] = true;
                            }
                        }
                    }
                    ans = Math.max(ans, shape);
                }

            }
        }
        return ans;

    }

}
