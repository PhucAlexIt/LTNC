package bai3_4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Bai3_4 {
	//Kiểm tra xem dãy có tăng dần hay không.
	public static boolean isAscending(int[] a) {
		boolean test = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				test = false;
				break;
			}
		}
		return test;
	}
// Sắp xếp dãy theo thứ tự tăng dần.
	public static int[] sort(int a[]) {
		int[] arr = a.clone();
		for (int i = 0; i < arr.length; i++) {
			int k = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[k]) {
					k = j;
				}
			int x = arr[i];
			arr[i] = arr[k];
			arr[k] = x;
		}
		return arr;
	}


	@Test
	public void testIsAscending() {
		assertTrue(isAscending(new int[] { 2, 3, 5, 10, 11, 11, 15, 19 }));
		assertFalse(isAscending(new int[] { 6, -2, 8, 3, 5, -10, -3 }));
	}

	@Test
	public void testSort() {
		int[] a = { 9, 3, 5, 10, 7, 15, 12, 6 };
		int[] b = { 6, -2, 8, 14, 3, 5, -10, -6 };
		assertArrayEquals(sort(a), new int[] { 3, 5, 6, 7, 9, 10, 12, 15 });
		assertArrayEquals(sort(b), new int[] { -10, -6, -2, 3, 5, 6, 8, 14 });
	}

}
