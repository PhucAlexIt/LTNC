package bai3_13;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Bai3_13 {
	
	//Cho 2 ma trận vuông A và B cấp n gồm các số thực.
	// a) Tính ma trận tổng C = A + B. Ma trận tổng được tính theo công thức: Cij = Aij + Bij.
	  public static int[][] sumTwoMatrix(int a[][], int b[][]) {
	        int n = a.length;
	        int[][] c = new int[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < c.length; j++) {
	                c[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        return c;
	    }
		//b) Tính ma trận hiệu D = A - B. Ma trận hiệu được tính theo công thức: Dij = Aij – Bij.

	  public static int[][] subTwoMatrix(int a[][], int b[][]) {
	        int n = a.length;
	        int[][] c = new int[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < c.length; j++) {
	                c[i][j] = a[i][j] - b[i][j];
	            }
	        }
	        return c;
	    }
	  
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int arr[][] = {{1, 2}, {5, 6}};
	        int arr2[][] = {{1, 6}, {4, 4}};

	        int[][] resultSum = sumTwoMatrix(arr, arr2);
	        int[][] resultSub = subTwoMatrix(arr, arr2);



	        System.out.println("Ma trận tổng:");
	        printMatrix(resultSum);
	        
	        System.out.println("Ma trận hiệu:");
	        printMatrix(resultSub);
	    }
	    
	    @Test
	    public void testSumMatrix() {
	    	int arr [][] = {{1,2},{4,5}};
	    	int arr2 [][] = {{1,1},{2,2}};
	    	
	    	assertArrayEquals(sumTwoMatrix(arr, arr2), new int [][] {{2,3},{6,7}});


	    }
	    
	    public void testSubMatrix() {
	    	int arr [][] = {{1,2},{4,5}};
	    	int arr2 [][] = {{1,1},{2,2}};
	    	assertArrayEquals(subTwoMatrix(arr, arr2), new int [][] {{0,1},{2,3}});


	    }

	

}
