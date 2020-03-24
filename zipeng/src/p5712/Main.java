package p5712;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		if(x==0){
			System.out.println("Today, I ate 0 apple.");
		}if(x==1){
			System.out.println("Today, I ate 1 apple.");
		}
		if(x>1){
			System.out.println("Today, I ate "+x+" apples.");
		}
	}

}
