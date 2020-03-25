package p5719;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int now = 1*k;
		int nownum =0;
		sum1 = n*(n+1)/2;
		while(now<=n){
			sum2+=now;
			sum1-=now;
			now+=k;
			nownum+=1;
		}
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format(sum2*1.0/nownum)+" "+df.format(sum1*1.0/(n-nownum)));
	}

}
