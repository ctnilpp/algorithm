package p4956;

import java.util.Scanner;

public class Main {
	static int n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin =  new Scanner(System.in);
		n =cin.nextInt();
		int x =0;
		int k =1;
		int sum=0;
		for(x=100;x>=1;x--){
			sum=0;
			
			if(sum==n){
				System.out.println(x);
				System.out.println(k);
				break;
			}
		}
	}

	private static void count(int x,int k) {
		// TODO Auto-generated method stub
		int day=1;
		int when=1;
		int sum=0;
		while(sum<=n&&day<=52){
			sum+=x+when*k;
			day++;
		}

	}
	

}
