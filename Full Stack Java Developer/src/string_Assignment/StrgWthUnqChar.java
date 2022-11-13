package string_Assignment;

import java.util.HashSet;
import java.util.Scanner;

//Ques->WAP to find if String contains all unique characters.
public class StrgWthUnqChar extends BasicString {

	public void chckingUnqChar(String str) {
		str=toLower(removeSpaces(str));
		HashSet<Character>hash=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(hash.contains(str.charAt(i))) {//-> if char is already in the HashSet that means the char is repeated .
				System.out.println("The Characters in this String are not Unique");
				return;
			}
			hash.add(str.charAt(i));
		}
		//if no char is repeated that mens String char are unique
		System.out.println(" The Characters in this String are Unique");
	}
	
	public static void main(String[] args) {
		StrgWthUnqChar srch=new StrgWthUnqChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want check for all unique characters");
        String s1=sc.nextLine();
        srch.chckingUnqChar(s1);
        sc.close();
	}

}
