package p1161XOR;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int ans = 0;
		for(int i=0;i<n;i++){
			double a = cin.nextDouble();
			int t = cin.nextInt();
			for(int j=1;j<=t;j++){
				int now = ((int)Math.floor(j*a));
				ans^=now;
			}
		}
		System.out.println(ans);
	}

}

