package p5713;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		if(n*3+11<n*5)System.out.println("Luogu");
		else System.out.println("Local");
	}

}
