package bai3_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Bai3_5 {
	//Kiểm tra xem dãy có đối xứng hay không
	public static boolean checkArrSymmetry(int a[]) {
		int n = a.length;
		for (int i = 0; i < n/2; i++) {
			if(a[i] != a[n-i-1]) {
				return false;
			}
		}
		return true;
	}
	//Kiểm tra xem dãy có đan dấu hay không.
	public static boolean isDanDau(int a[]) {
		if (a.length < 2) {
			return false;
		}
		for (int i = 1; i < a.length; i++) {
			if((a[i] >= 0 && a[i-1] >= 0) || (a[i] < 0 && a[i-1] <0 )) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("Nhập số mảng: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Nhập số cho mảng: ");
		int arr [] = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("a) Kiểm tra xem dãy có đối xứng hay không");
		System.out.println(checkArrSymmetry(arr));
		System.out.println("b) Kiểm tra xem dãy có đan dấu hay không");
		System.out.println(isDanDau(arr));

	}
	@Test
	public void checkArrSymmetry() {
		int newArr[] = {1,2,3,3,2,1};
		int newArr2[] = {-1,-2,0,99,-80};

		assertEquals(checkArrSymmetry(newArr), true);
		assertEquals(checkArrSymmetry(newArr2), false);
	
	}
	public void checkisDanDau() {
		int newArr[] = { 2,  -1,  7,  -3,  4,  -5,  6};
		int newArr2[] = {-1,-2,0,99,-80};
		assertEquals(isDanDau(newArr), true);
		assertEquals(isDanDau(newArr2), false);
	}

}
