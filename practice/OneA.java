package practice;
import java.util.Scanner;


public class OneA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] brands = {"Maruti Suzuki","Hyundai","Tata Motors","Kia","BMW","Renault"};
		String[] month = {"January","February","March","April","May","June","July",
		"August","September","October","November","December"};
		int[][] data = new int[2][12];
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter data of "+brands[i]);
			for(int j=0;j<data[0].length;j++) {
				System.out.printf("Enter cars sold in %s : ",month[j]);
				data[i][j] = sc.nextInt();
			}
			System.out.println("");
		}
		maxCarsSold(data,brands,month,data.length,data[0].length);
		avgCarsSold(data,brands,data.length,data[0].length);
		totalCarsSold(data,brands,data.length,data[0].length);
	}
	static void maxCarsSold(int[][] data, String[] brands,String[] month, int m, int n) {
		int max,ind;
		for(int i=0;i<m;i++) {
			max = data[i][0];
			ind = 0;
			for(int j=1;j<n;j++) {
				if(max<data[i][j]) {
					max = data[i][j];
					ind = j;
				}
			}
			System.out.printf("Maximum cars sold by %s is %d in %s\n",brands[i],max,month[ind]);
		}
		System.out.println("");
	}
	static void avgCarsSold(int[][] data, String[] brands, int m, int n) {
		int sum;
		double avg;
		for(int i=0;i<m;i++) {
			sum = 0;
			avg=0.0;
			for(int j=0;j<n;j++) {
				sum += data[i][j];
			}
			avg = sum / n;
			System.out.printf("Average cars sold by %s is %f\n",brands[i],avg);
		}
		System.out.println("");
	}
	static void totalCarsSold(int[][] data, String[] brands, int m, int n) {
		int sum;
		for(int i=0;i<m;i++) {
			sum = 0;
			for(int j=0;j<n;j++) {
				sum += data[i][j];
			}
			System.out.printf("Total cars sold by %s is %d\n",brands[i],sum);
		}
	}
}
