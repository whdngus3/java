package jojo;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class JTableTest1 extends JFrame{
	public JTableTest1() {
		String title[] = {"��ȣ","�̸�","����"};
		 String data[][] = {{"1","ö��","20"},{"2","�Ǽ�","21"},{"3","����","25"}};
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
