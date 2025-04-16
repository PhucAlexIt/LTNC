package bai1_5;

import java.util.Scanner;

public class Bai1_5 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Nhập toạ độ xA: ");
		double xA = sc.nextDouble();
		System.out.println("Nhập toạ độ xB: ");
		double  xB = sc.nextDouble();
		System.out.println("Nhập toạ độ yA: ");
		double  yA = sc.nextDouble();
		System.out.println("Nhập toạ độ yB: ");
		double yB = sc.nextDouble();
		
		
		// tính d
		double d = Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
		


		System.out.println("Kết quả của d là: "+d);
		
	}
}
