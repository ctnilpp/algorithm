package p5717;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int isTrigle = 0;
		if(a+b<c||a+c<b||b+c<a)System.out.println("Not triangle");
		else {
			if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)||
			   Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)||
			   Math.pow(c,2)==Math.pow(b,2)+Math.pow(a,2)){
			   isTrigle = 1;	
			   System.out.println("Right triangle");
			}
			if(Math.pow(a,2)>Math.pow(b,2)+Math.pow(c,2)||
			    Math.pow(b,2)>Math.pow(a,2)+Math.pow(c,2)||
			    Math.pow(c,2)>Math.pow(b,2)+Math.pow(a,2)){
				isTrigle = 1;
				System.out.println("Obtuse triangle");
			}
			if(isTrigle==0)System.out.println("Acute triangle");
			if(a==b||b==c||a==c)System.out.println("Isosceles triangle");
			if(a==b&&b==c&&a==c)System.out.println("Equilateral triangle");
			
		}
		   
		
	}

}
