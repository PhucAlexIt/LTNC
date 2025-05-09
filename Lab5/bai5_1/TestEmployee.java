package bai5_1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestEmployee {

	// b) Viết phương thức sameName để xác định xem một nhân viên có tên với một nhân viên  khác hay không. 
	@Test
	void testSameNameEmployee() {
		Employee e1 = new SalaryEmployee("Nguyen Hoang",LocalDate.of(2001, 5, 20), 50000000, 2500);
		Employee e5 = new SalaryEmployee("Nguyen Hoang",LocalDate.of(2001, 5, 20), 50000000, 2500);
		Employee e6 = new SalaryEmployee("nguyen hoang",LocalDate.of(2001, 5, 20), 50000000, 2500);
	
		assertTrue(e5.sameName(e1));
		assertFalse(e5.sameName(e6));
	}
	// c) Viết phương thức workYears để tính số năm làm việc của một nhân viên tính từ năm  vào làm tới một năm mốc (toYear) cho trước.
	@Test
	void testWorkYears() {
		Employee e2 = new HourlyEmployee("Tran Minh",LocalDate.of(2005, 6, 25), 50000, 45);
		assertEquals(e2.workYears(2025), 20);
		assertEquals(e2.workYears(2011), 6);
	}
	/*
	 * Viết phương thức monthlySalary để tính lương tháng cho từng nhân viên như sau: 
			a.  Đối với nhân viên chính thức: bằng annualSalary / 12 + Phụ cấp thâm niên. 
				Với phụ cấp thâm niên 500000 cho các nhân viên có số năm làm việc tính tới năm 2008 lớn hơn 5. 
			b. Đối với nhân viên làm theo giờ: bằng hourlyRate * primaryHours. 
			c. Đối với nhân viên tư vấn: bằng mức lương tháng phải trả như hợp đồng. 
	 */
	 @Test
	 void testmonthlySalary() {
		Employee e1 = new SalaryEmployee("Nguyen Hoang",LocalDate.of(2001, 5, 20), 50000000, 2500);
		Employee e2 = new SalaryEmployee("Nguyen Quoc Chien",LocalDate.of(2006, 12, 1), 3000000, 1200);

		assertEquals(e1.monthlySalary(), 4666667);
		assertEquals(e2.monthlySalary(), 250000);
		
		Employee e3 = new HourlyEmployee("Vi Minh",LocalDate.of(2005, 6, 25), 15000, 45);
		assertEquals(e3.monthlySalary(), 675000);
		
		Employee e4 = new Consultant("Le Van",LocalDate.of(2004, 9, 11), "012030",  19000000);
		assertEquals(e4.monthlySalary(), 19000000);

	 }
	 
	 

	

}
