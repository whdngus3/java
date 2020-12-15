package chap5;

public class EmployeeEx {
	public static void main(String[] args) {
		//2명 월급, 3명 시급
		Employee[] em = new Employee[5];
		
		em[0] = new SalaryEmployee("화사",2000000);
		em[1] = new SalaryEmployee("제시",1000000);
		em[2] = new HourlyEmployee("모모",100,800);
		em[3] = new HourlyEmployee("케이",100,2000);
		em[4] = new HourlyEmployee("하니",100,3000);
	
		for(Employee emp:em) {
			int k = emp.computePay();
			if(emp instanceof SalaryEmployee) {
				System.out.println("=============================");
				System.out.println(emp.getName()+": 연봉 = "+k);
				System.out.println("보너스 : "+emp.computeIncentive());
				
			} else {
				System.out.println("=============================");
				System.out.println(emp.getName()+": 월급 = "+k);
				System.out.println("보너스 : "+emp.computeIncentive());
			}
			
		}
		
	}
}
