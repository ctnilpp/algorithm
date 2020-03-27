package p5726;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin =  new Scanner(System.in);
		int n = cin.nextInt();
		int max = 0;
		int sum = 0;
		int min = (1<<31)-1;
		for(int i=0;i<n;i++){
			int now =0;
			now = cin.nextInt();
			sum+=now;
			max = max<now?now:max;
			min = min>now?now:min;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		double result = (sum-max-min)*1.0/(n-2);
		System.out.println(df.format(result));
	}

}
