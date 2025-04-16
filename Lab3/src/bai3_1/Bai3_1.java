package bai3_1;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class Bai3_1 {
// tim phan tu lon nhat trong mang a
	public static int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

// tim vi tri phan tu lon nhat trong mang a
	public static int maxpos(int[] a) {
		int iMax = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[iMax] < a[i])
				iMax = i;
		}
		return iMax;
	}

// tim phan tu nho nhat trong mang a
	public static int min(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

// tinh tong cac phan tu trong mang a
	public int sum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap chieu dai day: ");
		int n = in.nextInt();
		int[] intArr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu [" + i + "] = ");
			intArr[i] = in.nextInt();
		}
		System.out.println("Gia tri lon nhat la : " + max(intArr));
		System.out.println("Vi tri phan tu co gia tri lon nhat la : " + maxpos(intArr));
		System.out.println("Gia tri nho nhat la : " + min(intArr));
	}

	@Test
	public void testIntArray() {
		int[] a = { 9, 3, 5, 10, 7, 15, 12, 6 };
		int[] b = { 6, -2, 8, 14, 3, 5, -10, -6 };
		assertEquals(max(a), 15);
		assertEquals(maxpos(a), 5);
		assertEquals(max(b), 14);
		assertEquals(maxpos(b), 3);
		assertEquals(min(a), 3);
		assertEquals(min(b), -10);
		assertEquals(sum(a), 67);
		assertEquals(sum(b), 18);
	}
}
