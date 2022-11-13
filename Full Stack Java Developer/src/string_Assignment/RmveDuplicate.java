package string_Assignment;

import java.util.HashSet;
import java.util.Scanner;

//ques->WAP to remove Duplicates from a String.
public class RmveDuplicate {
	
	public static String removeDuplicate(String str) {
	// Using HashSet Removing Duplicate Characters in a String
		HashSet<Character>s=new HashSet<>();
		str=str.replace(" ", "").toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));
		}
		str=s.toString();	
		return str;
		//Provide the String with Unique Characters but not in older order.
	}

	
	//Removing the Duplicate Element Using Linear method
	public static String rmveDuplicate(String str) {
		char[]arr=str.toLowerCase().strip().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==' ' || arr[i]==' ') continue;
				if(arr[i]==arr[j]) {
					arr[j]='0';
		}
	}
         }
		str=new String(arr);
		str=str.replace("0", "");
		return str;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String in which you want to remove Duplicates");
		String str=sc.nextLine();
        //System.out.println(RmveDuplicate.removeDuplicate(str));
	    System.out.println(RmveDuplicate.rmveDuplicate(str));
	    sc.close();
	}

}
