package p5723;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int isprime[] = new int[100005];
		int cnt =0 ;
		int L =0;
		int sum=0;
		int num=0;
		int prime[] = new int[100005];
		isprime[0]=1;
		isprime[1]=1;
		L = cin.nextInt();
		for(int i =2;i<=L;i++){
			 if(isprime[i]==0){
				 if(sum+i<=L){
					 sum+=i;
					 System.out.println(i);
					 num++;
				 }
				 else break;
				 prime[cnt++]=i;
			 }
			 for(int j=0;j<cnt&&i*prime[j]<=100005;j++){
				 isprime[i*prime[j]]=1;
				 if(i%prime[j]==0)break;
			 }
		}
		System.out.println(num);
	}

	
	
	
}
