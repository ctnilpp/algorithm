package p1009;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		BigDecimal sum = new BigDecimal(0);
		int N = cin.nextInt();
		for(int i=1;i<=N;i++){
			BigDecimal now = new BigDecimal(1);
			for(int j=i;j>=1;j--){
				BigDecimal nowj = new BigDecimal(j);
				now = now.multiply(nowj);
			}
			sum = sum.add(now);
		}
		System.out.println(sum);
	}

}
