package practice;
import java.util.Scanner;

public class OneC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data[][]=new int[4][10];
		String[] zones = new String[] {"North","East","West","South"};
		for(int i=0;i<4;i++) {
			System.out.printf("Enter details of %s zone\n",zones[i]);
			for(int j=0;j<10;j++) {
				System.out.printf("Enter sales done by office %d : ",j+1);
				data[i][j]=sc.nextInt();
			}
			System.out.println("");
		}
		maxSales(data,4,10,zones);
		System.out.println("");
		avgSales(data,4,10,zones);
		System.out.println("");
		minSales(data,4,10,zones);
		System.out.println("");
	}
	public static void maxSales(int[][] data,int m,int n,String[] zones) {
		int max,num;
		for(int i=0;i<m;i++) {
			max=data[i][0];
			num=0;
			for(int j=1;j<n;j++) {
				if(data[i][j]>max) {
					max=data[i][j];
					num=j;
				}
			}
			System.out.printf("Office %d of %s zone has maximum sales of %d\n",(num+1),zones[i],max);
		}
	}
	public static void avgSales(int[][] data,int m,int n,String[] zones) {
		double avg=0.0;
		int sum=0,i,j;
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				sum += data[i][j];
			}
			avg=sum/4;
			System.out.printf("Average sales of %s zone is %.3f\n",zones[i],avg);
		}
	}
	public static void minSales(int[][] data,int m,int n,String[] zones) {
		int min,num;
		for(int i=0;i<m;i++) {
			min=data[i][0];
			num=0;
			for(int j=1;j<n;j++) {
				if(data[i][j]<min) {
					min=data[i][j];
					num=j;
				}
			}
			System.out.printf("Office %d of %s zone is poorly performing\n",(num+1),zones[i]);
		}
	}
}

