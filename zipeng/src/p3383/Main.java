package p3383;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int cnt =0;
		int prime[] = new int[1000001];
		int isprime[] = new int[100000005];
		isprime[0]=1;
		isprime[1]=1;
		int n = cin.nextInt();
		int q = cin.nextInt();
		int qnum[] = new int[q];
		for(int i=0;i<qnum.length;i++){
			qnum[i] = cin.nextInt();
		}
		for(int i=2;i<=n;i++){
			if(isprime[i]==0)prime[cnt++]=i;
			for(int j=0;j<cnt&&i*prime[j]<=100000001;j++){
				isprime[i*prime[j]]=1;
				if(i%prime[j]==0)break;
			}
		}
		for(int i=0;i<qnum.length;i++){
			System.out.println(prime[i]);
		}
	}

}
