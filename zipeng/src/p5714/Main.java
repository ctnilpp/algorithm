package p5714;

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        double  m = cin.nextDouble();
        double  h = cin.nextDouble();
        double weight  = m*1.0/Math.pow(h,2);
        if(weight<18.5)System.out.println("Underweight");
        else if(weight>=18.5&&weight<24)System.out.println("Normal");
        else{
        	String x = Double.toString(weight);
        	int len = x.length()<8?x.length():8;
        	int flag = 0;
        	for(int i=0;i<len-1;i++){
        		if(x.charAt(i)=='.'){
        			flag=1;
        			System.out.print(".");
        			continue;
        		}
        		if(x.charAt(i)=='0'&&flag==1)continue;
        		if(i==len-2){
        			if(x.charAt(i+1)>='5'){
        				System.out.print((char)(x.charAt(i)+1));
        			}
        			else System.out.print(x.charAt(i));
        		}
        		else System.out.print(x.charAt(i));
        	}
        	System.out.println();
        	System.out.println("Overweight");
        }
    }
}