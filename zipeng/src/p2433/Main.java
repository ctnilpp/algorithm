package p2433;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T;
	    Scanner cin = new Scanner(System.in);
	    T = cin.nextInt();
	    if (T == 1) {
	        // 粘贴问题 1 的主函数代码，除了 return 0
	        System.out.println("I love Luogu!");
	    } else if (T == 2) {
	        // 粘贴问题 2 的主函数代码，除了 return 0
	    	System.out.println((2+4)+" "+(10-2-4));
	    } else if (T == 3) {
	        // 请自行完成问题 3 的代码
	    	System.out.println(14/4);
	    	System.out.println((14/4)*4);
	    	System.out.println(14-((14/4)*4));
	    } else if (T == 4) {
	        // 请自行完成问题 4 的代码
	    	DecimalFormat df = new DecimalFormat("0.000");
	        System.out.println(df.format((double)500/3));
	    } else if (T == 5) {
	        // 请自行完成问题 5 的代码
	    	System.out.println((int)((260+220)/(20+12)));
	    } else if (T == 6) {
	        // 请自行完成问题 6 的代码
	    	DecimalFormat df = new DecimalFormat("0.0000");
	    	System.out.println(df.format(Math.sqrt((6*6+9*9))));
	    } else if (T == 7) {
	        // 请自行完成问题 7 的代码
	    	System.out.println(110);
	    	System.out.println(90);
	    	System.out.println(0);
	    } else if (T == 8) {
	        // 请自行完成问题 8 的代码
	    	double PI = 3.141593;
	    	int r =5;
	    	DecimalFormat df = new DecimalFormat("0.0000");
	    	DecimalFormat df1 = new DecimalFormat("0.000");
	    	System.out.println(df.format(2*PI*r));
	    	System.out.println(df.format(PI*r*r));
	    	System.out.println(df1.format((4.0*PI*r*r*r)/3.0));
	    } else if (T == 9) {
	        // 请自行完成问题 9 的代码
	    	System.out.println(22);
	    } else if (T == 10) {//不太会 牛吃草太有趣了,hhhh
	        // 请自行完成问题 10 的代码
	    	System.out.println(9);
	    } else if (T == 11) {	
	        // 请自行完成问题 11 的代码
	    	DecimalFormat df = new DecimalFormat("0.0000");
	    	System.out.println(df.format(1.0*100/3));
	    } else if (T == 12) {
	        // 请自行完成问题 12 的代码
	    	for(int i=(int)'A';i<='Z';i++){
	    		if(i==(int)'M'){
	    			System.out.println(i+1-(int)'A');
	    		}
	    		if(i==((int)'A')+17){
	    			System.out.println((char)i);
	    		}
	    	}
	    } else if (T == 13) {
	        // 请自行完成问题 13 的代码
	    	double PI = 3.141593;
	    	System.out.println((int)Math.pow(4*PI*(4*4*4+10*10*10)/3, 1.0*1/3));
	    } else if (T == 14) {
	        // 请自行完成问题 14 的代码
	    	int price = 110;
	    	int num = 10;
	    	double sum=0;
	    	double result=99999999;
	    	while(price>0){
	    		sum=price*num;
	    		if(sum==3500){
	    			result = price<result?price:result;
	    		}
	    		price--;
	    		num++;
	    	}
	    	System.out.println((int)result);
	    }
	}

}
