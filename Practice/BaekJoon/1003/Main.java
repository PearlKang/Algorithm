package N1003;

import java.io.*;
import java.util.*;

public class Main {
	public static Integer[][] dp = new Integer[41][2];
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			fibonacci(N);
			
			bw.write(String.valueOf(dp[N][0]));
			bw.write(" ");
			bw.write(String.valueOf(dp[N][1]));
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static Integer[] fibonacci(int input) {
		if(dp[input][0] == null || dp[input][1] == null) {
			dp[input][0] = fibonacci(input-1)[0] + fibonacci(input-2)[0];
			dp[input][1] = fibonacci(input-1)[1] + fibonacci(input-2)[1];
		}
		
		return dp[input];
	}
}