package com.kodnest.inheritence;
import java.util.Scanner;
public class Calculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int width=sc.nextInt();
		
		Width w=new Width(length,width);
		w.area();
		
	}

}
 class Length
 {
	 int length;
	 public Length(int length)
	 {
		 this.length=length;
	 }
 }
 class Width extends Length
 {
	 int width;
	 public Width(int length,int width)
	 {   super(length);
		 this.width=width;
	 }
	 void area()
		 {
			 int area=length*width;
			 System.out.println("the area is "+area);
		 }
		 
	 
	 
			 
 }
 