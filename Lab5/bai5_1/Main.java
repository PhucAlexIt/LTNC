package bai5_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// e) Tạo một danh sách nhân viên (dùng ArrayList) và tạo 10 nhân viên.
		 ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new SalaryEmployee("Dang Gia Bao", LocalDate.of(2020, 11, 21), 45000000, 120));
		emp.add(new SalaryEmployee("Ngo Quoc Chi", LocalDate.of(2023, 4, 1), 250000000, 0));
		emp.add(new SalaryEmployee("Nguyen Phan", LocalDate.of(2010, 6, 8), 30000000, 4));
		emp.add(new SalaryEmployee("O Hue Hao", LocalDate.of(2008,10, 10), 45000000, 10));
		
		emp.add(new HourlyEmployee("Vi Tuan", LocalDate.of(2025, 3, 10), 4000000, 12));
		emp.add(new HourlyEmployee("Tran Thi Nga", LocalDate.of(2021, 6, 7), 2500000, 12));
		emp.add(new HourlyEmployee("Vo Xuan Tai", LocalDate.of(2021, 6, 8), 2500000, 12));
		
		emp.add(new Consultant("Nguyen Hieu", LocalDate.of(2020, 11, 21), "C123", 120));
		emp.add(new Consultant("Loi Tai Loc", LocalDate.of(2023, 4, 1), "C155", 10));
		emp.add(new Consultant("Banh Mi Ram Ram", LocalDate.of(2010, 6, 8), "C366", 1));
		
		for (Employee e: emp) {
			System.out.println(e.toString());
		}
		System.out.println("---------");
	


}

	}
