package com.xdemo;

public class Segrigate0and1 {

	public static void main(String[] args) {
		
		int []a = {1,0,1,1,0,1,0,0,0,1};
		int left = 0;
		int r = a.length-1;
		
		while(left<=r) {
			while(a[left] == 0) {
				left++;
			}
			while(a[r] == 0) {
				r++;
			}
			if(left<=r) {
				a[left]=0;
				a[r]=1;
				left++;
				r++;
			}
		}
		
		System.out.println(a);
	}
}
