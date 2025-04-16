package bai3_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Bai3_9 {
	//Tìm phần tử lớn nhất và nhỏ nhất của ma trận. 
	public static int findMaxMatrix(int a[][]){
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		return max;
	}
	
	public static int findMinMatrix(int a[][]){
		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		return min;
	}
	
	//Tính tổng các phần tử của ma trận. 
	public static int sumMatrix(int a[][]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr [][] = {{1,2,3},{4,5,6}};
		System.out.println("phần tử lớn nhất mảng 2 chiều: "+findMaxMatrix(arr));
		System.out.println("phần tử nhỏ nhất mảng 2 chiều: "+findMinMatrix(arr));
		System.out.println("tổng các phần tử của ma trận: "+sumMatrix(arr));


	}
	@Test
	public void checkMaxMin() {
		int[][] a = { { 8, 2, 7 }, { 3, 7, 2 }, { 4, 5, 2 } };
		int[][] b = { { 2, 1, 3, 4 }, { 0, 8, 7, 3 }, { 0, 0, 2, 8 }, { 0, 0, 0, 1 } };
		assertEquals(findMaxMatrix(a), 8);
		assertEquals(findMinMatrix(b), 0);

	}
	
	@Test
	public void checkSum() {
		int[][] a = { { 8, 2, 7 }, { 3, 7, 2 }, { 4, 5, 2 } };
		int[][] b = { { 2, 1, 3, 4 }, { 0, 8, 7, 3 }};
		assertEquals(sumMatrix(a), 40);
		assertEquals(sumMatrix(b), 28);

	}
}
