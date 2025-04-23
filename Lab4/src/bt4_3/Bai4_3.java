package bt4_3;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Bai4_3 {
	 static final int K = 3; 
	 
	   public static String encode(String s) { 
	      StringBuffer result = new StringBuffer(); 
	      for (int i = 0; i < s.length(); i++) { 
	         char ch = s.charAt(i); 
	         if (Character.isLetter(ch)) { 
	            if (Character.isUpperCase(ch)) 
	               result.append((char) ('A' + (ch - 'A' + K) % 26)); 
	            else 
	               result.append((char) ('a' + (ch - 'a' + K) % 26)); 
	         } else if (Character.isDigit(ch)) 
	            result.append((char) ('0' + (ch - '0' + K) % 10)); 
	         else 
	            result.append(ch); 
	      } 
	      return result.toString(); 
	   } 
	 
	   public static String decode(String s) { 
	      StringBuffer result = new StringBuffer(); 
	      for (int i = 0; i < s.length(); i++) { 
	         char ch = s.charAt(i); 
	         if (Character.isLetter(ch)) { 
	            if (Character.isUpperCase(ch)) 
	               result.append((char) ('A' + (ch - 'A' - K + 26) % 26)); 
	            else 
	               result.append((char) ('a' + (ch - 'a' - K + 26) % 26)); 
	         } else if (Character.isDigit(ch)) 
	            result.append((char) ('0' + (ch - '0' - K + 10) % 10)); 
	         else 
	            result.append(ch); 
	      } 
	      return result.toString(); 
	   } 
	 
	   @Test 
	   public void testEncode() { 
	      assertEquals(encode("Cong nghe Thong Tin 2001."), "Frqj qjkh Wkrqj Wlq 5334."); 
	      assertEquals(encode("Dai hoc Nong Lam TP Ho Chi Minh 2025."),  
	                           "Gdl krf Qrqj Odp WS Kr Fkl Plqk 5358."); 
	   } 
	 
	   public static void main(String[] args) { 
	      Scanner in = new Scanner(System.in); 
	      System.out.println("Nhap chuoi : "); 
	      String str = in.nextLine(); 
	      String encodeStr = encode(str); 
	String decodeStr = decode(encodeStr); 
	System.out.println("Chuoi ma hoa la : " + encodeStr); 
	System.out.println("Chuoi giai ma la : " + decodeStr); 
	} 
} 


