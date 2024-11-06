package csc.pa7.pa7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Q2test {

    @Test
    void testNumIslands1() {
        Q2 q2 = new Q2();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, q2.numIslands(grid1));
    }

    // Add similar @Test methods for other test cases
    @Test
    void testNumIslands2() {
        Q2 q2 = new Q2();
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, q2.numIslands(grid2));
    }
    @Test
    void testNumIslands3() {
        Q2 q2 = new Q2();
        char[][] grid3 = new char[0][0]; // Fix: Declare as a completely empty grid
        assertEquals(0, q2.numIslands(grid3));
    }
    @Test
    void testNumIslands4() {
        Q2 q2 = new Q2();
        char[][] grid4 = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertEquals(0, q2.numIslands(grid4));

    }
    @Test
    void testNumIslands5() {
        Q2 q2 = new Q2();
        char[][] grid5 = {
                {'0', '0', '0'},
                {'0', '1', '0'},
                {'0', '0', '0'}
        };
        assertEquals(1, q2.numIslands(grid5));
    }
}