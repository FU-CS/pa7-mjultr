package csc.pa7.pa7;

public class Q2 {
    int row = 0;
    int col = 0;

    public int numIslands(char[][] grid) {
        
        int count = 0;
        // checking if the grid is empty
        if (grid == null || grid.length == 0 || (grid.length > 0 && grid[0].length == 0)) {
            return 0; // Return 0 if the grid is empty
        }

        row = grid.length;
        col = grid[0].length; // This line might still cause the exception for empty grids


        // Iterate through each cell of the grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // If a cell is '1' (land), it's the start of a new island
                if (grid[i][j] == '1') {
                    // Perform Depth-First Search (DFS) to mark all connected land cells
                    dfs(grid, i, j);
                    // Increment the island count
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        // Out of bound check;
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != '1') {
            return;
        }
        // Mark the cell as visited
        grid[i][j] = '2';
        // DFS in all four directions
        dfs(grid, i, j - 1); // left
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i + 1, j); // down
    }
    public static void main(String[] args) {
        Q2 q2 = new Q2();
 
        // Test case 1
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int numIslands1 = q2.numIslands(grid1);
        System.out.println("Number of islands in grid1: " + numIslands1); // Expected output: 1
 
        // Test case 2
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int numIslands2 = q2.numIslands(grid2);
        System.out.println("Number of islands in grid2: " + numIslands2); // Expected output: 3
    }
}
