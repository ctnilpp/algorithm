package p5730;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		char a[][][] = new char[10][5][3];
		char sum[][] = new char[5][500];
		int n = cin.nextInt();
		String b = cin.next();
		char [][]a0={
				{'X','X','X'},
				{'X','.','X'},
				{'X','.','X'},
				{'X','.','X'},
				{'X','X','X'}
				};
		char [][]a1={
				{'.','.','X'},
				{'.','.','X'},
				{'.','.','X'},
				{'.','.','X'},
				{'.','.','X'}
				};
		char [][]a2={
				{'X','X','X'},
				{'.','.','X'},
				{'X','X','X'},
				{'X','.','.'},
				{'X','X','X'}
				};
		char [][]a3={
				{'X','X','X'},
				{'.','.','X'},
				{'X','X','X'},
				{'.','.','X'},
				{'X','X','X'}
				};
		char [][]a4={
				{'X','.','X'},
				{'X','.','X'},
				{'X','X','X'},
				{'.','.','X'},
				{'.','.','X'}
				};
		char [][]a5={
				{'X','X','X'},
				{'X','.','.'},
				{'X','X','X'},
				{'.','.','X'},
				{'X','X','X'}
				};
		char [][]a6={
				{'X','X','X'},
				{'X','.','.'},
				{'X','X','X'},
				{'X','.','X'},
				{'X','X','X'}
				};
		char [][]a7={
				{'X','X','X'},
				{'.','.','X'},
				{'.','.','X'},
				{'.','.','X'},
				{'.','.','X'}
				};
		char [][]a8={
				{'X','X','X'},
				{'X','.','X'},
				{'X','X','X'},
				{'X','.','X'},
				{'X','X','X'}
				};
		char [][]a9={
				{'X','X','X'},
				{'X','.','X'},
				{'X','X','X'},
				{'.','.','X'},
				{'X','X','X'}
				};
		a[0] = a0;
		a[1] = a1;
		a[2] = a2;
		a[3] = a3;
		a[4] = a4;
		a[5] = a5;
		a[6] = a6;
		a[7] = a7;
		a[8] = a8;
		a[9] = a9;
		for(int i=0;i<5;i++){
			for(int j=0,z=0;j<4*n-1;j+=4,z++){
				int now = b.charAt(z)-48;
//				System.out.println(now);
				sum[i][j] = a[now][i][0];
				sum[i][j+1] = a[now][i][1];
				sum[i][j+2] = a[now][i][2];
				sum[i][j+3] = '.';
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<4*n-1;j++){
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}
	}

}
