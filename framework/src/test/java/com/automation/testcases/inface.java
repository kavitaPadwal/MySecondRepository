package com.automation.testcases;


interface printable{
	void print();
}

interface showable{
	void print();
}


public class inface implements printable,showable {

	public void print() {
		System.out.println("hellow");
		
	}
	
	
	
public static void main(String[] args) {
		inface obj=new inface();
		obj.print();
		obj.print();

	}

}



