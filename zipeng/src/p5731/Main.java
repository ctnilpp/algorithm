package p5731;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int sum[][] = new int[11][11]; //用1~10
		int dir = 0;//0→ , 1↓ ,2← ,3↑
		int i =1;
		int j =1;
		sum[1][1] =1;
		int max = n*n;
		//边界是1和n 0和n+1都是越界
		int start = 2;
		while(start<=max){
			int flag =0;//flag==1就是有前进，否则没有的话要转向
			if(dir==0){
				if(sum[i][j+1]==0&&j+1<n+1){
					flag=1;
					sum[i][j+1]=start;
					start++;
					j++;
				}
			}
			if(dir==1){
				if(sum[i+1][j]==0&&i+1<n+1){
					flag=1;
					sum[i+1][j]=start;
					start++;
					i++;
				}
			}
			if(dir==2){
				if(sum[i][j-1]==0&&j-1>0){
					flag=1;
					sum[i][j-1]=start;
					start++;
					j--;
				}
			}
			if(dir==3){
				if(sum[i-1][j]==0&&i-1>0){
					flag=1;
					sum[i-1][j]=start;
					start++;
					i--;
				}
			}
			if(flag==0){
				dir++;
				if(dir==4)dir=0;
			}
		}
		for(int q=1;q<n+1;q++){
			System.out.print(" ");
			for(int w=1;w<n+1;w++){
					if(w<n){
						if(sum[q][w]<10)System.out.print(" "+sum[q][w]+" ");
						else System.out.print(sum[q][w]+" ");
					}
					else {
						if(sum[q][w]<10)System.out.print(" "+sum[q][w]);
						else System.out.print(sum[q][w]);
					}
			}
			System.out.println();
		}
	}

}
