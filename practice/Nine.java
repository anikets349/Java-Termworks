package practice;
import java.util.Scanner;
import java.util.Arrays;

public class Nine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string : ");
		String str2 = sc.nextLine();
		checkAnagrams(str1,str2);
	}
	public static void checkAnagrams(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("Cannot check strings for anagrams.");
			System.exit(0);
		}
		else {
			char a[] = new char[s1.length()];
			a = s1.toCharArray();
			char b[] = new char[s2.length()];
			b = s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a,b))
				System.out.printf("%s and %s are anagrams\n",s1,s2);
			else
				System.out.printf("%s and %s are not anagrams\n",s1,s2);
		}
	}
}
