package com.kodnest.inheritence;
import java.util.Scanner;
public class Junglee
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String type=sc.nextLine();
		String name1=sc.nextLine();
		int age1=sc.nextInt();
		sc.nextLine();
		String type1=sc.nextLine();
		Mammal m=new Mammal(name,age,type);
		m.display();
		Bird b=new Bird(name1,age1,type1);
		b.display();
		
		
	}
}
class Animal
{  
	String name;
	int age;
	String type;
	public Animal(String name,int age,String type)
	{
		this.name=name;
		this.age=age;
		this.type=type;
	}
	
}
class Mammal extends Animal
{
	public Mammal(String name,int age,String type)
	{
		super(name,age,type);
	}
	void display ()
	{
		System.out.println("Animal name: "+name+","+"type: "+type);
	}
	
}
class Bird extends Animal
{
	public Bird (String name1,int age1,String type1)
	{
		super(name1,age1,type1);
	}
	void display ()
	{
		System.out.println("Animal name: "+name+","+"type: "+type);
	}
	
}



