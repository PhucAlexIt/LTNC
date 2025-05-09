package bai5_1;

import java.time.LocalDate;

public abstract class Employee {
	private String name;
	private LocalDate hiredDate;

	public Employee(String name, LocalDate hiredDate) {
		super();
		this.name = name;
		this.hiredDate = hiredDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHiredDate() {
		return hiredDate;
	}
	// b) Viết phương thức sameName để xác định xem một nhân viên có tên với một nhân viên  khác hay không. 
	protected boolean sameName(Employee e1) {
		return this.name.equals(e1.getName());	
	}
	// c) Viết phương thức workYears để tính số năm làm việc của một nhân viên tính từ năm  vào làm tới một năm mốc (toYear) cho trước.
	protected int workYears(int toYear) {
		return toYear - hiredDate.getYear();
	}
	/*
	 * d) Viết phương thức monthlySalary để tính lương tháng cho từng nhân viên như sau: 
			a.  Đối với nhân viên chính thức: bằng annualSalary / 12 + Phụ cấp thâm niên. 
				Với phụ cấp thâm niên 500000 cho các nhân viên có số năm làm việc tính tới năm 2008 lớn hơn 5. 
			b. Đối với nhân viên làm theo giờ: bằng hourlyRate * primaryHours. 
			c. Đối với nhân viên tư vấn: bằng mức lương tháng phải trả như hợp đồng. 
	 */
	protected abstract double monthlySalary();
	
}

