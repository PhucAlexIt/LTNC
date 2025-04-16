package bai3_3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Bai3_3 {
//a) Xác định xem số x có xuất hiện trong dãy không?  
	public static boolean findNumArr(int a[], int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println("Có số " + a[i] +" xuất hiện trong dãy" );
				return true;
			}

		}
		System.out.println("Không có số xuất hiện");
		return false;
	}
// b) Cho biết số x xuất hiện trong dãy bao nhiêu lần? 
	public static int numAppear(int a[], int x) {
			int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				count++;
			}
		}
		System.out.print("Số lần số "+ x +" xuất hiện: ");
		return count;
	}
	
// c) Cho n số và số x. Loại bỏ khỏi dãy tất cả các phần tử bằng x. 

	public static int [] removeE(int a[], int x) {
		int len = 0;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != x) {
				len++;
			}
		}
		int newArr[] = new int[len];
		for (int j = 0; j < a.length; j++) {
			if(a[j] != x) {
				newArr[index++] = a[j];
			}
		}
		System.out.println("Số "+x+" bị loại bỏ");
     	return newArr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số mảng: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Nhập các dãy số của mảng: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//a)
		System.out.println("Xác định xem số x có xuất hiện trong dãy không");
		findNumArr(arr, 4);
		//b)
		System.out.println("Cho biết số x xuất hiện trong dãy bao nhiêu lần?");
		System.out.println(numAppear(arr, 4));
		// c)
		System.out.println("Cho n số và số x. Loại bỏ khỏi dãy tất cả các phần tử bằng x.");
		System.out.println(Arrays.toString(removeE(arr, 4)));

	}

	@Test
	public void checkfindNumArr() {
		int arr[] = { 5, 6, 7, 5,2 };
		int arr2[] = {6,7,1,1,-9,1};
		assertTrue(findNumArr(arr, 5));
		assertFalse(findNumArr(arr2, 0));
	}
	public void checknumAppear() {
		int arr[] = { 5, 6, 7, 5,2 };
		int arr2[] = {6,7,1,1,-9,1};
		assertEquals(numAppear(arr2, 1), 3);
		assertEquals(numAppear(arr, 5), 2);
	}
		public void checkremoveE() {
			int arr[] = { 5, 6, 7, 5,2 };
			int arr2[] = {6,7,1,1,-9,1};
			assertArrayEquals(removeE(arr, 5), new int [] {6,7,2});
			assertArrayEquals(removeE(arr2, 1), new int [] {6,7,-9});
		}
	
}
