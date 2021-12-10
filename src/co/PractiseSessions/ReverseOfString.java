package co.PractiseSessions;

public class ReverseOfString {

	public static void main(String[] args) {
		 String temp="",s="Interview";
		 char ch;
		 for(int i=0;i<s.length();i++)
		 {	 ch=s.charAt(i);
			 temp=ch+temp;
		 }
		 System.out.println(temp);
	}

}
