package p1205;

import java.util.Scanner;

public class Main {
	static char old[][] =new char[12][12];
	static char goal[][] = new char[12][12];
	static int n =0;
	static int nochange = 0;//不变动，如果不变动可以直接输出。
	static int havesout = 0;//有输出则变为1
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
				havesout=1;
				System.out.println("1");
				return ;
			}
			if(rate180()){
				havesout=1;
				System.out.println("2");
				return ;
			}
			if(rate270()){
				havesout=1;
				System.out.println("3");
				return ;
			}
			if(shuiping()){
				havesout=1;
				System.out.println("4");
				return ;
			}
			if(shuiping90()||shuiping180()||shuiping270()){
				havesout=1;
				System.out.println("5");
				return ;
			}
			if(havesout==0){
				for(int i=1;i<=n;i++){
					for(int j=1;j<=n;j++){
						if(old[i][j]!= goal[i][j])nochange=1;
					}
				}
				if(nochange==1)System.out.println("7");
				else System.out.println("6");
				return ;
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
	private static boolean shuiping270() {
		int now = n;
		char middle[][] = new char[12][12];
		for(int j=1,q=n;j<=n/2;j++,q--){
			for(int i=1;i<=n;i++){
				middle[i][j] = old[i][q];
				middle[i][q] = old[i][j];
			}
		}
		if(n%2!=0){
			for(int j=n/2+1,i=1;i<=n;i++){
				middle[i][j] = old[i][j];
			}
		}
		char newold[][] = new char[12][12];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				newold[i][j] = middle[i][j];
			}
		}
		now = n;
		int i =1;
		int j =1;
		while(now>0){
			//left to top	
			for(int q=0;q<now;q++){
				middle[i+q][j+now-1] = newold[i+now-1][j+q];
				middle[i][j+q] = newold[i+q][j+now-1];
				middle[i+now-1][j+q] = newold[i+q][j];
				middle[i+q][j] = newold[i][j+q];
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
//		for(int e=1;e<=n;e++){
//		for(int r=1;r<=n;r++){
//			System.out.print(middle[e][r]);
//			}
//		System.out.println();
//		}
		
		return true;
	}
	private static boolean shuiping180() {
		int now = n;
		char middle[][] = new char[12][12];
		for(int j=1,q=n;j<=n/2;j++,q--){
			for(int i=1;i<=n;i++){
				middle[i][j] = old[i][q];
				middle[i][q] = old[i][j];
			}
		}
		if(n%2!=0){
			for(int j=n/2+1,i=1;i<=n;i++){
				middle[i][j] = old[i][j];
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				old[i][j] = middle[i][j];
			}
		}
		now = n;
		char newold[][] = new char[12][12];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				newold[i][j] = middle[i][j];
			}
		}
		for(int i=1,q=n;i<=now/2;i++,q--){
			for(int j=1,w=n;j<=now;j++,w--){
				middle[i][j] =  newold[q][w];
			}
		}
		if(now%2!=0){
			for(int j=1,q=n;j<=now;j++,q--){
				middle[now/2+1][q] = newold[now/2+1][j];
			}
		}
		for(int i=1,q=n;i<=now/2;i++,q--){
			for(int j=n,w=1;w<=now;j--,w++){
				middle[q][w] =  newold[i][j];
			}
		}
		for(int e=1;e<=n;e++){
			for(int r=1;r<=n;r++){
				if(middle[e][r]!=goal[e][r]) return false;
			}
		}
//		for(int e=1;e<=n;e++){
//		for(int r=1;r<=n;r++){
//			System.out.print(middle[e][r]);
//			}
//		System.out.println();
//		}
		
		return true;
	}
	private static boolean shuiping90() {
		int now = n;
		char middle[][] = new char[12][12];
		for(int j=1,q=n;j<=n/2;j++,q--){
			for(int i=1;i<=n;i++){
				middle[i][j] = old[i][q];
				middle[i][q] = old[i][j];
			}
		}
		if(n%2!=0){
			for(int j=n/2+1,i=1;i<=n;i++){
				middle[i][j] = old[i][j];
			}
		}
		char newold[][] = new char[12][12];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				newold[i][j] = middle[i][j];
			}
		}
		now = n;
		int i =1;
		int j =1;
		while(now>0){
			//left to top	
			for(int q=0;q<now;q++){
				middle[i][j+q] = newold[i+now-q-1][j];
				middle[i+q][j+now-1] = newold[i][j+q];
				middle[i+now-1][j+q] = newold[i+now-q-1][j+now-1];
				middle[i+q][j] = newold[i+now-1][j+q];
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
//		for(int e=1;e<=n;e++){
//		for(int r=1;r<=n;r++){
//			System.out.print(middle[e][r]);
//			}
//		System.out.println();
//		}
		
		return true;
	}
	private static boolean shuiping() {
		// TODO Auto-generated method stub
		int now = n;
		char middle[][] = new char[12][12];
		for(int j=1,q=n;j<=n/2;j++,q--){
			for(int i=1;i<=n;i++){
				middle[i][j] = old[i][q];
				middle[i][q] = old[i][j];
			}
		}
		if(n%2!=0){
			for(int j=n/2+1,i=1;i<=n;i++){
				middle[i][j] = old[i][j];
			}
		}
		for(int e=1;e<=n;e++){
			for(int r=1;r<=n;r++){
				if(middle[e][r]!=goal[e][r]) return false;
			}
		}
//		for(int e=1;e<=n;e++){
//		for(int r=1;r<=n;r++){
//			System.out.print(middle[e][r]);
//			}
//		System.out.println();
//		}
		
		return true;
	}
	private static boolean rate270() {
		int now = n;
		int i =1;
		int j =1;
		char middle[][] = new char[12][12];
		while(now>0){
			//left to top	
			for(int q=0;q<now;q++){
				middle[i+q][j+now-1] = old[i+now-1][j+q];
				middle[i][j+q] = old[i+q][j+now-1];
				middle[i+now-1][j+q] = old[i+q][j];
				middle[i+q][j] = old[i][j+q];
			}
			now-=2;
			i++;
			j++;
		}
		for(int e=1;e<=n;e++){
		for(int r=1;r<=n;r++){
			if(middle[e][r]!=goal[e][r]) return false;
		}
//		for(int e=1;e<=n;e++){
//			for(int r=1;r<=n;r++){
//				System.out.print(middle[e][r]);
//			}
//			System.out.println();
	}
		return true;
		// TODO Auto-generated method stub
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
				if(middle[e][r]!=goal[e][r]) return false;
			}
		}
//		for(int e=1;e<=n;e++){
//			for(int r=1;r<=n;r++){
//				System.out.print(middle[e][r]);
//			}
//			System.out.println();
//		}
		return true;
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
