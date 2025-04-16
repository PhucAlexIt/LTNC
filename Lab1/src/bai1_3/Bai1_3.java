package bai1_3;

import java.util.Scanner;

public class Bai1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so giay: ");
		int second = sc.nextInt();
		
		int hour = second / 3600;
		second = second % 3600;
		int minute = second / 60;
		second = second % 60;
		
		
	      System.out.println(hour + ":" + minute + ":" + second); 

	
}
}
