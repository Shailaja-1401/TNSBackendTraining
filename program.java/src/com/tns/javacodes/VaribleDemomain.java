package com.tns.javacodes;

public class VaribleDemomain {
public static void main(String[]args) {
	VariableDemo ob=new VariableDemo();
	System.out.println(ob.name="this is instance variable");
	ob.display();
	//calling static variable
	System.out.println(VariableDemo.college);
}
}
