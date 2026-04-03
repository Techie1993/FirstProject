package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Data{
	private String name;
	private String city;
	private int exp;
	private String state;
	
	void display() {
		System.out.println(this.name);
		System.out.println(this.city);
		System.out.println(this.exp);
		System.out.println(this.state);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		
		if(exp<0) {
			throw new IllegalArgumentException("Negative number is not allowed");
		}
		this.exp = exp;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}

public class BankData {

	public static void main(String[] args) {
		
		// Making an object
		Data D1=new Data();
		D1.setName("Akshay");
		D1.setExp(10);
		D1.setCity("Pune");
		D1.setState("Maharashtra");
		System.out.println(D1.getName());
		System.out.println(D1.getCity());
		System.out.println(D1.getExp());
		System.out.println(D1.getState());	
	}

}
