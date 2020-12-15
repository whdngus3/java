package chap5;

public class Employee {
	public final double INCENTIVE_RATE = 0.1;
	private String name;
	Employee(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}


	public int computePay() { //overriding
		return 0;
	}
	public final int computeIncentive() {
		int result = 0;
		int pay = computePay();
		if(pay>1000000) {
			double temp = pay*INCENTIVE_RATE;
			result = (int)temp;
		}
		return result;
		
	}
}
