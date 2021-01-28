package practice;
import java.util.Scanner;

class Lamp {
	boolean isOn;
	Lamp() {
		isOn = false;
	}
	public void turnOn() {
		if(!this.isOn) {
			isOn = true;
		}
		System.out.println("Lamp turned on.");
	}
	public void turnOff() {
		if(this.isOn) {
			isOn = false;
		}
		System.out.println("Lamp switched off.");
	}
	public void displayLightStatus() {
		if(this.isOn)
			System.out.println("Lamp is on.");
		else
			System.out.println("Lamp is off.");
	}
}
public class TwoC {
	public static void main(String[] args) {
		Lamp l1,l2;
		l1 = new Lamp();
		l2 = new Lamp();
		l1.turnOn();
		l2.turnOff();
		l1.displayLightStatus();
		l2.displayLightStatus();
	}
}
