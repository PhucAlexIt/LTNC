package bai2_1;

import java.util.Scanner;

public class Bai2_1 {
	private int n;

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so:");
		n = in.nextInt();
	}

	public int countDigit() {
		int count = 0;
		int t = n;
		do {
			t = t / 10;
			count++;
		} while (t != 0);
		return count;
	}

	public int revert() {
		int result = 0;
		int t = n;
		while (t != 0) {
// lay chu so cuoi cung
			int du = t % 10;
// noi du vao cuoi result
			result = result * 10 + du;
// bo bot chu so cuoi cua t
			t = t / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Bai2_1 countNumber = new Bai2_1();
		countNumber.input();
		System.out.println("So chu so la " + countNumber.countDigit());
		System.out.println("So dao nguoc la " + countNumber.revert());
	}
}
