package bai1_1;

import java.util.Scanner;

public class Bai1_1 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Nhập bán kính hình tròn: ");
		double r = sc.nextDouble();
		
		double d = 2 * Math.PI * r;
		double s = Math.PI * r * r;
		
		System.out.println("Chu vi la: "+d);
		System.out.println("Dien tich la: "+s);
	}
}
