package bai2_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Bai2_3 {
	public int checkGCD(int x, int y) {
	   while (x != y) {
				if (x > y) {
					x = x - y;
				} else if (x < y) {
					y = y - x;
			}
		}
		return x;
	}
	public int checkBCNN(int x, int y) {
		return (x * y) / checkGCD(x, y);
	}


	@Test
	public void testGDC() {
		assertEquals(checkGCD(12, 8), 4);
		assertEquals(checkBCNN(8, 12), 24);

	}

}
