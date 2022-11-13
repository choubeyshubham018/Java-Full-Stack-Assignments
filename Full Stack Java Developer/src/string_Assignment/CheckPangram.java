package string_Assignment;

import java.util.Scanner;
//ques->WAP to implement Pangram Checking with least inbuilt methods being used.
public class CheckPangram extends BasicString{
	
	public void checkPangram(String s1) {
		//Using method of Parent class-> not the built in method
		String str=toLower(removeSpaces(s1));
		if(str.length()<26) {
			System.out.println("The String is not Pangram.");
			return;
		}
		
	int[]arr=new int[26];
	for(int i=0;i<str.length();i++) {
		arr[str.charAt(i) % 97]+=1; //-> updating the number  of char at the corresponding index of our array.
	}
	
	for(int a:arr) {
		//if any value in the array is 0 ,it means that the corresponding char is not present in the String.hence String is not a Pangram.
		if(a<1) {
			System.out.println("The String is not Pangram");
		return;
		}
	}
	System.out.println("The String is Pangram");
	}
	
	public static void main(String[] args) {
	CheckPangram cp=new CheckPangram();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String you want to check for Pangram");
	String str=sc.nextLine();
	cp.checkPangram(str);			
    sc.close();
	}

}
