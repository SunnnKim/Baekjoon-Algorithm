package level.ifs;

import java.util.Scanner;

public class Q10817 {

	public static void main(String[] args) {

/*
 	문제
	세 정수 A, B, C가 주어진다. 
	이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
	
	입력
	첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. 
	(1 ≤ A, B, C ≤ 100)
	
	출력
	두 번째로 큰 정수를 출력한다.
	
	예제 입력 1 
	20 30 10
	예제 출력 1 
	20
	
	예제 입력 2 
	30 30 10
	예제 출력 2 
	30
	
	예제 입력 3 
	40 40 40
	예제 출력 3 
	40
	
	예제 입력 4 
	20 10 10
	예제 출력 4 
	10
	 */
		
		Scanner sc = new Scanner(System.in);

		// 1. sorting
		
//		int a[] = new int[3];
//		a[0] = sc.nextInt();
//		a[1] = sc.nextInt();
//		a[2] = sc.nextInt();
//		int temp;
//		for (int i = 0; i < a.length-1; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println(a[1]);
//		
		//2.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>=b && a<=c || a<=b && a>=c) System.out.println(a);
		else if(b>=a && b<=c || b<=a && b>=c) System.out.println(b);
		else if(c>=a && c<=b || c<=a && c>=b) System.out.println(c);
		
	}

}
