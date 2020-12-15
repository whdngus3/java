package first;

import javax.swing.JOptionPane;

public class example1 {

	public static void main(String[] args) {
		String inString = JOptionPane.showInputDialog("Input number");
		int num=Integer.parseInt(inString);
		
		if((num%2)==0) {
		System.out.println(num+":Even number");
		
	}
		System.out.println("The end");

}
}
