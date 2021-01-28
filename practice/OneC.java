package practice;
import java.util.Scanner;

public class OneC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[5][3];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the marks obtained by student "+(i+1));
			for(int j=0;j<3;j++) {
				System.out.printf("Enter marks in subject %d : ",j+1);
				scores[i][j] = sc.nextInt();
			}
			System.out.println("");
		}
		int[] sum = computeSum(scores,5,3);
		double[] avg = computeAvg(sum,5);
		for(int i=0;i<sum.length;i++) {
			System.out.println("Student "+(i+1));
			System.out.println("Total Marks - "+sum[i]);
			System.out.println("Average Marks - "+avg[i]);
			System.out.println("");
		}
	}
	static int[] computeSum(int[][] scores,int m,int n) {
		int[] sum = new int[5];
		int s;
		for(int i=0;i<m;i++) {
			s=0;
			for(int j=0;j<n;j++) {
				s += scores[i][j];
			}
			sum[i] = s;
		}
		return sum;
	}
	static double[] computeAvg(int[] sum,int n) {
		double[] avg = new double[5];
		for(int i=0;i<n;i++) {
			avg[i] = sum[i]/3;
		}
		return avg;
	}
}
