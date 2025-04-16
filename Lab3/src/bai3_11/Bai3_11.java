package bai3_11;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Bai3_11 {
	/*
	 Cho ma trận vuông cấp n gồm các số nguyên.
	 a) Cho ma trận vuông A cấp n gồm các số. Tìm ma trận chuyển vị của A.
	 */
	
	public static int[][] TransposeMatrix(int[][] A) {
	    int n = A.length;
	    int[][] transpose = new int[n][n];
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            transpose[j][i] = A[i][j];
	        }
	    }
	    
	    return transpose;
	}
	public static void printMatrix(int[][] matrix) {
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
	    int[][] A = {
	        {1, 2, 3, 9},
	        {4, 5, 6, 7},
	        {-19,-6,-3,0},
	        {65,11,99,100}

	    };
	    
	    System.out.println("Ma trận A:");
	    printMatrix(A);
	    
	    int[][] transpose = TransposeMatrix(A);
	    
	    System.out.println("Ma trận chuyển vị của A:");
	    printMatrix(transpose);
	}
	@Test
	public void checkTransposeMatrix() {
		int arr[][] = {{1,2},{3,4}};
		int arr2[][] = {{5,6,7},{8,5,0},{4,-9,-5}};
		assertArrayEquals(TransposeMatrix(arr), new int [][]{{1,3},{2,4}});
		assertArrayEquals(TransposeMatrix(arr2), new int [][]{{5,8,4},{6,5,-9},{7,0,-5}});


	}

}
