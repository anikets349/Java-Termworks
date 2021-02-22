package practice;

interface IAnimal{
	void walk();
	void sleep();
}

interface IBird{
	void fly();
	void peck();
}

interface IHuman{
	void eat();
	void speak();
}

class Bird implements IAnimal,IBird{
	public void walk() {
		System.out.println("A bird can walk.");
	}
	public void sleep() {
		System.out.println("A bird can sleep.");
	}
	public void fly() {
		System.out.println("A bird can fly.");
	}
	public void peck() {
		System.out.println("A bird can peck.");
	}
}

class Human implements IAnimal,IHuman{
	public void walk() {
		System.out.println("A human being can walk.");
	}
	public void sleep() {
		System.out.println("A human being can sleep.");
	}
	public void eat() {
		System.out.println("A human being can eat.");
	}
	public void speak() {
		System.out.println("A human being can speak.");
	}
}

public class Seven {
	public	static void main(String[] args) {
		Bird  b = new Bird();
		Human h = new Human();
		b.walk();b.sleep();b.fly();b.peck();
		System.out.println("");
		h.walk();h.sleep();h.eat();h.speak();
	}
}
