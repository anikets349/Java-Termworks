package practice;
import java.util.Scanner;

abstract class Shape {
	double area,perimeter;
	String type;
	public abstract void computeArea();
	public abstract void computePerimeter();
	public void display() {
		System.out.println(type);
		System.out.println("Area : "+area);
		System.out.printf("Perimeter : %.3f\n",perimeter);
	}
}

class SixCircle extends Shape{
	double radius;
	public SixCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius = sc.nextDouble();
		super.type = "circle";
	}
	public void computeArea() {
		area =  Math.PI*radius*radius;
	}
	public void computePerimeter() {
		perimeter =  2*Math.PI*radius;
	}
}

class SixRectangle extends Shape {
	double length,breadth;
	public SixRectangle() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the length of the rectangle : ");
		length = sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle : ");
		breadth = sc.nextDouble();
		super.type = "rectangle";
	}
	public void computeArea() {
		area = length*breadth;
	}
	public void computePerimeter() {
		perimeter =  2*(length+breadth);
	}
}

class SixTriangle extends Shape {
	double base,height;
	public SixTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the triangle : ");
		base = sc.nextDouble();
		System.out.print("Enter the height of the triangle : ");
		height = sc.nextDouble();
		super.type = "triangle";
	}
	public void computeArea() {
		area =  0.5*base*height;
	}
	public void computePerimeter() {
		perimeter =  2*height+base;
	}
}

public class Six {
	public static void main(String[] args) {
		Shape s;
		SixCircle c = new SixCircle();
		SixRectangle r = new SixRectangle();
		SixTriangle t = new SixTriangle();
		s=c;
		s.computeArea();
		s.computePerimeter();
		s.display();
		System.out.println("");
		s=r;
		s.computeArea();
		s.computePerimeter();
		s.display();
		System.out.println("");
		s=t;
		s.computeArea();
		s.computePerimeter();
		s.display();
	}
}
