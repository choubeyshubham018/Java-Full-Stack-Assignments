package string_Assignment;

import java.util.Scanner;

//Wap to reverse the Given String.
public class ReverseString {

	public String revString(String str) {
		StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
	ReverseString rs=new ReverseString();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String in which you want to reverse");
    String s1=sc.nextLine();
	System.out.println(rs.revString(s1));
		sc.close(); 
	        }
	}


