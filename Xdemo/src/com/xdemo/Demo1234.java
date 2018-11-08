package com.xdemo;

public class Demo1234 {

	public static void main(String[] args) {
		int b = 33458765;
		int min = 9, max = 0;
		int temp = 0;
		while(b>0){
		temp = b%10;
		if(temp < min){
		min = temp;
		min = (temp<min)?temp:min;
		max = (temp>max)?temp:max;
		}
		else if(temp > max){
		max = temp;
		System.out.println(max);
		}
		b = b/10;
		}
		System.out.println(min + "_" + max);

	}

}
