package string_Assignment;

import java.util.HashSet;
import java.util.Scanner;

//ques-> WAP to print Duplicates characters from the String.
public class PrintDupChar extends BasicString{
   
	public void prntDuplicate(String str) {
		str=removeSpaces(toLower(str));
		StringBuilder sb=new StringBuilder();
		HashSet<Character>hash=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			//if char is already present in the HashSet that means that char has duplicate value in the String.
			if(hash.contains(str.charAt(i))) sb.append(str.charAt(i));//->adding the repeated char in StringBuilder 'sb'.
			else {
				hash.add(str.charAt(i));
			}
		}
		if(sb.length()<1) {//if String Builder length is 0 that means String does not have any duplicate char.
			System.out.println("The String doesnot have any Duplicate value");
		}
		else {
		System.out.println("The Repeated char in the given String are :"+sb);
	}
	}
	public static void main(String[] args) {
		PrintDupChar dup=new PrintDupChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String in which you want to print the Duplicate char");
        String s1=sc.nextLine();
        dup.prntDuplicate(s1);
		sc.close();

	}

}
