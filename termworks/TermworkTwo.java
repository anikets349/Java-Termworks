package termworks;
import java.util.Scanner;

class Triangle{
	double a,b,c;
	void determineType() {
		if(a==b && b==c)
			System.out.println("equilateral");
		else if(a==b || b==c || a==c)
			System.out.println("isosceles");
		else 
			System.out.println("scalene");
	}
	double computeArea() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
public class TermworkTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle t1 = new Triangle();
		System.out.println("Enter the three sides");
		t1.a=sc.nextDouble();
		t1.b=sc.nextDouble();
		t1.c=sc.nextDouble();
		t1.determineType();
		System.out.printf("%.3f\n",t1.computeArea());
	}
}
