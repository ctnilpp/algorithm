package p5706;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double t = cin.nextDouble();
		int num = cin.nextInt();
		System.out.println(df.format(t/num));
		System.out.println(num*2);
	}

}