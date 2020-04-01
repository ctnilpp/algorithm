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
		//思路，切时做判断，未切则切，且作标记以及cuted已切数+1,最后用体积减去cuted可得结果
		//这样会省时间，不用最后做一个三次循环
		int cuted = 0;//被切了的方块数
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
