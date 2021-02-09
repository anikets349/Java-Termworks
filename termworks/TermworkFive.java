package termworks;
import java.util.Scanner;

class Stack {
	int[] arr;
	int size;
	int top;
	Stack(int size){
		this.size = size;
		this.top = -1;
		this.arr = new int[this.size];
		System.out.println("Empty stack initialized");
	}
	void push(int ele) {
		if(top==size-1)
			System.out.println("ERROR: STACK OVERFLOW");
		else {
			arr[++top] = ele;
			System.out.println(ele+" pushed in stack");
		}
	}
	void display() {
		int i = this.top;
		while(i>=0) {
			System.out.printf("%d ",arr[i]);
			i--;
		}
		System.out.println("");
	}
	int pop() {
		if(this.top==-1) {
			System.out.println("ERROR: stack underflow");
			return -32767;
		}
		else
			return this.arr[this.top--];
	}
}


public class TermworkFive {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.pop());
		st.display();
	}
}
