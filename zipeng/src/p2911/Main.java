package p2911;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int sum[] = new int[100];
		int s1 = cin.nextInt();
		int s2 = cin.nextInt();
		int s3 = cin.nextInt();
		int max = 0;
		int index =0;
		for(int i=1;i<=s1;i++){
			for(int j=1;j<=s2;j++){
				for(int k=1;k<=s3;k++){
					sum[i+j+k]++;
				}
			}
		}
		for(int i=3;i<=s1+s2+s3;i++){
			 if(sum[i]>max){
				 max=sum[i];
				 index = i;
			 }
		}
		System.out.println(index);
	}

}
