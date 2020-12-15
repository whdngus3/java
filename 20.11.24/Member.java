package jojo;
public class Member {
	static int MALE = 0;
	static int FEMALE = 1;
	String name;	int gender;	int age;
	public Member(String name,int gender, int age) {
		this.name=name; this.gender=gender; this.age=age;
	}
	public int getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}