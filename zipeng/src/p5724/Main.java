package p5724;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int max = 0;
		int min =  (1<<31)-1;//为什么取不到30次方呢。。	
		for(int i=0;i<n;i++){
				int now =0;
				now = cin.nextInt();
				max = max<now?now:max;
				min = min>now?now:min;
		}
		System.out.println(max-min);
	}

}
