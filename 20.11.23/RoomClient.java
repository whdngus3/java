import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;

class RoomClient extends JFrame
{
	//�ʵ弱��
	String [][]data1 = new String[0][1];
	String []cols1 = {"��ȭ��"};

	TextArea ta = new TextArea();
	TextField tf = new TextField(10);

	 JLabel lab1 = new JLabel("�����ο�");
	 TextField inwon = new TextField(10);
	
	JButton nickB = new JButton("��ȭ�� ����");
	JButton sayB = new JButton("�ӼӸ�");
	JButton outB = new JButton("������");
	
	DefaultTableModel  model1 = new DefaultTableModel(data1,cols1);
	JTable table1 = new JTable(model1);	
	JScrollPane roominfo = new JScrollPane(table1);	
	
	//������
	RoomClient()	{
		super("RoomClient");
		//�Ӽ�����
		table1.getTableHeader().setReorderingAllowed(false);	
		table1.getTableHeader().setBackground(new Color(61,232,205));

		nickB.setBackground(new Color(85,214,211));
		sayB.setBackground(new Color(85,214,211));
		outB.setBackground(new Color(85,214,211));
		
		lab1.setFont(new Font("Dialog", Font.PLAIN, 12));
		nickB.setFont(new Font("Dialog", Font.PLAIN, 12));
		sayB.setFont(new Font("Dialog", Font.PLAIN, 12));
		outB.setFont(new Font("Dialog", Font.PLAIN, 12));

		//������ ��ġ
		setLayout(null);
		add(ta).setBounds(10,10,400,400);
		add(roominfo).setBounds(415,10,168,200);
		add(tf).setBounds(10,420,400,30);
		add(lab1).setBounds(445,240,100,30);
		add(inwon).setBounds(445,280,45,20);
		
		add(nickB).setBounds(450,325,100,30);
		add(sayB).setBounds(450,365,100,30);
		add(outB).setBounds(450,405,100,30);
		tf.requestFocus();
		setSize(600,485);
		// setVisible(true);
	}//������ ����
 	/*
	 public static void main(String args[])	{
		new RoomClient();
	}   */
}