package bai1_9;

import java.util.Scanner;

public class Bai1_9 {
	 public static void main(String[] args) { 
	      Scanner in = new Scanner(System.in); 
	      System.out.print("Nhap a1 va b1: "); 
	      int a1 = in.nextInt(); 
	      int b1 = in.nextInt(); 
	      System.out.print("Nhap a2 va b2: "); 
	      int a2 = in.nextInt(); 
	      int b2 = in.nextInt(); 
	 
	      int d1 = a1 < a2 ? a2 : a1; 
	      int d2 = b1 < b2 ? b1 : b2; 
	 
	      if (d1 <= d2) 
	         System.out.println("Doan chung la [" + d1 + "," + d2 + "]"); 
	      else 
	         System.out.println("Doan chung la []"); 
	   } 
	
}
