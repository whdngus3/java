package jojo;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class JTableTest1 extends JFrame{
	public JTableTest1() {
		String title[] = {"번호","이름","나이"};
		 String data[][] = {{"1","철수","20"},{"2","판수","21"},{"3","민재","25"}};
		 DefaultTableModel model = new DefaultTableModel(data,title);
		 JTable table = new JTable(model);
		 JScrollPane sp = new JScrollPane(table);
		 add(sp); setSize(300,300);
		 setVisible(true);
	
	}
	public static void main(String[] args) {
		new JTableTest1();
	}

}
