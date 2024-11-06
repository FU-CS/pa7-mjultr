package csc.pa7.pa7;

public class Q3 {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int row;
    int col;

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        row = grid.length;
        col = grid[0].length;
        int maxArea = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, bfs(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    private int bfs(int[][] grid, int i, int j) {
        // If out of bounds or not land, return 0
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 1) {
            return 0;
        }

        // Mark current cell as visited (water)
        grid[i][j] = 0;
        int area = 1;  // Initialize area for this island

        // Explore adjacent cells in all four directions
        for (int[] dir : DIRECTIONS) {
            area += bfs(grid, i + dir[0], j + dir[1]);
        }

        return area;  // Return the total area of this island
    }
    public static void main(String[] args) {
        Q3 q3 = new Q3();

        // Test case 1: Empty grid
        int[][] grid1 = {};
        int maxArea1 = q3.maxAreaOfIsland(grid1);
        System.out.println("Max area of island in grid1: " + maxArea1); // Expected: 0

        // Test case 2: Single island
        int[][] grid2 = {{1, 1}, {1, 0}};
        int maxArea2 = q3.maxAreaOfIsland(grid2);
        System.out.println("Max area of island in grid2: " + maxArea2); // Expected: 3

        // Test case 3: Multiple islands
        int[][] grid3 = {{0, 1, 0, 1, 0},
                         {1, 1, 0, 1, 1},
                         {0, 0, 1, 0, 0},
                         {1, 0, 1, 1, 0}};
        int maxArea3 = q3.maxAreaOfIsland(grid3);
        System.out.println("Max area of island in grid3: " + maxArea3); // Expected: 5
    }
}
