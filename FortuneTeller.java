package com.luv2code.springdemo;

import java.util.Random;

public class FortuneTeller implements FortuneService{
	
	@Override
	public String getFortune(){
		String [] fortunes= new String[3];
		Random rand=new Random();
		int rnd=rand.nextInt(2);
		//System.out.println(rnd);
		fortunes[0]="Good Day";
		fortunes[1]="Bad Day";
		fortunes[2]="Average Day";
		return fortunes[rnd];
		//return "abc";
	}

}
