package practice;
import java.util.Scanner;

class myCircle{
	double radius,perimeter,area,diameter;
	myCircle(){
		this.radius = 0.0;
	}
	myCircle(double radius){
		this.radius = radius;
	}
	public void compute() {
		this.diameter = this.radius * 2;
		this.perimeter = 2*Math.PI*this.radius;
		this.area = Math.PI*this.radius*this.radius;
	}
	public void printCircle() {
		System.out.printf("Radius - %.2f\n",this.radius);
		System.out.printf("Diameter - %.2f\n",this.diameter);
		System.out.printf("Area - %.2f\n",this.area);
		System.out.printf("Perimeter - %.2f\n",this.perimeter);
	}
}

public class TwoA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		myCircle c1 = new myCircle();
		System.out.print("Enter the radius : ");
		c1.radius = sc.nextDouble();
		c1.compute();
		c1.printCircle();
	}
}
