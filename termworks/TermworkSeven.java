package termworks;
import java.util.Scanner;

interface iPrime {
	boolean isPrime(int n);
}

class PrimeTester implements iPrime {
	public boolean isPrime(int n) {
		for(int i=2;i<n-1;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

class ImprPrimeTester implements iPrime {
	public boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

class FasterPrimeTester implements iPrime {
	public boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

class FastestPrimeTester implements iPrime {
	public boolean isPrime(int n) {
		int a=2;
		if(Math.pow(a,n) - a % n ==0)
			return false;
		return true;
	}
}

public class TermworkSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		iPrime i1 = new PrimeTester();
		iPrime i2 = new ImprPrimeTester();
		iPrime i3 = new FasterPrimeTester();
		iPrime i4 = new FastestPrimeTester();
		System.out.println(i1.isPrime(n));
		System.out.println(i2.isPrime(n));
		System.out.println(i3.isPrime(n));
		System.out.println(i4.isPrime(n));
	}
}
