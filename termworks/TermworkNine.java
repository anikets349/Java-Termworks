package termworks;
import java.util.Scanner;


public class TermworkNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		str = str +" ";
		String subStr = "";
		char c;
		for(int i=0;i<str.length();i++){
			c = str.charAt(i);
			if(c!=' ') {
				subStr = subStr + c;
			}
			else {
				checkPalindrome(subStr,0,subStr.length()-1);
				subStr = "";
			}
		}
	}
	public static void checkPalindrome(String str,int s,int e) {
		String revStr = reverse(str,s,e);
		if(revStr.equals(str)) {
			System.out.println(str.toUpperCase());
		}
		else {
			System.out.println(revStr.toLowerCase());
		}
	}
	public static String reverse(String str,int s,int e) {
		String substr="";
		for(int i=e;i>=s;i--) {
			substr = substr+str.charAt(i);
		}
		return substr;
	}
}
