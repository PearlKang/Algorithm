package N1904;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 1000000) {
			int[] dp = new int[1000001];
			
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			
			for(int n = 3; n <= N; n++) {
				dp[n] = (dp[n-1] + dp[n-2]) % 15746;
			}
			
			bw.write(String.valueOf(dp[N]));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}