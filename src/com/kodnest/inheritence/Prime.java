package com.kodnest.inheritence;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Check c=new Check(num);
		
	}

}
class Number
{
	int num;
	public Number(int num)
	{
		this.num=num;
	}
	void isPrime()
	{
		boolean flag=false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}
class Check extends Number
{
	public Check(int num)
	{
		super(num);
		super.isPrime();
	}
}



	