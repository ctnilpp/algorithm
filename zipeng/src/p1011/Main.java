package p1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int n = cin.nextInt();
		int m = cin.nextInt();
		int x = cin.nextInt();
		int shangche[] = new int[n];
		int xiache[] = new int[n];
		int renshu[] = new int[n];
		int test=0;
		while(renshu[n-1]!=m){
			shangche[0]=a;
			xiache[0]=0;
			shangche[1]=test;
			xiache[1]=test;
			renshu[0]=a;
			renshu[1]=a;
			for(int i=2;i<n-1;i++){
				shangche[i] = shangche[i-1]+shangche[i-2];
				xiache[i] = shangche[i-1];
				renshu[i] = shangche[i]-xiache[i]+renshu[i-1];
			}
			renshu[n-1]=renshu[n-2];
			test++;
		}
		System.out.println(renshu[x-1]);
		
		
	}

}
