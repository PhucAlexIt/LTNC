package bai1_4;

import java.util.Scanner;

public class Bai1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều cao: ");
		double h = sc.nextDouble();
		final double G = 10.0;
		
		//tính thời gian:
		double t = Math.sqrt((2*h)/G);
		// tính vận tốc
		double v = G * t;
		
		System.out.println("Kết quả thời gian: "+t);
		System.out.println("Kết quả Vận tốc: "+v);

		
		
		
		
	}
}
