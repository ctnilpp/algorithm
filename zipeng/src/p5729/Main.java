package p5729;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int w = cin.nextInt();
		int d = cin.nextInt();
		int h = cin.nextInt();
		int q = cin.nextInt();
		//˼·����ʱ���жϣ�δ�����У���������Լ�cuted������+1,����������ȥcuted�ɵý��
		//������ʡʱ�䣬���������һ������ѭ��
		int cuted = 0;//�����˵ķ�����
		int squre[][][] = new int[21][21][21];  
		for(int i=0;i<q;i++){
			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			int z1 = cin.nextInt();
			int x2 = cin.nextInt();
			int y2 = cin.nextInt();
			int z2 = cin.nextInt();
			for(int x=x1;x<=x2;x++){
				for(int y=y1;y<=y2;y++){
					for(int z=z1;z<=z2;z++){
						if(squre[x][y][z]==0){
							squre[x][y][z]=1;
							cuted++;
						}
					}
				}
			}
		}
		System.out.println(w*d*h-cuted);
		
	}

}