package practice;
import java.util.Arrays;
import java.util.Scanner;


class Student{
	String name;
	int[] marks;
	int rollno;
	static int count;
	static {
		count=1;
	}
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		this.name = sc.nextLine();
		this.marks = new int[3];
		this.rollno = count;
		for(int i=0;i<marks.length;i++) {
			System.out.printf("Enter marks in subject %d : ",i+1);
			marks[i] = sc.nextInt();
		}
	}
	double computeAvg() {
		Arrays.sort(marks);
		double avg=0.0;
		int sum = marks[1]+marks[2];
		avg = sum/2;
		return avg;
	}
	void printInfo() {
		System.out.println("Name - "+name);
		System.out.println("Roll Number - "+rollno);
		int i=1;
		for(int x : marks) {
			System.out.printf("Marks in subject %d is %d\n",i,x);
			i++;
		}
		System.out.println("Average - "+this.computeAvg());
	}
}

public class TwoB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of students : ");
		n = sc.nextInt();
		Student[] students = new Student[n];
		System.out.println("");
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			System.out.println("");
		}
		for(int i=0;i<students.length;i++) {
			students[i].printInfo();
			System.out.println("");
		}
	}
}
