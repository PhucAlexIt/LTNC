package bai3_10;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Bai3_10 {
	public static boolean isUpperTriangular(int[][] a) {
		boolean check1 = false;
		for (int i = 0; i < a.length; i++)
			if (a[i][i] != 0) {
				check1 = true;
				break;
			}
		boolean check2 = true;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < i; j++)
				if (a[i][j] != 0) {
					check2 = false;
					break;
				}
		return check1 && check2;
	}

	// Kiểm tra ma trận có đối xứng qua đường chéo chính
	// a[i][j] == a[j][i] với mọi i, j
	public static boolean isDiagonallySymmetric(int[][] a) {
		boolean check = true;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < i; j++)
				if (a[i][j] != a[j][i]) {
					check = false;
					break;
				}
		return check;
	}

	// Kiểm tra ma trận có đối xứng qua tâm
	// a[i][j] == a[len-i-1][len-j-1] với mọi i, j
	public static boolean isCenterSymmetric(int[][] a) {
		boolean check = true;
		int n = a.length;
		for (int i = 0; i < n; i++)
			for (int j = 0; j <= i; j++)
				if (a[i][j] != a[n - i - 1][n - j - 1]) {
					check = false;
					break;
				}
		return check;
	}

	@Test
	public void testIsUpperTriangular() {
		int[][] a = { { 8, 2, 7 }, { 3, 7, 2 }, { 4, 5, 2 } };
		int[][] b = { { 2, 1, 3, 4 }, { 0, 8, 7, 3 }, { 0, 0, 2, 8 }, { 0, 0, 0, 1 } };

		assertFalse(isUpperTriangular(a));
		assertTrue(isUpperTriangular(b));
	}

	@Test
	public void testIsDiagonallySymmetric() {
		int[][] a = { { 8, 3, 4 }, { 3, 7, 5 }, { 4, 5, 2 } };
		int[][] b = { { 2, 1, 3, 4 }, { 0, 8, 7, 3 }, { 0, 0, 2, 8 }, { 0, 0, 0, 1 } };

		assertTrue(isDiagonallySymmetric(a));
		assertFalse(isDiagonallySymmetric(b));
	}

	@Test
	public void testIsCenterSymmetric() {
		int[][] a = { { 8, 3, 4 }, { 3, 7, 5 }, { 4, 5, 2 } };
		int[][] b = { { 2, 1, 3, 4 }, { 8, 8, 7, 3 }, { 3, 7, 8, 8 }, { 4, 3, 1, 2 } };

		assertFalse(isCenterSymmetric(a));
		assertTrue(isCenterSymmetric(b));
	}

}
