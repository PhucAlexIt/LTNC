package bai3_7;

import static org.junit.Assert.assertArrayEquals;

import java.util.Vector;

import org.junit.jupiter.api.Test;

public class Bai3_7 {
	public static int[] distinctElements(int[] a) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			int count = 0;
			for (int j = i; j >= 0; j--) {
				if (x == a[j])
					count++;
			}
			if (count == 1)
				v.add(x);
		}
		int[] result = new int[v.size()];
		for (int i = 0; i < v.size(); i++) {
			result[i] = v.elementAt(i);
		}
		return result;
	}

	// Sắp xếp mảng a
	public static int[] sort(int a[]) {
		int[] arr = a.clone();
		for (int i = 0; i < arr.length; i++) {
			int k = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[k])
					k = j;
			int x = arr[i];
			arr[i] = arr[k];
			arr[k] = x;
		}
		return arr;
	}

	@Test
	public void testDistinctElements() {
		int[] a = { 8, 2, 7, 3, 7, 2, 4, 5, 2, 4 };
		int[] b = { -2, 1, 3, -8, 1, 3, -2, -8, 1 };
		assertArrayEquals(distinctElements(a), new int[] { 8, 2, 7, 3, 4, 5 });
		assertArrayEquals(sort(distinctElements(a)), new int[] { 2, 3, 4, 5, 7, 8 });
		assertArrayEquals(distinctElements(b), new int[] { -2, 1, 3, -8 });
		assertArrayEquals(sort(distinctElements(b)), new int[] { -8, -2, 1, 3 });
	}

}
