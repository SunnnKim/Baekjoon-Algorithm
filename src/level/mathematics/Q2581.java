package level.mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
	/*
		 문제
		자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 
		이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
		
		예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 
		61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
		이들 소수의 합은 620이고, 최솟값은 61이 된다.
		
		입력
		입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
		
		M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
		
		출력
		M이상 N이하의 자연수 중 소수인 것을 모두 찾아 
		첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
		
		단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		
		예제 입력 1 
		60
		100
		예제 출력 1 
		620
		61
		
		예제 입력 2 
		64
		65
		예제 출력 2 
		-1
	 
	 */
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int total = 0;
		int min = 0;
		
		ArrayList<Integer> list  = new ArrayList<>();
		// 2 3 5 7 9 11
		if(n <100) {
			list =getDecimal1(m, n);
			min = list.get(0);
		}
		else {
			list = getDecimal1(0,100);
			for (int i = 101; i <= n; i++) {
				for (int j = 0; j < list.size() ; j++) {
					if( i % list.get(i) != 0) {
						list.add(i);
					}
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < n ) {
				list.remove(i);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
			if(min < list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println(total);
		System.out.println(min);
		
	}
	public static ArrayList<Integer> getDecimal1(int m, int n) {
		ArrayList<Integer> dNum = new ArrayList<Integer>();
		for (int i = m; i <= n; i++) {
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

}
