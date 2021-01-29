package practice;
import java.util.Scanner;

class Rectangle {
	double length,breadth;
	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
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
		Rectangle r1 = new Rectangle(10.0,20.0);
		System.out.println(r1.computeArea());
		r1.printRect();
	}
}
