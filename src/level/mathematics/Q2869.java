package level.mathematics;

import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {
/*
	문제
	땅 위에 달팽이가 있다. 
	이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
	
	달팽이는 낮에 A미터 올라갈 수 있다. 
	하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
	또, 정상에 올라간 후에는 미끄러지지 않는다.
	
	달팽이가 나무 막대를 모두 올라가려면, 
	며칠이 걸리는지 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. 
	(1 ≤ B < A ≤ V ≤ 1,000,000,000)
	
	출력
	첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
	
	예제 입력 1 
	2 1 5
	예제 출력 1 
	4
	
	V : 나무의 높이 
	A : 달팽이가 낮에 올라가는 높이 
	B : 달팽이가 밤에 떨어지는 높이
 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int day = v / (a - b) -1;
		int distance = a * day; // 달팽이가 간 거리의 누적 
		
		while( v > distance ) {
			
			distance += a; // 
			if(distance != v ) distance -= b;
			day++;
		}
		
		System.out.println(day);
		
			
	
		
		
		
	}

}
