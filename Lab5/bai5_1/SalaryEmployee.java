package bai5_1;

import java.time.LocalDate;

public class SalaryEmployee extends Employee {
	private double annualSalary;
	private int stockOption;
	
	public SalaryEmployee(String name, LocalDate hiredDate, double annualSalary, int stockOption) {
		super(name, hiredDate);
		this.annualSalary = annualSalary;
		this.stockOption = stockOption;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getStockOption() {
		return stockOption;
	}

	@Override
	public String toString() {
		 return String.format("SalaryEmployee: %s, Hired Date: %s, Annual Salary: $%.2f, Stock Options: %d",
                 getName(), getHiredDate(), annualSalary, stockOption);
	}

	/*
	 * Viết phương thức monthlySalary để tính lương tháng cho từng nhân viên như sau: 
			a.  Đối với nhân viên chính thức: bằng annualSalary / 12 + Phụ cấp thâm niên. 
				Với phụ cấp thâm niên 500000 cho các nhân viên có số năm làm việc tính tới năm 2008 lớn hơn 5. 
			b. Đối với nhân viên làm theo giờ: bằng hourlyRate * primaryHours. 
			c. Đối với nhân viên tư vấn: bằng mức lương tháng phải trả như hợp đồng. 
	 */
	@Override
	protected double monthlySalary() {
		int phuCap;
		if (workYears(2008) > 5) {
			phuCap = 500000;
		}else {
			phuCap = 0;
		}
		return Math.round(((annualSalary / 12 ) + phuCap));
	}
	


}
