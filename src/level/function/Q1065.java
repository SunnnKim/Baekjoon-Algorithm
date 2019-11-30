package level.function;

import java.util.Scanner;

public class Q1065 {
/*
	  	문제
		어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
		등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		
		입력
		첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		
		출력
		첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		
		예제 입력 1 
		110
		예제 출력 1 
		99
		
		예제 입력 2 
		1
		예제 출력 2 
		1
		
		예제 입력 3 
		210
		예제 출력 3 
		105
		
		예제 입력 4 
		1000
		예제 출력 4 
		144
 */
	
	static int sequence(int number) {
		//number 파라미터는 곧 입력값을 의미
		//return 값은 count
		int count = 0;
		if(number < 100) count = number; // 1~99까지는 모두 한수가 된다.
		else if ( number <= 110) count = 99;	// 100 ~ 110까지는 한수가 없다.
		else {
			count = 99;
		for (int i = 111; i <= number; i++) {	
			int a, b, c;
			a = i / 100;	// 100의 자리
			b = (i % 100) / 10;
			c = i % 10; 
			if(b - a == c - b) {
				count ++;
			}
		}
	}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(sequence(num));
	}
	
	
}
