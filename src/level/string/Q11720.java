package level.string;

import java.util.Arrays;
import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		/*
		 	문제
			N개의 숫자가 공백 없이 쓰여있다. 
			이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
			
			입력
			첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
			둘째 줄에 숫자 N개가 공백없이 주어진다.
			
			출력
			입력으로 주어진 숫자 N개의 합을 출력한다.
			
			예제 입력 1
			5
			54321	-> 15
			예제 입력 2
			25		
			7000000000000000000000000 -> 7
			
			11
			10987654321 -> 46
		 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("더할갯수 입력 : ");
		int input = sc.nextInt();
		System.out.print("공백없이 숫자 입력 :");
		String sumNum = sc.next();
		int sum=0;
		
		for (int i = 0; i < input; i++) {
			sum  += Integer.parseInt(""+sumNum.charAt(i));
		}
		System.out.println(sum);
		
		
		
		
		
				
		
		
		
	}

}
