package Bai1_11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Bai1_11 {
	public static String checkTriangle(int a, int b, int c) {
		if(a + b < c || a + c < b || b + c < a) {
			return "Không phải tam giác";
		}
		
		if(Math.pow(a, 2)  == Math.pow(b, 2) + Math.pow(c,2) ||
		   Math.pow(c, 2)  == Math.pow(b, 2) + Math.pow(a,2) ||
		   Math.pow(b, 2)  == Math.pow(a, 2) + Math.pow(c,2)) {
			return "Tam giác vuông";			
		}else if(a == b && a == c) {
			return "Tam giác đều";
		}else if(a == b || b == c || a == c) {
			return "Tam giác cân";
		}
		return "Tam giác thường";
	}
	@Test
	void triangle() {
		assertEquals("Tam giác đều", Bai1_11.checkTriangle(2, 2, 2));
		assertEquals("Tam giác cân", Bai1_11.checkTriangle(2, 5, 5));
		assertEquals("Không phải tam giác", Bai1_11.checkTriangle(0, 1, 2));
		assertEquals("Tam giác vuông", Bai1_11.checkTriangle(4, 3, 5));
	}

}
