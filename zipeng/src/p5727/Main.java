package p5727;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		long n = cin.nextLong();
		long result[] = new long[100000];
		int cnt =0;
		while(n!=1){
			result[cnt++]=n;
			if(n%2!=0){
				n=n*3+1;
			}
			else {
				n/=2;
			}
		}
		System.out.print(1+" ");
		for(int i=cnt-1;i>=0;i--){
			if(i!=0)System.out.print(result[i]+" ");
			else System.out.println(result[i]);
		}
	}

}