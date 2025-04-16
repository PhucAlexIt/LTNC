package bai1_8;

import java.util.Scanner;

public class Bai1_8 {
	public static void main(String[] args) { 
	      float a, b, c, x1, x2; 
	 
	      // Nhap du lieu 
	      Scanner in = new Scanner(System.in); 
	      System.out.print("Hay so cac he so a, b, c:"); 
	      a = in.nextFloat(); 
	      b = in.nextFloat(); 
	      c = in.nextFloat(); 
	 
	      if (a == 0) { 
	         System.out.println("Day la phuong trinh bac 1"); 
	         if (b != 0) { 
	            System.out.println("Nghiem cua phuong trinh x = " + -c / b); 
	         } else if (c != 0) { 
	            System.out.println("Phuong trinh vo nghiem"); 
	         } else { 
	            System.out.println("Phuong trinh co vo so nghiem"); 
	         } 
	      } else { // a !=0 
	         float delta = b * b - 4 * a * c; 
	         if (delta < 0) { 
	            System.out.println("Phuong trinh vo nghiem"); 
	         } else if (delta == 0) { 
	            System.out.println("Phuong trinh co nghiem kep x=" + -b/(2*a)); 
	         } else { 
	            x1 = (-b + (float) Math.sqrt(delta)) / (2 * a); 
	            x2 = (-b - (float) Math.sqrt(delta)) / (2 * a); 
	            System.out.println("Phuong trinh có 2 nghiem"); 
	            System.out.println("x1 = " + x1); 
	            System.out.println("x2 = " + x2); 
	         } 
	      } 
	   } 
}
