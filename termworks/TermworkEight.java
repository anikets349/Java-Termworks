package termworks;
import java.util.Scanner;


class License {
	String name;
	char gender,validLL;
	int age,numAcc;
	public License() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the applicant : ");
		name=sc.nextLine();
		System.out.print("Enter the gender : ");
		gender=sc.next().charAt(0);
		System.out.print("Enter the age of the applicant : ");
		sc.nextLine();
		age=Integer.parseInt(sc.nextLine());
		System.out.print("Do you have a valid learning license (y/n) ? ");
		validLL=sc.nextLine().charAt(0);
		System.out.print("Enter the number of accidents you have had : ");
		numAcc=sc.nextInt();
	}
	public void validateData() {
		try {
			if(age<18)
				throw new UnderAgeException("Invalid age.");
			if(validLL=='n')
				throw new InvalidLLException("No learning license.");
			if(numAcc>0)
				throw new AccidentException("Involved in accidents.");
			System.out.println("Applicant data validated.");
			System.out.println("License can be issued.");
		}
		catch(UnderAgeException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(InvalidLLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(AccidentException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}

class UnderAgeException extends Exception {
	UnderAgeException(String s) {
		super(s);
	}
	public String toString() {
		return "Age is less than 18.";
	}
}

class InvalidLLException extends Exception {
	InvalidLLException(String s){
		super(s);
	}
	public String toString() {
		return "No valid learning license found";
	}
}

class AccidentException extends Exception {
	AccidentException(String s){
		super(s);
	}
	public String toString() {
		return "high accident history.";
	}
}

public class TermworkEight {
	public static void main(String[] args) {
		License l1 = new License();
		System.out.println("");
		l1.validateData();
	}
}
