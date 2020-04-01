package p1161;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int light[] = new int[2000005];
		for(int i=0;i<n;i++){
			double a = cin.nextDouble();
			int t = cin.nextInt();
			for(int j=1;j<=t;j++){
				if(light[(int)Math.floor(a*j)]==0){
					light[(int)Math.floor(a*j)]=1;
				}
				else {
					light[(int)Math.floor(a*j)]=0;
				}
			}
		}
		for(int i=1;i<=2000005;i++){
			 if(light[i]==1){
				 System.out.println(i);
				 break;
			 }
		}
	}

}
