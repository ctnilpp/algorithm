package p4414;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int num[] = new int[3];
		num[0] = cin.nextInt();
		num[1] = cin.nextInt();
		num[2] = cin.nextInt();
		String sq = cin.next();
		Arrays.sort(num);
		Map<Character, Integer> mp = new HashMap<Character,Integer>();
		mp.put('A', num[0]);
		mp.put('B', num[1]);
		mp.put('C', num[2]);
		for(int i=0;i<3;i++){
			if(i!=2)System.out.print(mp.get(sq.charAt(i))+" ");
			else {
				System.out.print(mp.get(sq.charAt(i)));
			}
		}
	}

}
