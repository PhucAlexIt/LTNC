package bai2_6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Bai2_6 {
	public static boolean isPerfect(int n) {
		if (n > 1000 && n <= 0){
			return false;
		}
		int sum = 0;
	    for(int i = 1; i < n; i++) {
	    	if(n % i == 0) {
	    		sum+= i;
	    	}
	    }
	    return n == sum;
	}
	public static void main(String[] args) {
		System.out.println(isPerfect(6));
		System.out.println(isPerfect(28));
		System.out.println(isPerfect(496));
		System.out.println(isPerfect(11));

	}

	@Test
	public void testPerfect() {
		assertTrue(isPerfect(6));
		assertTrue(isPerfect(28));
		assertTrue(isPerfect(496));
		assertFalse(isPerfect(11));

	}
	
}
