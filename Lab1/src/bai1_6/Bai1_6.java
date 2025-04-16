package bai1_6;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class Bai1_6 {
   static boolean leapYear(int year) {
		return((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)); 
	}
	static int days (int month, int year) {
		int days = 0;
		switch(month) {
		case 1:
			days = 31;
		break;
		case 2: 
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
	            days = 29; 
	         else 
	            days = 28; 
	         break;
		case 3: 
			days = 31; 
	         break; 
		case 4:
			days = 30; 
		    break;
		case 5:
			 days = 31; 
	         break; 
		case 6: 
			days = 30; 
		    break;
		case 7:
			 days = 31; 
	         break; 
		case 8: 
			 days = 31; 
			    break;
		case 9: 
			 days = 30; 
	         break; 
		case 10:
			 days = 31; 
			    break;
		case 11: 
	         days = 30; 
	         break; 
		case 12: 
		     days = 31; 
		    break;
		}
		return days;
	}
	@Test
	public void testLeapYear() {
	assertTrue(leapYear(1904));
	assertFalse(leapYear(1900));
	assertTrue(leapYear(2000));
	}
	@Test
	public void testDays() {
	assertEquals(days(2, 1904), 29);
	assertEquals(days(2, 1900), 28);
	assertEquals(days(2, 2000), 29);
	assertEquals(days(1, 2020), 31);
	assertEquals(days(2, 2020), 29);
	assertEquals(days(4, 2020), 30);
	assertEquals(days(10, 2020), 31);

	}
}
