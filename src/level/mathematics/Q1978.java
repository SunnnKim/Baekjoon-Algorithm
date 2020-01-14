package level.mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
/*
	문제
	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	
	입력
	첫 줄에 수의 개수 N이 주어진다. 
	N은 100이하이다. 
	다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	
	출력
	주어진 수들 중 소수의 개수를 출력한다.
	
	예제 입력 1 
	4
	1 3 5 7
	예제 출력 1 
	3
 
 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int count = 0;
		for (int i = 0; i < T; i++) {
			N = sc.nextInt();
			if(checkDecimal(N)) count++;
		}
		System.out.println(count);
		
		
	}
	



	
	public static boolean checkDecimal(int x) {
		boolean decimal=true;
		
		if(x < 100) {
			if(x == 0 || x == 1) return false;
			if(x % 2 == 0 && x != 2) return false;
			if(x % 3 == 0 && x != 3) return false;
			if(x % 5 == 0 && x != 5) return false;
			if(x % 7 == 0 && x != 7) return false;
			if(x % 11 == 0 && x != 11) return false;
			
		}
		else {
			ArrayList<Integer> dNum = getDecimal();
			for (int i = 0; i < dNum.size(); i++) {
				if(x % dNum.get(i) == 0) {
					return false;
				}
		}
			
		}
		
		return decimal;
	}

	//  101  103    107  109 
	// 
	

	
	public static ArrayList<Integer> getDecimal() {
		ArrayList<Integer> dNum = new ArrayList<Integer>();
		for (int i = 2; i <= 100; i++) {
			if( i==2 || i==3 || i==5|| i==7|| i==11) {
				dNum.add(i);
				continue;
			}
			if(i % 2 == 0 ) continue;
			else if(i % 3 == 0 ) continue;
			else if(i % 5 == 0 ) continue;
			else if(i % 7 == 0 ) continue;
			
			dNum.add(i);
		
		}
		
		return dNum;
	}
//	
	
}