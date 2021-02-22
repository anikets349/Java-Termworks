package termworks;
import java.util.Arrays;
import java.util.Scanner;

public class TermworkOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[5][3];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the marks obtained by student "+(i+1));
			for(int j=0;j<3;j++) {
				System.out.printf("Enter marks in subject %d : ",j+1);
				scores[i][j] = sc.nextInt();
			}
			Arrays.sort(scores[i]);
			System.out.println("");
		}
		int[] sum = computeSum(scores,scores.length,scores[0].length);
		double[] avg = computeAvg(scores,scores.length,scores[0].length);
		for(int i=0;i<scores.length;i++) {
			System.out.println("Student "+(i+1));
			System.out.println("Total Marks - "+sum[i]);
			System.out.println("Average Marks - "+avg[i]);
			System.out.println("");
		}
	}
	static int[] computeSum(int[][] scores,int m,int n) {
		int[] sum = new int[m];
		for(int i=0;i<m;i++) {
			int s=0;
			for(int j=0;j<n;j++) {
				s += scores[i][j];
			}
			sum[i] = s;
		}
		return sum;
	}
	static double[] computeAvg(int[][] scores,int m,int n) {
		double[] avg = new double[m];
		for(int i=0;i<m;i++) {
			int sum = scores[i][1]+scores[i][2];
			double av = sum/2.0;
			avg[i]=av;
		}
		return avg;
	}
}