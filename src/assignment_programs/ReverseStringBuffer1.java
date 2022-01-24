//WAP to reverse a string without using string buffer

package assignment_programs;

import java.util.*;

public class ReverseStringBuffer1 {

	public static void main(String[] args) {
	//declared string objects
		String str="",revStr="";
	Scanner in = new Scanner(System.in);	
	
	//input string
	System.out.print("Enter a string :");
	str= in.nextLine();
	
	//get length of the input string
	int len= str. length();
	 
	//code to reverse string
	for (int i = len- 1 ; i >=0 ; i--)
		revStr= revStr+ str.charAt(i);
	
	//print reversed string
	System.out.println("Reverse String is: "+revStr);
	}
}
