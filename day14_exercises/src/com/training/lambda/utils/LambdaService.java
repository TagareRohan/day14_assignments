package com.training.lambda.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PrintNumbers implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	
}

public class LambdaService{

	public void usingJavaFunctionalInterfaces()
	{
		Predicate<Integer> checkAge = (age)-> age>45?true:false;
		List<Integer> ageList=Arrays.asList(50,20,30);
		
		for(Integer each: ageList)
		{
			if(checkAge.test(each))
			{
				System.out.println("valid age");
			}
		}
	}
	
	public void usingWithoutLambda()
	{
		Thread thread=new Thread(new PrintNumbers());
		
		thread.start();
	}
	
	public void usingLambda()
	{
		Runnable printTo10= () -> {for(int i=1;i<10;i++) {System.out.println(i);};};
		Runnable print10To20= () -> {for(int i=10;i<20;i++) {System.out.println(i);}};
		
		Thread thread1=new Thread(printTo10);
		Thread thread2=new Thread(print10To20);
		
		thread1.start();
		thread2.start();
	}
	
	public void lambdaConvert(Converter conv,Object value)
	{
		System.out.println(conv.convert(value));
		
	}
	
	public void rethrowException() throws IOException 
	{
		
		int[] marks= {45,56,78};
		String name=null;
		
		try
		{
			System.out.println(marks[5]);
			System.out.println(name.length());
			System.in.read();
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	
}
