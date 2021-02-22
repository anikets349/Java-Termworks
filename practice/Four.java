package practice;
import java.util.Scanner;

class Circle{
	String color;
	double radius;
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

class Cylinder extends Circle {
	double height;
	public Cylinder() {
		super();
		height = 1.0;
	}
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public Cylinder(double height,double radius) {
		super(radius);
		this.height = height;
	}
	public Cylinder(double height,double radius,String color) {
		super(radius,color);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	
}
public class Four {
	public static void  main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Radius of circle : "+c1.getRadius());
		System.out.println("Color of the circle : "+c1.getColor());
		c1.setColor("green");
		c1.setRadius(2.31);
		System.out.println("Radius of circle : "+c1.getRadius());
		System.out.println("Color of the circle : "+c1.getColor());
		System.out.printf("Area of the circle : %.3f\n",c1.getArea());
		System.out.println("");
		Cylinder c2 = new Cylinder(3.0,1.0,"violet");
		System.out.println("Radius of cylinder : "+c2.getRadius());
		System.out.println("Height of cylinder : "+c2.getHeight());
		System.out.printf("Volume of cylinder : %.3f\n",c2.getVolume());
		System.out.println("Color of the cylinder : "+c2.getColor());
	}
}
