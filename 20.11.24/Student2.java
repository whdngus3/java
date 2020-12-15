package jojo;

public class Student2 implements Comparable<Student2> {
	private String name;
	private int score;
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}	
	public String getName() {	return name;	}

	public void setName(String name) {	this.name = name;	}
	public int getScore() {	return score;	}
	public void setScore(int score) {	this.score = score;	}
	public int compareTo(Student2 o) {
		return Integer.compare(score, o.score);
	}
}