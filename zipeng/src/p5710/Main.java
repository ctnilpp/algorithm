package p5710;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		int f1=0,f2=0,f3=0,f4 =0;
		if(x%2==0&&x>4&&x<=12){
			f1=1;
		}
		if(x%2==0||(x>4&&x<=12)){
			f2=1;
		}
		if(x%2==0&&!(x>4&&x<=12)||!(x%2==0)&&(x>4&&x<=12)){
			f3=1;
		}
		if(!(x%2==0)&&!(x>4&&x<=12)){
			f4=1;	
		}
		System.out.println(f1+" "+f2+" "+f3+" "+f4);
	}

}
