package chap5;

public class EmployeeEx {
	public static void main(String[] args) {
		//2�� ����, 3�� �ñ�
		Employee[] em = new Employee[5];
		
		em[0] = new SalaryEmployee("ȭ��",2000000);
		em[1] = new SalaryEmployee("����",1000000);
		em[2] = new HourlyEmployee("���",100,800);
		em[3] = new HourlyEmployee("����",100,2000);
		em[4] = new HourlyEmployee("�ϴ�",100,3000);
	
		for(Employee emp:em) {
			int k = emp.computePay();
			if(emp instanceof SalaryEmployee) {
				System.out.println("=============================");
				System.out.println(emp.getName()+": ���� = "+k);
				System.out.println("���ʽ� : "+emp.computeIncentive());
				
			} else {
				System.out.println("=============================");
				System.out.println(emp.getName()+": ���� = "+k);
				System.out.println("���ʽ� : "+emp.computeIncentive());
			}
			
		}
		
	}
}
