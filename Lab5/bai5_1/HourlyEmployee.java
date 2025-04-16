package bai5_1;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	private int hourlyRate;
	private int primaryHours;
	
	
	public HourlyEmployee(String name, LocalDate hiredDate, int hourlyRate, int primaryHours) {
		super(name, hiredDate);
		this.hourlyRate = hourlyRate;
		this.primaryHours = primaryHours;
	}


	public int getHourlyRate() {
		return hourlyRate;
	}


	public int getPrimaryHours() {
		return primaryHours;
	}
	
	@Override
	public String toString() {
		return String.format("HourlyEmployee: %s, Hired Date: %s, Hourly Rate: $d, Primary Hours: %d",
                getName(), getHiredDate(), hourlyRate, primaryHours);
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
		// TODO Auto-generated method stub
		return getHourlyRate() * getPrimaryHours();
	}
	
	
	

}
