package jojo;

import java.util.regex.Pattern;

public class RegulaEx1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.","car","combat","count","date","disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");
		
	}
}
