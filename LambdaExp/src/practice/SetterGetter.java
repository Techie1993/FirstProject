package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Detail{
	private int age;
	private String name;
	
	void show() {
		System.out.println(this.age);
		System.out.println(this.name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		try {
			if(age<0);
		}catch(InputMismatchException e) {
			System.out.println(e);
			System.out.println("Negative Number is Not allowed");
		}	
		
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
  

public class SetterGetter {

	public static void main(String[] args) {
		
		Detail D1=new Detail();
		D1.setAge(-9);
		System.out.println(D1.getAge());

	}

}
