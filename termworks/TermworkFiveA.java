package termworks;
import java.util.Scanner;

class MyStack{ 
	int []elem; int top; 
	void initStack(int size) { 
		elem=new int[size];
		top=-1; 
	} 
	void initStack(MyStack another) { 
		elem=new int[another.elem.length]; 
		top=-1; 
		for(int e:another.elem) { 
			push(e); 
		} 
	} 
	void initStack(int []a) { 
		elem=new int[a.length]; 
		top=-1; 
		for(int e:a) {
			push(e); 
		} 
	} 
	void push(int e) { 
		if(isfull()) { 
			System.out.println("stack overflow"); 
		} 
		else 
			{ 	
			elem[++top]=e; 
			System.out.println("pushed into the stack:"+e); 
		} 
	} 
	void pop() { 
		if(isEmpty()) 
			System.out.println("Stack underFlow "); 
		else 
			System.out.println("element is popped is :"+ elem[top--]); 
	} 
	void peek() { 
		if(isEmpty()) 
			System.out.println("nothing is on the top "); else  
	 	System.out.println("element on top is:"+elem[top]); 
	} 
	boolean isfull() { 
		return top==elem.length-1 ? true:false; 
	} 
	boolean isEmpty() { 
		return top==-1 ?true:false; 
	} 
} 
public class TermworkFiveA { 
	public static void main(String[] args) { 
		MyStack s1= new MyStack(); 
		s1.initStack(5); 
		s1.push(10); 
		s1.push(20); 
		s1.push(30); 
		s1.push(40); 
		s1.push(50); 
		s1.push(60); 
		MyStack s2=new MyStack(); 
		s2.initStack(s1); 
		s2.pop(); 
		s2.pop(); 
		s2.pop(); 
		s2.pop(); 
		s2.pop(); 
		s2.pop(); 
		s2.peek(); 
		int[]a = {1,2,3,4,5,6}; 
		MyStack s3=new MyStack(); 
		s3.initStack(a); 
		s3.peek(); 
		s3.pop(); 
		s3.pop(); 
		s3.pop(); 
	} 
}  
