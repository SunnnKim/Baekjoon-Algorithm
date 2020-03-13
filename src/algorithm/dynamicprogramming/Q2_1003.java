package algorithm.dynamicprogramming;

import java.util.Scanner;

public class Q2_1003 {
	
	public static void main(String[] args) {
		
/*
	 fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
	
	fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
	fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
	두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
	fibonacci(0)은 0을 출력하고, 0을 리턴한다.
	fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
	첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
	fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
	1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	
	각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.
	
	출력
	각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.
	
	예제 입력 1 
	3
	0
	1
	3
	예제 출력 1 
	1 0
	0 1
	1
		 
 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n[] = new int[T]; 
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		for (int i = 0; i < n.length; i++) {
			int count0[];
			int count1[];
			count0 = new int[n[i]+1];
			count1 = new int[n[i]+1];
			if(n[i] == 0) {
				count0[0] = 1;
				count1[0] = 0;
			}else {
				count0[0] = 1;
				count0[1] = 0;
				count1[0] = 0;
				count1[1] = 1;
				for (int j = 2; j <= n[i]; j++) {
					if(j>1) {
						count0[j] = count0[j-1]+count0[j-2];
						count1[j] = count1[j-1]+count1[j-2];
					}
				}
			}
			System.out.println(count0[n[i]]+" " +count1[n[i]]);
		}
	}
}

