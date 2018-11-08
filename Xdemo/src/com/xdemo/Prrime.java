package com.xdemo;

public class Prrime {

	public static void main(String[] args) {
		for(int k =1;k<=100; k++)
		{	
		int count=0;
		for(int i=k;i>=1;i--)
		{
		if(k%i==0)
		{
		count++;
		}

		}
		if (count==2)
		{
		System.out.println(k+"given number is prime number");
		}

		else
		{
		System.out.println(k+"given number is not prime number");
		}
		}

		}

	}


