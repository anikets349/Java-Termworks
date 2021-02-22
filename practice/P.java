package practice;
import java.util.Scanner;
import java.util.Arrays;

class MyLinearSearch{ 
	 int linearSearch(int[] c,int key2) { 
		 for(int i=0;i<c.length;i++) { 
			 if(c[i]==key2) {
				 return i; 
			 } 
		 } 
		 return -1; 
	} 
	double linearSearch(double []a,double key) { 
		for(int i=0;i<a.length;i++) { 
			if(a[i]==key) {
				return i; 
			}
		}
		return -1; 
	} 
	int linearSearch(char []a,char key) { 
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i; 
			}
		}
		return -1; 
	} 
}
public class P { 
	public static void main(String[] args) { 
		MyLinearSearch m=new MyLinearSearch(); 
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter the type of element : "); 
		System.out.println("1:integer \t 2:double \t 3:char"); 
		int choice=in.nextInt(); 
		System.out.println("Enter the number of elements : "); 
		int n=in.nextInt(); 
		System.out.println("Enter "+ n+" elements : "); 
		switch(choice) { 
			case 1: 	
				int[]a=new int[n]; 
				for(int i=0;i<n;i++) {
					a[i]=in.nextInt(); 
				}
				System.out.println("Enter the element to be searched : "); 
				int key=in.nextInt(); 
				int position=m.linearSearch(a, key); 
				check(position); 
				break; 
			case 2: 
				double[]a1=new double[n];
				for(int i=0;i<n;i++) {
					a1[i]=in.nextDouble(); 
				}
				System.out.println("Enter the element to be searched : "); 
				double key1=in.nextInt(); 
				int position1=(int)m.linearSearch(a1, key1); 
				check(position1); 
				break; 
			case 3: 
				char[]c=new char[n]; 
				for(int i=0;i<n;i++) {
					c[i]=in.next().charAt(0); 
				}
				System.out.println("Enter the element to be searched : "); 
				char key2= in.next().charAt(0); 
				int position2=(int)m.linearSearch(c, key2); 
				check(position2); 
				break; 
		} 
	} 
	private static void check(int position1) {  
		if(position1>=0) 
			System.out.println("Element is found at index "+(position1+1)); 
		else  
			System.out.println("Element not found\n"); 
		} 
}
