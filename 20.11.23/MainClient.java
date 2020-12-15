/*
���� ���� 100
�游��� 200
����� 210
�濡�� �޼��� 400
������ 290
���� 900
*/
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class MainClient extends JFrame 
	implements Runnable,ActionListener,MouseListener {

	//�ʵ� ����
	Socket s;
	BufferedReader in;
	OutputStream out;
	String name,host,title="����";
	String [][]data1 = new String[0][2];
	String []cols1 = {"������","�ο�"};
	String [][]data2 = new String[0][1];
	String []cols2 = {"��ȭ��"};
	String [][]data3 = new String[0][2];
	String []cols3 = {"��ȭ��","��ġ"};

	JButton creatB = new JButton("�� �����"); 
	JButton roominB = new JButton("�����");
	JButton exitB = new JButton("��   ��");
	
	DefaultTableModel  model1 = new DefaultTableModel(data1,cols1);
	DefaultTableModel  model2 = new DefaultTableModel(data2,cols2);
	DefaultTableModel  model3 = new DefaultTableModel(data3,cols3);
	
	JTable table1 = new JTable(model1);	
	JTable table2 = new JTable(model2);	
	JTable table3 = new JTable(model3);	
	
	JScrollPane waitroom = new JScrollPane(table1);
	JScrollPane roominfo = new JScrollPane(table2);
	JScrollPane waitinfo = new JScrollPane(table3);
	
	RoomClient client=new RoomClient();
	
	public MainClient(String host)	{
	    super("Main_Caht");
		this.host=host;
      
		table1.getTableHeader().setReorderingAllowed(false);
		table2.getTableHeader().setReorderingAllowed(false);
		table3.getTableHeader().setReorderingAllowed(false);
		
		table1.getTableHeader().setBackground(new Color(255,207,96));
		table2.getTableHeader().setBackground(new Color(255,207,96));
		table3.getTableHeader().setBackground(new Color(255,207,96));
		
		creatB.setBackground(new Color(85,214,211));
		roominB.setBackground(new Color(85,214,211));
		exitB.setBackground(new Color(85,214,211));
		
		creatB.setFont(new Font("Dialog", Font.PLAIN, 12));
		roominB.setFont(new Font("Dialog", Font.PLAIN, 12));
		exitB.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		//������ ��ġ
		setLayout(null);
		add(waitroom).setBounds(10,10,400,250);
		add(roominfo).setBounds(415,10,168,250);
		add(waitinfo).setBounds(10,270,400,197);

		add(creatB).setBounds(449,300,100,30);
		add(roominB).setBounds(449,340,100,30);
		add(exitB).setBounds(449,380,100,30);		
		table1.setSelectionMode(0);
				
		setSize(600,500);
		name=JOptionPane.showInputDialog(null,"��ȭ���� �Է��ϼ���",
				"��ȭ���Է�",JOptionPane.YES_NO_OPTION);
		
		if(name==null||name.length()<1)
		  return;
		connectProcess();
		setVisible(true);
		eventUp();	
	}
	
	void eventUp() 	{
	
	  creatB.addActionListener(this);
	  roominB.addActionListener(this);
	  client.tf.addActionListener(this);
	  client.outB.addActionListener(this);
	  
	  table1.addMouseListener(this);
     
	  client.nickB.addActionListener(this);
     client.sayB.addActionListener(this);
	  exitB.addActionListener(this);
	}
	
	public void mouseClicked(MouseEvent e)	{
	    model2.setRowCount(0);
	    int r=table1.getSelectedRow();
			String temp=(String)model1.getValueAt(r,0);
			for(int i=0;i<model3.getRowCount();i++) {
				String roomt=(String)model3.getValueAt(i,1);
				if(temp.equals(roomt))			 {
					Object ob[]={model3.getValueAt(i,0)};
					model2.addRow(ob);
                }
			}
   } // mouseClicked end
	
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

	public void actionPerformed(ActionEvent e)
	{
	   Object ob=e.getSource();
		if(ob==creatB)	 {
		  title=JOptionPane.showInputDialog(this,"�������� �Է��ϼ���",
				  "������ �Է�",JOptionPane.YES_NO_OPTION);
	  
		  if (title==null||title.length()<1)
				  return;
		  try{
				  out.write(("200|"+title+"\n").getBytes());
			}catch(Exception ex){}
	    }// if

		 if(ob==roominB)			{
		    int row=table1.getSelectedRow();
			if(row<0)				{
				JOptionPane.showMessageDialog(this,"�������� �����ϼ���");
				return;
			}
			title=(model1.getValueAt(row,0)).toString();
			try{
				   out.write(("210|"+title+"\n").getBytes());
			    }catch(Exception ex){}
		 } //if

		 if(ob==client.tf)			{
			String msg=client.tf.getText().trim();
			if(msg.length()<1)
				 return;
			try {
				out.write(("400|"+msg+"\n").getBytes());
			    }catch(Exception ex){}
			client.tf.setText(null);
		} //if

		 if(ob==client.outB)		{
			requestRoomOut();
		}
		 
		if(ob==client.nickB)		{
			String n=JOptionPane.showInputDialog(client,
					  "������ ��ȭ���� �Է��ϼ���","��ȭ�� �Է�",
					  JOptionPane.YES_NO_OPTION);
			if (n==null||n.length()<1)
			   return;
			try{
				out.write(("420|"+n+"\n").getBytes());
			 }catch(Exception ex){}
		}
			
		 if(ob==client.sayB)		 {	
			int row=client.table1.getSelectedRow();
			if(row<0)				{
				JOptionPane.showMessageDialog(client,
						"�ͼӸ��� ������븦 �����ϼ���");
						return;
			}
			String sayN=(client.model1.getValueAt(row,0)).toString();
			  String say=JOptionPane.showInputDialog(client,
					  "���ϰ� �������� �Է��ϼ���","�ӼӸ�",
					  JOptionPane.YES_NO_OPTION);
			    if (say==null||say.length()<1)
				     return;
				try{
					 out.write(("450|"+sayN+"|"+say+"\n").getBytes());
					 client.ta.append("[�ӼӸ�(to)]"+sayN+">>"+say+"\n");
				   }catch(Exception ex){}
			} //if

		if(ob==exitB)		 {
			 closeProcess();
		}
	} //actionPerformed end

	public void connectProcess()	{
	   try{
		 s=new Socket(host,5555);
		 in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		 out = s.getOutputStream();
		 out.write((name+"\n").getBytes());
		 new Thread(this).start();  //run() �޼��� ȣ��
	   }catch(Exception ex){System.out.println("�������� ����!");}
	}
	
  public	void requestRoomOut()	{
	    try{	
			  out.write(("290|\n").getBytes());
			 }catch(Exception ex){}
		 title="����";
	}

  public void closeProcess()	{
	   try{
			client.setVisible(false);
			out.write(("900|\n").getBytes());
			s.close();
			in.close();
			out.close();
		  }catch(Exception ex){}
	}

	public void run()	{
	   while(true)		 {  
		   try{
			  String msg=in.readLine();
			  if(msg==null)
				  return;
			  StringTokenizer st=new StringTokenizer(msg,"|");
	     	  int protocol=Integer.parseInt(st.nextToken());
			  
			  switch(protocol)			   {
				  case 100:{
				      String ob[]={st.nextToken(),st.nextToken()};
				      model3.addRow(ob);
					 break;} //case 100
				  
	              case 200:{
				      String ob[]={st.nextToken(),st.nextToken()};
				      model1.addRow(ob);
					 break;} //case 200
	              
	              case 205:{
				     String n=st.nextToken();
				     String t=st.nextToken();
					 for(int i=0;i<model3.getRowCount();i++)  {  
						 String temp=(String)model3.getValueAt(i,0);
						 if(temp.equals(n))	 {
							 model3.setValueAt(t,i,1);
							 break;
						 }
					} //for

					for(int i=0;i<model1.getRowCount();i++)	{
						String temp=(String)model1.getValueAt(i,0);
						if(temp.equals(t))	{
							int inwon=Integer.parseInt(
									model1.getValueAt(i,1).toString());
							model1.setValueAt(++inwon+"",i,1);
							//inwon�� int�̹Ƿ� +""�ؼ� objectȭ �Ѵ�
							//===>Integer.toSting(++inwon)
						     break;  
					    }
					} //for

					if(n.equals(name)) {   //���� ����
						roomInProcess();
					}
					else if(t.equals(title)) {  //���濡 �ٸ������ ��������
						 Object ob[]={n};
						 client.model1.addRow(ob);
                  	     client.inwon.setText(
                  	    		  Integer.toString(client.model1.getRowCount()));
						 client.ta.append("*** [ "+n+" ]���� �����Ͽ����ϴ� ***\n");}
						 break;
					 }// case 205
	              
				  	 case 400:
              		    client.ta.append("   "+st.nextToken()+"\n");
						break;
						
					 case 290:			 { 
						String n=st.nextToken();
						String t=st.nextToken();
			    		for(int i=0;i<model1.getRowCount();i++)	{
							String temp=(String)model1.getValueAt(i,0);
							if(temp.equals(t))	{
							    int inwon=Integer.parseInt(
									  model1.getValueAt(i,1).toString());
								if (inwon==1)
									 model1.removeRow(i);
								else
									 model1.setValueAt(--inwon+"",i,1);
									//inwon�� int�̹Ƿ� +""�ؼ� objectȭ �Ѵ�
									//===>Integer.toSting(++inwon)
								break;  
							 }//if
						 } // for   //model1���� �ο����� ����

						for(int i=0;i<model3.getRowCount();i++)	{
							String temp=(String)model3.getValueAt(i,0);
							if(temp.equals(n))	 {  
								model3.setValueAt("����",i,1);
								break; 
							}  
						} // for //model3���� ��ġ���� ����
							
						if(n.equals(name))  //���� ������� 
						  roomOutProcess();
							
                     if(t.equals(title))  { //���濡�� ���� ���
					     for(int i=0;i<client.model1.getRowCount();i++)    {
							String temp=(String)client.model1.getValueAt(i,0);
							if(temp.equals(n))	{ 
								client.model1.removeRow(i);
								break;
							}
     					} //for
           				client.inwon.setText(Integer.toString(
           						client.model1.getRowCount()));
						client.ta.append("*** [ "+n+" ]���� �����Ͽ����ϴ� ***\n");	
	                 } //if						
				 } // case 290
				 break;
				     
				 case 420:	   {
					  String oldN=st.nextToken();
					  String newN=st.nextToken();
					  String t=st.nextToken();

					  for(int i=0;i<model3.getRowCount();i++)	 {
						 String N=(String)model3.getValueAt(i,0);
						 if(oldN.equals(N))		 {
							model3.setValueAt(newN,i,0);
						    break;
						 }
					  }// for

					  if(t.equals(title)) { //����ȿ� �ִ� ����� ��ȭ���� �ٲ� ���
						  for(int i=0;i<client.model1.getRowCount();i++)   {
							  String N=(String)client.model1.getValueAt(i,0);
							  if(oldN.equals(N)) {
								 client.model1.setValueAt(newN,i,0);
						         break;
							   }
						  } //for
							
						  client.ta.append("   *** [ "+name+" ]���� ��ȭ���� ["+newN+"]�� �ٲ�����ϴ� ***\n");	
					  } // if
	                
					  if(oldN.equals(name))
						  name=newN;
					} // case 420
					break;

				     case 450: 		   {
					     String n=st.nextToken();
						 String str=st.nextToken();
						 client.ta.append("[�ӼӸ�(from)]"+n+">>"+str+"\n");
					   } // case 450
					   break;
				     
					  case 900:   {
						 String n=st.nextToken();
						 String t=st.nextToken();
						 for(int i=0;i<model3.getRowCount();i++)	{
							String temp=(String)model3.getValueAt(i,0);
							if(temp.equals(n))			{
							   model3.removeRow(i);
							   break;
							}
						 }// for

						if(!t.equals("����")) {  //��ȭ�߿� ���� ���
							 for(int i=0;i<model1.getRowCount();i++)  {
							    String temp=(String)model1.getValueAt(i,0);
								if(temp.equals(t)) 		{
									int a=Integer.parseInt(
											(model1.getValueAt(i,1)).toString());
									if(--a==0)
										model1.removeRow(i);
									else
									    model1.setValueAt(a+"",i,1);
										break;
								}  // if 
							  } // for
							} // if

						  if(t.equals(title)) {  //���濡�� �������
							 for(int i=0;i<client.model1.getRowCount();i++)   {
								String temp=(String)client.model1.getValueAt(i,0);
								if(temp.equals(n))	{ 
									client.model1.removeRow(i);
									break;
								}
     						 } // for
           				     client.inwon.setText(
           						Integer.toString(client.model1.getRowCount()));
     					     client.ta.append("   *** [ "+n+" ]���� �����Ͽ����ϴ� ***\n");	
	                      } // if						
					  } // case 900
					  break;
				} // switch
				}catch(Exception ex){System.out.println("������ �������!");
				return;}
			} // while
		}	// run
			
	public void roomOutProcess()	{
		client.ta.setText("");
		client.inwon.setText("");
		for(int i=0;i<client.model1.getRowCount();i++)  {
			client.model1.removeRow(0);
		}
		client.model1.setRowCount(0);	
			
		client.inwon.setText(Integer.toString(client.model1.getRowCount()));
		client.setVisible(false);
		creatB.setEnabled(true);
		roominB.setEnabled(true);
	}  // roomOutProcess

	public void roomInProcess()	{
	    client.setVisible(true);
		client.ta.append("   *** [ "+title+" ]�濡 �����Ͽ����ϴ� ***\n");
		for(int i=0;i<model3.getRowCount();i++)	 {
			String temp=(String)model3.getValueAt(i,1);
			if(temp.equals(title))	{
				Object ob[]={model3.getValueAt(i,0)};
				client.model1.addRow(ob);
			 }
		} // for

	  client.inwon.setText(Integer.toString(client.model1.getRowCount()));
      roominB.setEnabled(false);
      creatB.setEnabled(false);
	} // roomInProcess

  public static void main(String args[]) {
	 String ip = JOptionPane.showInputDialog("server ip�� ?"); 
	 new MainClient(ip);
  }
}