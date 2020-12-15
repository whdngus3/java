package chap5;

public class chap6_1 {
	private String name;int age;private String addr;
	public void setName(String name) {
		this.name=name;
	}
	public String getName(String name) {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("À½¼ö À¹¿¢");
			this.age=0;
		}else 
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
}
