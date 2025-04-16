package bai2_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Bai2_4 {
	public static int uocLeLonNhat(int n) { 
		int k = n; 
		while (k % 2 == 0) { 
		k = k / 2; 
		} 
		return k; 
		} 
		public static boolean laSoNguyenTo(int n) { 
		int i = 2; 
		while (n % i != 0) { 
		i++; 
		} 
		return ((i == n) ? true : false); 
		} 
		public static boolean laSoNguyenTo2(int n) { 
		for (int i = 2; i < n; i++) { 
		if (n % i == 0) 
		return false; 
		} 
		return true; 
		} 
		public static void timSoNguyenToNhoHon(int n) { 
		System.out.println("Cac so nguyen to nho hon " + n); 
		for (int i = 2; i <= n; i++) { 
		if (laSoNguyenTo(i)) System.out.print(i + " "); 
		} 
		System.out.println(); 
		} 
		public static void ptThuaSoNguyenTo(int n) { 
		System.out.println("Phan tich thua so cua " + n); 
		int k = n; 
		int i = 2; 
		while (k != 1) { 
		if (k % i == 0) { 
		System.out.print(i + " "); 
		k /= i; 
		} else i++; 
		} 
		} 
		@Test 
		public void testUocLeLN() { 
			assertEquals(uocLeLonNhat(27), 27); 
			assertEquals(uocLeLonNhat(14), 7); 
			assertEquals(uocLeLonNhat(12), 3); 
			assertEquals(uocLeLonNhat(8), 1); 
		} 
	
		   @Test 
		   public void testNguyenTo() { 
		      assertTrue(laSoNguyenTo(11)); 
		      assertFalse(laSoNguyenTo(100)); 
		      assertFalse(laSoNguyenTo(27)); 
		      assertTrue(laSoNguyenTo(7)); 
		      assertTrue(laSoNguyenTo(101)); 
		   } 
		 
		   public static void main(String[] args) { 
		      // cau A 
		      System.out.println("Uoc le lon nhat cua 25 la :" + uocLeLonNhat(25)); 
		      // cau C 
		      timSoNguyenToNhoHon(100); 
		      // cau D 
		      ptThuaSoNguyenTo(48); 
		   }
}
