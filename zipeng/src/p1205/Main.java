package p1205;

import java.util.Scanner;

public class Main {
	static char old[][] =new char[12][12];
	static char goal[][] = new char[12][12];
	static int n =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		for(int i=1;i<=n;i++){
			String now = cin.next();
			for(int j=0;j<now.length();j++){
				old[i][j+1] = now.charAt(j);
			}
		}
		for(int i=1;i<=n;i++){
			String now = cin.next();
			for(int j=0;j<now.length();j++){
				goal[i][j+1] = now.charAt(j);
			}
		}
		rate90();
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=n;j++){
//				System.out.print(old[i][j]);
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=n;j++){
//				System.out.print(goal[i][j]);
//			}
//			System.out.println();
//		}
	}
	private static boolean rate90() {
		int now = 
		return false;
		// TODO Auto-generated method stub
	}

}
