package bai3_6;

import java.util.Scanner;

public class Bai3_6 {
	//Tìm các phần tử xuất hiện đúng một lần trong dãy. 
	public static void firstAppearArr(int a[]){
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j] ) {
					count++;
				}
				
			}
			if(count == 1) {
				System.out.println("Số xuất hiện một lần: "+a[i]+"");
			}
		}
	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số mảng: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Nhập các dãy số của mảng: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Tìm các phần tử xuất hiện đúng một lần trong dãy.");
		firstAppearArr(arr);

	}
}
