package jojo;

public class System1 {
	public static void main(String[] args) {
		String path = System.getenv("path");
		String java_home = System.getenv("JAVA_HOME");
			System.out.println(path);
			System.out.println(java_home);	
	}
}
