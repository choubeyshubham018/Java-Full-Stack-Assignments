package string_Assignment;

import java.util.Scanner;

//ques-> WAP to find the maximum occurring character in a String.


public class MaxOccuringChar extends BasicString {

	public char fndgMaxOccrChar(String str) {
		str=toLower(removeSpaces(str));
		int[]arr=new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i) % 97]+=1; //-> updating the number of char in the corresponding index of our array.
		}
		int max=0;
	    for(int i=0;i<arr.length;i++) {
		if(arr[i]>arr[max]) max=i;
		}
		System.out.println("The max char occuring in the given String is: "+ (char)(97+max));
		return (char)(97+max);//give the first char which is present max number of times in the String.
	}
	public static void main(String[] args) {
		MaxOccuringChar mx=new MaxOccuringChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String in which you want to find the max occurring Character");
        String s1=sc.nextLine();
		mx.fndgMaxOccrChar(s1);
        sc.close();
	}

}
