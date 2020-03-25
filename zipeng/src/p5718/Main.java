package p5718;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int min = 1001;
		for(int i=0;i<n;i++){
			int now = cin.nextInt();
			min = now<min?now:min;
		}
		System.out.println(min);
	}

}
