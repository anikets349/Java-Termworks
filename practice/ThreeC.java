package practice;
import java.util.Scanner;

class IndMoney {
	int rupees,paise;
	IndMoney() {
		this.rupees = 0;
		this.paise = 0;
	}
	IndMoney(int rupees,int paise) {
		this.rupees = rupees;
		this.paise = paise;
		if(paise>99) {
			this.rupees += this.paise/100;
			this.paise = this.paise%100;
		}
	}
	IndMoney addMoney(IndMoney i) {
		int r,p;
		r = this.rupees+i.rupees;
		p = this.paise+i.paise;
		IndMoney total = new IndMoney(r,p);
		return total;
	}
	void printMoney() {
		System.out.printf("%d rupees and %d paise\n",rupees,paise);
	}
}


public class ThreeC {
	public static void main(String[] args) {
		IndMoney x = new IndMoney(12,80);
		IndMoney y = new IndMoney(8,90);
		IndMoney z = x.addMoney(y);
		x.printMoney();
		y.printMoney();
		z.printMoney();
	}
}
