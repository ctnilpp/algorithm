package p5711;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		if((x%100!=0&&x%4==0)||(x%100==0&&x%400==0)){
			System.out.println(1);
		}
		else System.out.println(0);
	}

}
