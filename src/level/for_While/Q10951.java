package level.for_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10951 {

	public static void main(String[] args) {

		//while
		// \r\n
		// \n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				String s[] = line.trim().split(" ");
				int num = Integer.parseInt(s[0]) +Integer.parseInt(s[1]);
				bw.write(num + "\n");
			}
			bw.flush();
		}catch (Exception e) {
			
		}finally {
			if(br != null) try { br.close();} catch(Exception e) {}
			if(bw != null) try { bw.close();} catch(Exception e) {}
			System.exit(0);
		}
		
	}

}
