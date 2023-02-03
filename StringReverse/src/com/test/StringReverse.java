package com.test;

public class StringReverse {

	public static void main(String[] args) {
		String str="Hello";
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr= revStr+str.charAt(i);
			
		}
		System.out.print("Reverse String is :");
		System.out.println(revStr);
		System.out.println("================================");
	}

}
