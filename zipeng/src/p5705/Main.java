package p5705;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String now = cin.next();
		for(int i=4;i>=0;i--){
			System.out.print(now.charAt(i));
		}
		System.out.println();
	}

}
