package p1007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int L = cin.nextInt();
		int N = cin.nextInt();
		int minsum =0 ;
		int maxsum =0;
		for(int i=0;i<N;i++){
			int now =0;
			now = cin.nextInt();
			minsum = Math.max(minsum, Math.min(now-0,L+1-now));
			maxsum = Math.max(maxsum,Math.max(now-0,L+1-now));
		}
		System.out.println(minsum+" "+maxsum);
	}

}
