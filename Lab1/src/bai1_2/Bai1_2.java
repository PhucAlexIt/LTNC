package bai1_2;

import java.util.Scanner;

public class Bai1_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhập số đo của góc: ");
		double degress = in.nextDouble();
		
		// đổi radian
		double radians = Math.toRadians(degress);
		// tính sin
		double sinVal = Math.sin(radians);
		// tính cos
		double cosVal = Math.cos(radians);
		// tính tan
		double tanVal = Math.tan(radians);
		// tính cotan
		double cotVal = 1/Math.tan(radians);
		
		// Kết quả
		System.out.println("Gia trị của góc Radian là: "+radians);
		System.out.println("Gía trị của sin là: "+sinVal);
		System.out.println("Gía trị của cos là: "+cosVal);
		System.out.println("Gía trị của tan là: "+tanVal);
		System.out.println("Gía trị của cot là: "+cotVal);

	}
}
