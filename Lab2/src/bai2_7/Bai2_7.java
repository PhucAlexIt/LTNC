package bai2_7;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Bai2_7 {
	public static int Fibo(int n) {
		int a = 1, b = 1;
		
		if(n <= 1) {
			return 1;
		}
		
		for (int i = 2; i < n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
	@Test
	public void testFibo() {
		assertEquals(Fibo(3), 2);
		assertEquals(Fibo(7), 13);
		assertEquals(Fibo(5), 5);

	}
	public static void main(String[] args) {
		System.out.println(Fibo(3));
		System.out.println(Fibo(7));
		System.out.println(Fibo(5));


	}
}
