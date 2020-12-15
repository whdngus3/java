/*
############################
#  ���� ���� 100         #
#  �游��� 200            #
#  ����� 210          #
#  �濡�� �޼��� 400       #
#  ������ 290              #
#  ���� 900                #
############################
*/

import java.awt.*;
import java.util.*;
import java.net.*;
import java.io.*;

class Server extends Frame implements Runnable {

	Vector globalvc=new Vector();
	Vector roomvc=new Vector();
	TextArea ta=new TextArea();
	Server()	{
	   ta.setFont(new Font("Arial",1,12));
		 add(ta);
		 setSize(300,300);
		 setVisible(true);
	 }
	
	public void run()	{
	  ServerSocket ss=null;
		try{
		 ss=new ServerSocket(5555);
		}catch(Exception ex){ta.append("���������� �ȵ�\n");System.exit(0);}
		ta.append("��������...client�� ������ ��ٸ�...\n");
		Socket s=null;
		while(true)		{
		  try{
			 s=ss.accept();
			 ta.append("Client ����:"+s+"\n");
			 Service ser=new Service(s);
			}catch(Exception ex){}
		 }
	}//run end
	
	public static void main(String args[])	{
	   new Thread(new Server()).start();
   }
		
	class Service extends Thread	{
	     BufferedReader in;
		 OutputStream out;
		 String name;
		 Room myroom=new Room();
		 Service(Socket s)		 {
			try{
			    out = s.getOutputStream();
		    	in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				  name=in.readLine();
					myroom.title="����";
			}catch(Exception ex){ta.append("Client�� ���� �Ҿ���\n");}
		   
			for(int i=0;i<globalvc.size();i++)			{
			  try{
				  Service ser=(Service)globalvc.elementAt(i);
				  putMessageTo("100|"+ser.name+"|"+ser.myroom.title);
			   }catch(Exception ex){globalvc.removeElementAt(i--);}
			}
			
		 for(int i=0;i<roomvc.size();i++)		 {
			 Room r=(Room)roomvc.elementAt(i);
			 try{
				 putMessageTo("200|"+r.title+"|"+r.inwon);
			 }catch(Exception ex){}
		 }
		 
		 globalvc.addElement(this);
		 putMessageAll("100|"+name+"|"+myroom.title);
		 start();
		}//����������
    public void run()		{
		   while(true)			 {
			 try{
				String msg=in.readLine();
				if(msg==null)return;
					ta.append(name+">"+msg+"\n");
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					
				 switch(protocol)	{
				   case 200:		{
						myroom=new Room(st.nextToken(),name,1);
						myroom.uservc.addElement(this);
						roomvc.addElement(myroom);
						putMessageAll("200|"+myroom.title+"|"+0);
						putMessageAll("205|"+name+"|"+myroom.title);
					}
					break;
					
					case 210:		{
						 String t=st.nextToken();
						 for(int i=0;i<roomvc.size();i++)	{
							Room r=(Room)roomvc.elementAt(i);
							if(t.equals(r.title))	{
							   myroom=r;
						  	   myroom.uservc.addElement(this);
							   myroom.inwon++;
							   putMessageAll("205|"+name+"|"+myroom.title);
					 		   break;
							 } // if
					   } // for
					 }
					 break;
					  
					 case 400:
						putMessageRoom("400|"+name+">>"+st.nextToken());
						break;
					
					 case 290:	 {
						myroom.uservc.removeElement(this);
						myroom.inwon=myroom.uservc.size();
						if(myroom.inwon==0) {
							roomvc.removeElement(myroom);
						}
						putMessageAll("290|"+name+"|"+myroom.title);
						myroom=new Room();
						myroom.title="����";
					  }
					 break;
					
					 case 420://��ȭ�� ����
					  {	String newName=st.nextToken();
						putMessageAll("420|"+name+"|"+newName+"|"+myroom.title);
						//��� Ŭ���̾�Ʈ���� ������
						name=newName;
					  }
					  break;
					 
					 case 450://�ͼӸ�
					  {  String sayName=st.nextToken();
						 String sayC=st.nextToken();
					     //���ǿ��� �ͼӸ� �Ҷ��� ��ü���� ã�´�
					 	 //for(int i=0;i<globalvc.size();i++)
					     for(int i=0;i<myroom.uservc.size();i++) { 
							Service ser=(Service)myroom.uservc.elementAt(i);
							if(sayName.equals(ser.name)) { 
								try{ ser.putMessageTo("450|"+name+"|"+sayC);
				                }catch(Exception ex){myroom.uservc.removeElement(ser);}
								 break;
							 }
			              }  // for
						} 
						break;

					  case 900://����
						{  globalvc.removeElement(this);
						   putMessageAll("900|"+name+"|"+myroom.title);
						   if(!myroom.title.equals("����"))  { 
								myroom.uservc.removeElement(this);
								if(--myroom.inwon==0)
								   roomvc.removeElement(myroom);
							}  // if
							try{ in.close();
								 out.close();
							}catch(Exception ex){}
							 return;
						  }
      			//break;						   
				  }}catch(Exception ex){return;}
			  } // while
	}  // run
    
	public void putMessageAll(String msg)	{
	   synchronized(this){
		 for(int i=0;i<globalvc.size();i++)	{
			try{ Service ser=(Service)globalvc.elementAt(i);
				 ser.putMessageTo(msg);
            }catch(Exception ex){globalvc.removeElementAt(i--);}
            }
		  }  // for
	 } //method ����
		
	 public void putMessageTo(String msg) throws Exception 	{
		 synchronized(this){
		    out.write((msg+"\r\n").getBytes());
         }		
    }			
	public void putMessageRoom(String msg) 	{
		synchronized(this){
		   for(int i=0;i<myroom.uservc.size();i++)  {
			  	try{ Service ser=(Service)myroom.uservc.elementAt(i);
					 ser.putMessageTo(msg);
				}catch(Exception ex){myroom.uservc.removeElementAt(i--);} // catch
			}  // for
	     }  // syncjronized  
	 }  // method 
  } // inner class	 
}  // outer class