package p5716;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small[] = {2,4,6,9,11};
		Scanner cin = new Scanner(System.in);
		int year = cin.nextInt();
		int month = cin.nextInt();
		int flag = 0;
		if((year%100!=0&&year%4==0)||((year%100==0)&&year%400==0)){
			//����
			//����С�±��Ǵ���,flag=1��֤����С�£������Ǵ���
			for(int i =0;i<small.length;i++){
				if(month==small[i]&&month==2){
					flag=1;
					System.out.println(29);
				}
				else if (month==small[i]) {
					flag=1;
					System.out.println(30);
				}
			}
		}
		//��������
		else {
			for(int i =0;i<small.length;i++){
				if(month==small[i]&&month==2){
					flag=1;
					System.out.println(28);
				}
				else if(month==small[i]){
					flag=1;
					System.out.println(30);
				}
			}
		}
		if(flag==0)System.out.println(31);
	}

}