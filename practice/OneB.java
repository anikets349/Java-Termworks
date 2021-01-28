package practice;
import java.util.Scanner;


public class OneB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] data = new double[10][12];
		for(int i=0;i<data.length;i++) {
			System.out.printf("Enter the details of household %d\n",(i+1));
			for(int j=0;j<data[0].length;j++) {
				System.out.printf("Month %d : ",(j+1));
				data[i][j] = sc.nextDouble();
			}
			System.out.println("");
		}
		
		consumptions(data,data.length,data[0].length);
	}
	static void consumptions(double[][] data, int m, int n) {
		double max,min,avg,sum;
		System.out.printf("%-12s%-15s%-15s%-15s\n","HOUSEHOLD","MAXIMUM","MINIMUM","AVERAGE");
		for(int i=0;i<m;i++) {
			max=data[i][0];
			min=max;
			sum = data[i][0];
			avg = 0.0;
			for(int j=1;j<n;j++) {
				sum += data[i][j];
				
				if(max<data[i][j]) {
					max  = data[i][j];
				}
				if(min>data[i][j]) {
					min = data[i][j];
				}
			}
			avg = sum/12;
			System.out.printf("%-12d\t%-15.3f\t%-15.3f\t%-15.3f\n",i+1,max,min,avg);
//			System.out.printf("%d%17.3f%10.3f\n",i+1,max,min);
		}
		System.out.println("");
	}
}
