package p5725;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int sum = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(sum<10)System.out.print("0"+sum);
				else System.out.print(sum);
				sum++;
			}
			System.out.println();
		}
		System.out.println();
		sum=1;
		int blank = n-1;
		for(int i=0;i<n;i++){
			for(int k=blank;k>0;k--){
				System.out.print("  ");
			}
			for(int j=n-blank;j>0;j--){
				if(sum<10)System.out.print("0"+sum);
				else System.out.print(sum);
				sum++;
			}
			blank--;
			System.out.println();
		}
	}

}
