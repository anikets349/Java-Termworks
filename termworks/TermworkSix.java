package termworks;
import java.util.Scanner;

abstract class Car{
	String carName;
	int modelName;
	long chassisNum;
	public Car(String carName,int modelName,long chassisNum) {
		this.carName = carName;
		this.modelName = modelName;
		this.chassisNum = chassisNum;
	}
	abstract void startCar();
	abstract void operateSteering();
}

class MarutiCar extends Car{
	public MarutiCar(String carName,int modelName,long chassisNum) {
		super(carName,modelName,chassisNum);
	}
	void startCar() {
		System.out.println("Maruti car started.");
	}
	void operateSteering() {
		System.out.println("Currently driving Maruti car.");
	}
}

class BMWCar extends Car{
	public BMWCar(String carName,int modelName,long chassisNum) {
		super(carName,modelName,chassisNum);
	}
	void startCar() {
		System.out.println("BMW car started.");
	}
	void operateSteering() {
		System.out.println("Currently driving BMW car.");
	}
}

class Driver {
	String name;
	char gender;
	int age;
	public Driver(String name,char gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	void driveCar(Car c) {
		System.out.println("Driver Name - "+name);
		c.startCar();
		c.operateSteering();
		System.out.println("");
	}
}

public class TermworkSix {
	public static void main(String[] args) {
		Car c = new MarutiCar("Swift",2019,1964);
		Driver d = new Driver("Aniket Saha",'M',19);
		d.driveCar(c);
		c = new BMWCar("X3",2016,2641);
		d.driveCar(c);
	}
} 
