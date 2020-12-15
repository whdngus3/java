package jojo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Event1 extends Frame implements ActionListener{
	Button apple, banana;
	TextArea ta;
	public Event1() {
		apple = new Button("사과");
		banana = new Button("바나나");
		ta = new TextArea();
		add("North",apple);
		add("South",banana);
		add("Center",ta);
		setSize(300,300);
		setVisible(true);
		apple.addActionListener(this);
		banana.addActionListener(this);
	}
	public static void main(String[] args) {
		new Event1();
	}
	public void actionPerformed(ActionEvent e) {
		ta.append(e.getActionCommand()+"\n");
	}
}
