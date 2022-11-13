package string_Assignment;
import java.util.Scanner;
	
//que->WAP to implement Anagram Checking least inbuilt methods being used.

   public class CheckAnagrams extends BasicString {
	
	   public void checkAnagram(String s1,String s2) {
		   // converting both the String in Char Array ,So that the updating the value in the String become easy.
		char[]ch1= removeSpaces(toLower(s1)).toCharArray();
		char[]ch2= removeSpaces(toLower(s2)).toCharArray();
		if(ch1.length!=ch2.length) {
			System.out.println("Strings are not Anagram ");
			return;
		}
		for(int i=0;i<ch1.length;i++) {
			boolean a=true;
			for (int j = 0; j < ch1.length; j++) {
				if(ch1[i]==ch2[j]) {
					ch2[j]='1';//->making it one because it will not repeat for duplicate values.
					a=false;
					break;
				}
			}
				if(a) {// means that the given char of Sring1 have not been found in the String2
					System.out.println("String are not Anagrams");
					return;
				}
				
			}
			System.out.println("Strings are Anagram");
		}
		
	
    
	
	public static void main(String[] args) {
		CheckAnagrams ca=new CheckAnagrams();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String you want to check for Anagram");
		String str1=sc.nextLine();
		System.out.println("Enter the Second String");
		String str2=sc.nextLine();
		ca.checkAnagram(str1, str2);
		sc.close();
	}

}
