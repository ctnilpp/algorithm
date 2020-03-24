package p5715;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin =  new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		if(a>b){
			if(a>c){
				if(b>c)System.out.println(c+" "+b+" "+a);
				if(b<=c)System.out.println(b+" "+c+" "+a);
			}	
			else if(a<=c){
				System.out.println(b+" "+a+" "+c);
			}
		}
		else if(a<=b){
			 if(b<=c){
				 System.out.println(a+" "+b+" "+c);
			 }
			 else if(b>c){
					if(a>c)System.out.println(c+" "+a+" "+b);
					if(a<=c)System.out.println(a+" "+c+" "+b);
				}	
		}
	}

}
