package practice;
import java.util.Scanner;

class OddNumberException extends Exception {
	OddNumberException(String m){
		super(m);
	}
	public String toString() {
		return "You just entered an odd number.";
	}
}

public class Eight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		try {
			if(num%2!=0) {
				throw new OddNumberException("odd number encountered");
			}
			else
				System.out.println("You entered an even number.");
		}
		catch(OddNumberException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}
