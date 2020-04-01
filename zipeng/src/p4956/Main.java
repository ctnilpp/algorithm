package p4956;

import java.util.Scanner;

public class Main {
	static int n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin =  new Scanner(System.in);
		n =cin.nextInt();
		int x =0;
		int sum=0;
		int flag =0;
		for(int k=1;;k++){
			for(x=100;x>=1;x--){//将无限变有限的想法也非常棒！
				if(((7*x+21*k)*52)==n){//这里十分巧妙，以后我应该要多点从不变的东西上面下手
					flag=1;//跳出循环
					System.out.println(x);
					System.out.println(k);
					break;
				}
			}
			if(flag==1)break;
		}
		}
	}

	
