package string_Assignment;

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
	System.out.println(rs.revString("ineuron java"));

	}

}
