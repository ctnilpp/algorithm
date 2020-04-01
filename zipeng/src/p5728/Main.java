package p5728;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin =  new Scanner(System.in);
		int N = cin.nextInt();
		int result =0;
		int score[][] = new int[N][3];
		for(int i=0;i<N;i++){
			score[i][0] = cin.nextInt();
			score[i][1] = cin.nextInt();
			score[i][2] = cin.nextInt();
		}
		for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++){
					int sumi = score[i][0]+score[i][1]+score[i][2];
					int sumj = score[j][0]+score[j][1]+score[j][2];
					if(Math.abs(score[i][0]-score[j][0])<=5&&Math.abs(score[i][1]-score[j][1])<=5
							&&Math.abs(score[i][2]-score[j][2])<=5&&Math.abs(sumi-sumj)<=10)
						result++;
					}
		}
		System.out.println(result);
	}

}
