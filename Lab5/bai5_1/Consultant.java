package bai5_1;

import java.time.LocalDate;

public class Consultant extends Employee {
	private String contractNumber;
	private double billingRate;
	
	
	public Consultant(String name, LocalDate hiredDate, String contractNumber, double billingRate) {
		super(name, hiredDate);
		this.contractNumber = contractNumber;
		this.billingRate = billingRate;
	}


	public String getContractNumber() {
		return contractNumber;
	}


	public double getBillingRate() {
		return billingRate;
	}
	
	@Override
	public String toString() {
		return String.format("Consultant: %s, Hired Date: %s, ContractNumber: %s, Billing Rate: $%.2f",
                getName(), getHiredDate(), contractNumber, billingRate);
	}


	@Override
	protected double monthlySalary() {
		// TODO Auto-generated method stub
		return getBillingRate();
	}
	
}
