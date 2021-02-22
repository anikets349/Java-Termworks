package termworks;
import java.util.Scanner;

class MyBankAccount {
	static int count=1;
	int accNo;
	String accType,name,address;
	double accBalance;
	double interest;
	//default constructor
	MyBankAccount() {
		Scanner sc = new Scanner(System.in);
		this.accNo = count++;
		System.out.print("Enter holder name : ");
		this.name = sc.nextLine();
		System.out.print("Enter address : ");
		this.address = sc.nextLine();
		System.out.print("Enter account type (SB|RD|FD) : ");
		this.accType = sc.nextLine();
		System.out.print("Enter initial balance : ");
		this.accBalance = sc.nextDouble();
		interest=0.0;
	}
	//parameterized constructor
	MyBankAccount(String type,String name,String address,double balance){
		this.accNo = count++;
		this.accType = type;
		this.name = name;
		this.address = address;
		this.accBalance = balance;
		interest = 0.0;
	}
	public void computeInterest() {
		switch(accType) {
			case "SB":	interest = accBalance * 0.05;
						break;
			case "RD": 	interest = accBalance * 0.065;
						break;
			case "FD": 	interest = accBalance * 0.0765;
			break;
		}
		accBalance += interest;
	}
	public void withdrawAmt(double amt) {
		if(accBalance-amt<1000 || accBalance<amt)
			System.out.println("Insufficient Balance");
		else {
			accBalance -= amt;
			System.out.println("Withdrawal successful");
			System.out.println("Main account balance is now Rs."+accBalance+"/-");
		}
	}
	public void depositAmt(double amt) {
		if(amt<=0)
			System.out.println("Invalid amount");
		else {
			accBalance += amt;
			System.out.println("Money successfully deposited");
			System.out.println("Main account balance is now Rs."+accBalance+"/-");
		}
	}
	public void printDetails() {
		System.out.println(accNo+"\t"+accType+"\t"+name+"\t"+accBalance+"\t"+interest);
	}
}

public class TermworkThree {
	public static void main(String[] args) {
		MyBankAccount a1 = new MyBankAccount("SB","Aniket Saha","Belagavi",1000);
		a1.depositAmt(1000.0);
		a1.withdrawAmt(5000.0);
		a1.computeInterest();
		System.out.println("");
		
		MyBankAccount a2 = new MyBankAccount("RD","Abhijit Saha","Mysuru",15000);
		a2.computeInterest();
		
		MyBankAccount a3 = new MyBankAccount("FD","Madhumita Saha","Kolkata",10000);
		a3.withdrawAmt(20000);
		a3.depositAmt(0);
		a3.computeInterest();
		System.out.println("");
		
		System.out.printf("%-8s%-8s%-16s%-8s%s\n","Acc.No.","Type","Name","Balance","Interest");
		a1.printDetails();
		a2.printDetails();
		a3.printDetails();
	}
}
