package p5721;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int sum =1;
		for(int i=n;i>=1;i--){
			for(int j=i;j>0;j--){
				if(sum<10){
					System.out.print("0"+sum);
					sum++;
				}
				else {
					System.out.print(sum);
					sum++;
				}
			}
			System.out.println();
		}
	}

}
