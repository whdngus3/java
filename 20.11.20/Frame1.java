package jojo;
import java.awt.Color;
import java.awt.Frame;
public class Frame1 extends Frame{
	public Frame1(String title) {
		super(title);
		setSize(200,200);
		setVisible(true);
		setBackground(Color.red);
	}
	public static void main(String [] args) {
		Frame1 f1 = new Frame1(title);
	}
	
}
