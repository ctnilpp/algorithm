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
	        // ճ������ 1 �����������룬���� return 0
	        System.out.println("I love Luogu!");
	    } else if (T == 2) {
	        // ճ������ 2 �����������룬���� return 0
	    	System.out.println((2+4)+" "+(10-2-4));
	    } else if (T == 3) {
	        // ������������� 3 �Ĵ���
	    	System.out.println(14/4);
	    	System.out.println((14/4)*4);
	    	System.out.println(14-((14/4)*4));
	    } else if (T == 4) {
	        // ������������� 4 �Ĵ���
	    	DecimalFormat df = new DecimalFormat("0.000");
	        System.out.println(df.format((double)500/3));
	    } else if (T == 5) {
	        // ������������� 5 �Ĵ���
	    	System.out.println((int)((260+220)/(20+12)));
	    } else if (T == 6) {
	        // ������������� 6 �Ĵ���
	    	DecimalFormat df = new DecimalFormat("0.0000");
	    	System.out.println(df.format(Math.sqrt((6*6+9*9))));
	    } else if (T == 7) {
	        // ������������� 7 �Ĵ���
	    	System.out.println(110);
	    	System.out.println(90);
	    	System.out.println(0);
	    } else if (T == 8) {
	        // ������������� 8 �Ĵ���
	    	double PI = 3.141593;
	    	int r =5;
	    	DecimalFormat df = new DecimalFormat("0.0000");
	    	DecimalFormat df1 = new DecimalFormat("0.000");
	    	System.out.println(df.format(2*PI*r));
	    	System.out.println(df.format(PI*r*r));
	    	System.out.println(df1.format((4.0*PI*r*r*r)/3.0));
	    } else if (T == 9) {
	        // ������������� 9 �Ĵ���
	    	System.out.println(22);
	    } else if (T == 10) {//��̫�� ţ�Բ�̫��Ȥ��,hhhh
	        // ������������� 10 �Ĵ���
	    } else if (T == 11) {	
	        // ������������� 11 �Ĵ���
	    	System.out.println(100/3);
	    } else if (T == 12) {
	        // ������������� 12 �Ĵ���
	    	for(int i=(int)'A';i<='Z';i++){
	    		if(i==(int)'M'){
	    			System.out.println(i+1-(int)'A');
	    			break;
	    		}
	    	}
	    } else if (T == 13) {
	        // ������������� 13 �Ĵ���
	    	double PI = 3.141593;
	    	System.out.println((int)Math.pow(4*PI*Math.pow(14, 3)/3, 1.0/3.0));
	    } else if (T == 14) {
	        // ������������� 14 �Ĵ���
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
	    	System.out.println(result);
	    }
	}

}