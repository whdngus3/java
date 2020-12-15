package jojo;

import java.io.Serializable;

public class Product {
	String name; int price;
	Product(){}
	Product(String name, int price){
		this.name=name; this.price=price;
	}
	public String toString() {
		return "�̸�"+ name+", ����:"+ price;
	}
}
class Book extends Product implements Serializable{
	String writer; int page;
	Book(String name, int price, String writer,int page){
		super(name,page); this.writer=writer; this.page=page;
	}
	public String toString() {
		return " �̸�:"+name+",����:"+price+"�۰�"+writer;
	}
}
