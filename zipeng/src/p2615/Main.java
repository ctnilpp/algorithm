package p2615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int hf[][] = new int[40][40];
		hf[0][N/2]=1;
		int i =0,j=N/2;//K-1������
		//N-1���һ�л����һ��
		//0��һ�л��һ��
		//i+1��һ��i-1��һ��
		//j+1��һ�У�j-1��һ��
		for(int K=2;K<=N*N;K++){
			if(i==0&&j!=N-1){
				hf[N-1][j+1]=K;
				i=N-1;
				j=j+1;
			}
			else if(j==N-1&&i!=0){
				hf[i-1][0]=K;
				i=i-1;
				j=0;
			}
			else if(i==0&&j==N-1){
				hf[i+1][j]=K;
				i=i+1;
				j=j;
			}
			else if(i!=0&&j!=N-1){
				if(hf[i-1][j+1]==0){
					hf[i-1][j+1]=K;
					i=i-1;
					j=j+1;
				}
				else {
					hf[i+1][j]=K;
					i=i+1;
					j=j;
				}
			}
		}
		for(int q=0;q<N;q++){
			for(int w=0;w<N;w++){
				if(w!=N-1)System.out.print(hf[q][w]+" ");
				else System.out.print(hf[q][w]);
			}
			System.out.println();
		}
	}

}