package bai3_2;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Bai3_2 {
	public static int[] revert (int a[]) {
		int r [] = a.clone();
		int n = r.length;
		for(int i = 0; i < n/2; i++) {
			int temp = r[i];
			r[i] = r[n-i-1];
			r[n-i-1] = temp;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số mảng: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Nhập các phần tử của mảng: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Mảng ban đầu: "+Arrays.toString(arr));
	
		System.out.println("Mảng đổi chiều: "+Arrays.toString(revert(arr)));

		
	}
	@Test
	public void testArrayRev() {
		int arr [] = {1,2,3,4};
		assertArrayEquals(revert(arr), new int [] {4,3,2,1});
	}
	
}
