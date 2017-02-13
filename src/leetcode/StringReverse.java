package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("input String:");
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		System.out.println("you input is : "+ s);
		String string=reverString(s);
		
		System.out.println(string);
		
	}
	public static String reverString(String s) {
		char[] c;
		
		c=s.toCharArray();
		System.out.println(c);
		int n=s.length();
		for(int i=0;i<n/2;i++){	
			char temp=c[i];
			c[i]=c[n-1-i];
			c[n-1-i]=temp;
		}
//	   String a=new String(c);
	  
	   
		return String.valueOf(c);
	}
}
