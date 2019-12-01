package level.function;

import java.util.Scanner;

public class Q2588_multifle {

	public static void main(String[] args) {
		/*
		 문제
		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		
								472
							x	385
							-------
							   2360
							  3770
							 1416
							 ------
							 181720
		
		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 
		둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
		
		출력
		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		예제 입력 1 
		472
		385
		
		예제 출력 1 
		2360
		3776
		1416
		181720
		 */
	
		Scanner sc = new Scanner(System.in);
		int ip1 = sc.nextInt();
		int ip2 = sc.nextInt();
		
		int num1 = ip1 * (ip2%10);
		int num2 = ip1 * ((ip2 % 100) /10);
		int num3 = ip1 * (ip2 / 100);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ip1*ip2);
	
	
	
	
	}
}