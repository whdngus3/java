package chap5;

public class SalaryEmployee extends Employee{
	private int annualSalary;
	SalaryEmployee(String name, int annualSalary) {
		
		super(name); this.annualSalary = annualSalary;
	}
	public int computePay() {
		return annualSalary*12;
	}
	
}

class HourlyEmployee extends Employee{
	private int workHours;
	private int moneyPerHour;
	HourlyEmployee(String name, int workHours, int moneyPerHour){
		super(name);
		this.workHours=workHours;
		this.moneyPerHour=moneyPerHour;
	}
	public int computePay() {
		return workHours*moneyPerHour;
	}
}