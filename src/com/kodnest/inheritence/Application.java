package com.kodnest.inheritence;

public class Application {
	public static void main(String[] args) {
		Bot bot=new Bot();
		TrainerBot tb=new TrainerBot();
		StudentBot sb=new StudentBot();
		System.out.println(bot.price);
	/*	bot.read();
		bot.write();
		System.out.println(tb.model);
		tb.teaching();
		System.out.println(tb.price);
		tb.read();
		tb.write(); */
		
		tb.teaching();
		System.out.println(tb.model);
		
		System.out.println(tb.price);
		tb.read();
		
		System.out.println(sb.id);
		sb.applySkillSet();
		
		System.out.println(sb.model);
		sb.teaching();
		
		System.out.println(sb.price);
		sb.read();
		sb.write();
		
	}

}
