package practice;
import java.util.Scanner;

class Rectangle {
	double length,breadth;
	Rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length in meters : ");
		this.length = sc.nextDouble();
		System.out.print("Enter breadth in meters : ");
		this.breadth = sc.nextDouble();
	}
	public double computeArea() {
		double avg = 0.0;
		avg = length*breadth;
		return avg;
	}
	public void printRect() {
		System.out.printf("%.2fx%.2f rectangle of area %.2f",length,breadth,this.computeArea());
	}
}

public class ThreeA {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		double ans = r1.computeArea();
		if(ans>=0) {
			System.out.println(ans);
			r1.printRect();
		}
		else {
			System.out.println("Incorrect dimensions");
		}
	}
}
