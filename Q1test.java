package csc.pa7.pa7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Q1test {
    @Test
    public void testRotate() {
        Q1 q1 = new Q1();

        // Test Case 1: Empty Matrix
        int[][] matrix1 = {};
        int[][] expected1 = {};
        q1.rotate(matrix1);
        assertArrayEquals(expected1, matrix1);
       

        // Test Case 2: Single Element Matrix
        int[][] matrix2 = {{1}};
        int[][] expected2 = {{1}};
        q1.rotate(matrix2);
        assertArrayEquals(expected2, matrix2);
      

        // Test Case 3: 2x2 Matrix
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int[][] expected3 = {{3, 1}, {4, 2}};
        q1.rotate(matrix3);
        assertArrayEquals(expected3, matrix3);
    

        // Test Case 4: 3x3 Matrix
        int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected4 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        q1.rotate(matrix4);
        assertArrayEquals(expected4, matrix4);
     

        // Test Case 5: 4x4 Matrix
        int[][] matrix5 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] expected5 = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        q1.rotate(matrix5);
        assertArrayEquals(expected5, matrix5);
  

        // Test Case 6: Matrix with Duplicate Values
        int[][] matrix6 = {{1, 2, 2}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected6 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 2}};
        q1.rotate(matrix6);
        assertArrayEquals(expected6, matrix6);
      
    }

    
}