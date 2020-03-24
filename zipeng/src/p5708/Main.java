package p5708;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		double p = 0.5*(a+b+c);
		double result = Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format(result));
	}

}
