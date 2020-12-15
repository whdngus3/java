package jojo;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Graphics1 extends Frame {
	public Graphics1() {
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		
		g.drawLine(100, 100, 140, 150);
		g.setColor(Color.red);
		g.fillRect(20, 30, 100, 100);
		g.setColor(Color.blue);
		g.drawOval(50, 50, 100, 100);
		g.setColor(Color.green);
	}
	public static void main(String[] args) {
		new Graphics1();
	}
}
