package practice;
import java.util.Scanner;

class Complex {
	double re,im;
	Complex() {
		this.re = 0.0;
		this.im = 0.0;
	}
	Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	public Complex addNum(Complex c) {
		Complex sum = new Complex();
		sum.re = this.re + c.re;
		sum.im = this.im + c.im;
		return sum;
	}
	public Complex subtractNum(Complex c) {
		Complex diff = new Complex();
		diff.re = this.re - c.re;
		diff.im = this.im - c.im;
		return diff;
	}
	public void display() {
		System.out.println(this.re+"+i("+this.im+")");
	}
}

public class ThreeB {
	public static void main(String[] args) {
		Complex c1 = new Complex(5.3,1.6);
		Complex c2 = new Complex(2.0,3.0);
		c1.display();
		c2.display();
		Complex sum = c1.addNum(c2);
		Complex diff = c1.subtractNum(c2);
		sum.display();
		diff.display();
	}
}
