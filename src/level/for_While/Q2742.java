package level.for_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2742 {

	public static void main(String[] args) throws IOException {
		
	/*
	 문제
	자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
	
	출력
	첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
	
	예제 입력 1 
	5
	예제 출력 1 
	5
	4
	3
	2
	1
	*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		for (int i = count; i > 0; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		
		
	}

}
