package bai3_12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Bai3_12 {
	// Cho ma trận vuông A cấp n gồm các số nguyên. Tính tổng từng dòng của ma trận và tìm dòng có tổng lớn nhất.
	public static int sumRowMatrix(int a [][]){
			int n = a.length;
			int maxSum = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				int rowSum = 0;

				for (int j = 0; j < n; j++) {
					rowSum+= a[i][j];
				}
				System.out.println("Tổng dòng thứ "+i+":"+rowSum);
				
				if(rowSum > maxSum) {
					maxSum = rowSum;
				}
			}
			return maxSum;
	}
	public static void main(String[] args) {
			int arr [][] = {{1,2,3},{9,9,9},{7,-1,0}};
			System.out.println("Tổng có dòng lớn nhất là: "+sumRowMatrix(arr));
			
	}
	@Test
	public void testMatrix() {
		int arr[][] = {{1,2},{3,4}};
		int arr2[][] = {{9,9,9},{10,5,5},{0,0,1}};

		assertEquals(sumRowMatrix(arr), 7);
		assertEquals(sumRowMatrix(arr2), 27);

	}
}
