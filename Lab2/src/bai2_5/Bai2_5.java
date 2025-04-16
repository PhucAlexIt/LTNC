package bai2_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Bai2_5 {
	public static String convertToBinary(int n) {
		if (n == 0) {
			return "0";
		}
		String res = "";
		while (n > 0) {
			res = (n % 2) +  res;
			n/= 2;
			
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(convertToBinary(35));
		System.out.println(convertToBinary(2));

	}
	 @Test
	 public void testBinary() {
		 assertEquals(convertToBinary(35), "100011");
		 assertEquals(convertToBinary(2), "10");

	 }
}
