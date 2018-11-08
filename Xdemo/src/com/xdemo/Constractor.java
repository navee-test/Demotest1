package com.xdemo;

public class Constractor {

	static String studentname;
	static int studentid;
	
//	Constractor(String name, int id){
//		studentname = name;
//		studentid=id;
//	}
	
	
	public static void main(String[] args) {
		studentname = "naveen";
		studentid = 13;
		
		//Constractor c1 = new Constractor("naveen", 13);
		//Constractor c2 = new Constractor("brammi", 12);
		System.out.println( studentname + " " + studentid);
		System.out.println( studentid);
		
		
	//	c2.studentid = c1.studentid;
		
		//System.out.println(c1.studentname + "-" + c1.studentid);
		//.out.println(c2.studentname + "-" + c2.studentid);
		
		

	}

}
