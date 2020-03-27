package p5722;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		long sum = 0;
		for(int i =1;i<=n;i++){
			sum+=i;
		}
		System.out.print(sum);
	}

}
