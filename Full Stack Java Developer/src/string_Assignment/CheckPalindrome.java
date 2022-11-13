package string_Assignment;

import java.util.Scanner;

//ques->WAP to check if “2552” is palindrome or not.
public class CheckPalindrome {
	
	public static void checkPalindrome(String str) {
		int mid=(str.length()-1)/2;
		boolean temp=false;
		//comparing the char present from 'start to middle index' to 'last to middle-1 index'.
		//if all are char matched then the String is Palindrome else not.
		for(int i=0,j=str.length()-1;i<=mid && j>mid;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				temp=true;
				break;
			}
		}
		//Checking that the chars have been matched or not.
		if(temp) System.out.println("String is not Palindrome");
		else System.out.println("String is Palindrome");
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String you want to check for Palindrome");
	 String str=sc.nextLine();
	 CheckPalindrome.checkPalindrome(str.toLowerCase());
	 sc.close();

	}

}
