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
		if(rate90()){
			System.out.println("1");
		}
		if(rate180()){
			
		}
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
	private static boolean rate180() {
		// TODO Auto-generated method stub
		int now = n;
		char middle[][] = new char[12][12];
		for(int i=1,q=n;i<=now/2;i++,q--){
			for(int j=1,w=n;j<=now;j++,w--){
				middle[i][j] =  old[q][w];
			}
		}
		if(now%2!=0){
			for(int j=1,q=n;j<=now;j++,q--){
				middle[now/2+1][q] = old[now/2+1][j];
			}
		}
		for(int i=1,q=n;i<=now/2;i++,q--){
			for(int j=n,w=1;w<=now;j--,w++){
				middle[q][w] =  old[i][j];
			}
		}
		for(int e=1;e<=n;e++){
			for(int r=1;r<=n;r++){
				System.out.print(middle[e][r]);
			}
			System.out.println();
		}
		return false;
	}
	private static boolean rate90() {
		int now = n;
		int i =1;
		int j =1;
		char middle[][] = new char[12][12];
		while(now>0){
			//left to top	
			for(int q=0;q<now;q++){
				middle[i][j+q] = old[i+now-q-1][j];
				middle[i+q][j+now-1] = old[i][j+q];
				middle[i+now-1][j+q] = old[i+now-q-1][j+now-1];
				middle[i+q][j] = old[i+now-1][j+q];
			}
			now-=2;
			i++;
			j++;
		}
		for(int e=1;e<=n;e++){
		for(int r=1;r<=n;r++){
			if(middle[e][r]!=goal[e][r]) return false;
		}
	}
		return true;
		// TODO Auto-generated method stub
	}

}
