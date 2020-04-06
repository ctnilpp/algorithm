package p5732;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int yanghui[][] = new int[22][22];
		yanghui[1][1]=1;
		for(int i=2;i<=n;i++){
			for(int j=i;j>=1;j--){
				yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(yanghui[i][j]!=0){
					if(j!=n)System.out.print(yanghui[i][j]+" ");
					else System.out.print(yanghui[i][j]);
				}
			}
			System.out.println();
		}
	}

}
