package string_Assignment;

import java.util.HashSet;
import java.util.Scanner;

//ques->WAP to count the number of consonants, vowels, special characters in a String.
public class CountConsVowlSpeclChar extends BasicString{

	public void countDIffChar(String str) {
		str=removeSpaces(toLower(str));//converting all the char in the String to lower case and removing the blank spaces.
		int cnst=0,vowl=0,spclChar=0;
		HashSet<Character>hash=new HashSet<>();
		//adding all the vowels in the HashSet
		hash.add('a');
		hash.add('e');
		hash.add('i');
		hash.add('o');
		hash.add('u');
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>96 && str.charAt(i)<=222 )//->that means the char lie between a to z. 
			{
				if(hash.contains(str.charAt(i))) vowl++;
				else cnst++;// If the char found between the range and is not a vowel that means that the char is consonant.
			}
			else {//any char out of the range is a Special char.
				spclChar++;
			}
		}
		System.out.println(" The number of Vowels: "+vowl+"\n  The number of Consonant :"+cnst+"\n The number of Special Character :"+spclChar);
	}
	public static void main(String[] args) {
		CountConsVowlSpeclChar cs=new CountConsVowlSpeclChar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String whose number of Vowels,Consonant & Specil Chracters you want to count");
		String str=sc.nextLine();
		cs.countDIffChar(str.toLowerCase());
		sc.close();

	}

}
