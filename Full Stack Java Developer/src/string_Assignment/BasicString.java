package string_Assignment;

// this class contains the Basic method required to solve all the Assignment Question.
public class BasicString {
	//to convert all the char of the String to Lower Case
	public String toLower(String str) {
		char[]ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]+=32;
			}
		}
		return new String(ch);
	}
	
	//To remove all the blank Spaces Present in the String
	public String removeSpaces(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') continue;
			sb.append(str.charAt(i));
		}
		return new String(sb);
	}
	
	public static void main(String[] args) {
		
	}
    }
    
	