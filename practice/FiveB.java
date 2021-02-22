package practice;

class ArrStack {
	int arr[];
	int size,arrTop;
	public ArrStack(int size) {
		this.size = size;
		this.arr = new int[this.size];
		this.arrTop = -1;
		for(int i=0;i<2;i++) {
			arr[++arrTop] = i+1;
		}
	}
	public void push(int ele) {
		if(this.arrTop == (this.size-1)) {
			System.out.println("ERROR: stack overflow");
			return;
		}
		this.arr[++this.arrTop] = ele;
	}
	public int pop() {
		int x = Integer.MIN_VALUE;
		if(this.arrTop==-1) {
			System.out.println("ERROR: stack underflow");
		}
		else {
			x = this.arr[this.arrTop--];
		}
		return x;
	}
	public void display() {
		if(this.arrTop == -1) {
			System.out.println("ERROR: cannot display empty stack");
			return;
		}
		for(int i = this.arrTop;i>=0;i--) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println("");
	}
}

class LinkedStack extends ArrStack {
	Node top;
	LinkedStack(int n){
		super(n);
		top = null;
		for(int i=super.arrTop;i>=0;i--) {
			push(super.arr[i]);
		}
	}
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void push(int ele) {
		Node p = new Node(ele);
		if(top == null) {
			top = p;
		}
		else {
			p.next = top;
			top = p;
		}
	}
	public int pop() {
		int x = Integer.MIN_VALUE;
		if(top == null)
			System.out.println("ERROR: stack underflow");
		else {
			x = top.data;
			top = top.next;
		}
		return x;
	}
	public void display() {
		if(top == null) {
			System.out.println("ERROR: empty stack");
			return;
		}
		Node p = top;
		while(p!=null) {
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println("");
	}
}

public class FiveB {
	public static void main(String[] args) {
		System.out.println("Stack implemented using an array.");
		ArrStack arrStack  = new ArrStack(5);
		arrStack.push(3);arrStack.push(4);arrStack.push(5);arrStack.push(6);
		arrStack.display();
		System.out.println(arrStack.pop());
		System.out.println(arrStack.pop());
		arrStack.display();
		System.out.println("");
		System.out.println("Stack implemented using linked list.");
		LinkedStack stack = new LinkedStack(10);
		stack.push(10);stack.push(20);stack.push(30);
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.display();
	}
}
