package termworks;
import java.util.Scanner;

class Employee{
	String name,address;
	int age;
	char gender;
	double salary;
	public Employee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the employee : ");
		name = sc.nextLine();
		System.out.print("Enter the age of the employee : ");
		age = sc.nextInt();
		System.out.print("Enter the gender of the employee : ");
		sc.nextLine();
		gender = sc.nextLine().charAt(0);
		System.out.print("Enter the address of the employee : ");
		address = sc.nextLine();
	}
	void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
	}
}

class FTEmployee extends Employee{
	double da,hra,it,basic;
	FTEmployee(){
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee's basic salary : ");
		basic = sc.nextDouble();
		super.salary = basic;
	}
	void computeSalary() {
		da = basic*0.75;
		hra = basic*0.075;
		it = basic*0.1;
	}
	void displayDetails() {
		System.out.println("");
		System.out.println("Full Time Employee details");
		super.displayDetails();
		System.out.println("Dearness Allowance : "+da);
		System.out.println("House Rent Allowance : "+hra);
		System.out.println("Income Tax : "+it);
		System.out.println("");
	}
}

class PTEmployee extends Employee {
	String qual;
	int exp,hoursWorked;
	PTEmployee(){
		super();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee's qualification : ");
		qual = sc.nextLine();
		qual = qual.toUpperCase();
		System.out.print("Enter the employee's experience : ");
		exp = sc.nextInt();
		System.out.print("Enter the number of hours worked : ");
		hoursWorked = sc.nextInt();
		super.salary = 0.0;
	}
	void computeSalary() {
		switch(qual) {
		case "BE" : if(exp>=1 && exp<=5) {
						super.salary = hoursWorked*300;
					}
					else if(exp>=6 && exp<=10) {
						super.salary = hoursWorked*400;
					}
					else {
						super.salary = hoursWorked*500;
					}
					break;
		case "MTECH" : if(exp>=1 && exp<=5) {
							super.salary = hoursWorked*500;
						}
						else if(exp>=6 && exp<=10) {
								super.salary = hoursWorked*700;
						}
						else {
							super.salary = hoursWorked*1000;
						}
						break;
		case "PHD" : 	if(exp>=1 && exp<=5) {
						super.salary = hoursWorked*800;
						}			
						else if(exp>=6 && exp<=10) {
							super.salary = hoursWorked*1200;
						}
						else {
							super.salary = hoursWorked*1500;
						}
						break;
		}
	}
	void displayDetails() {
		System.out.println("");
		System.out.println("Part Time Employee details");
		super.displayDetails();
		System.out.println("Qualification : "+qual);
		System.out.println("Experience in years : "+exp);
		System.out.println("Hours worked : "+hoursWorked);
		System.out.println("");
	}
}

public class TermworkFour {
	public static void main(String[] args) {
		FTEmployee f1 = new FTEmployee();
		f1.computeSalary();
		System.out.println("");
		PTEmployee p1 = new PTEmployee();
		p1.computeSalary();
		System.out.println("");
		f1.displayDetails();
		System.out.println("");
		p1.displayDetails();
	}
}
