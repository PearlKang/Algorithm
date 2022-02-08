package N17869;

import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		int cnt = 0;
		
		while(true) {
			if(N % 2 == 0) {
				N /= 2;
			}
			else {
				N += 1;
			}
			
			cnt++;
			
			if(N == 1)
				break;
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}