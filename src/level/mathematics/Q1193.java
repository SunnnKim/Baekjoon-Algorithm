package level.mathematics;

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {
		/*
		
		문제
		무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
		1/1	1/2	1/3	1/4	1/5	…
		2/1	2/2	2/3	2/4	…	…
		3/1	3/2	3/3	…	…	…
		4/1	4/2	…	…	…	…
		5/1	…	…	…	…	…
		…	…	…	…	…	…
		
		이와 같이 나열된 분수들을 
		1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 
		지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
		
		X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
		
		출력
		첫째 줄에 분수를 출력한다.
		
		예제 입력 1 
		14
		예제 출력 1 
		2/4
		 */
// up : 1 / 1 2 / 3 2 1 / 1 2 3 4 / 5 4 3 2 1 / 1 2 3 4 5 6 / 7 6 5 4 3 2 1 / 1 2  
// dw : 1 / 2 1 / 1 2 3 / 4 3 2 1 / 1 2 3 4 5 / ....
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 몇번 째 인지  
		int count = 1;
		int upNum = 1;
		int downNum = 1;
		int turn =1;
		while(count != num) {
		// 1 번째는 반드시 1/1
		if(turn != 1 ) {
			if( turn %2 == 0) {
				upNum = 1;
				downNum = turn;
				count++;
				for (int i = 1; i < turn && count < num; i++) {
					upNum++;
					downNum--;
					count++;
				}
			}else { // 홀수 턴일 때  
				upNum = turn;
				downNum = 1;
				count++;
				for (int i = 1; i < turn && count < num; i++) {
					upNum--;
					downNum++;
					count++;

				}
			}
			
		}
			
			
			turn++;
			
			
		}
		System.out.println(upNum+"/"+downNum);
		
		
		
		
	}

}
