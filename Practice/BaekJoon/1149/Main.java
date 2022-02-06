package N1149;

import java.io.*;
import java.util.*;

public class Main {
	public static int[][] rgb;
	public static int[][] dp;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		rgb = new int[N][3];
		dp = new int[N][3];

		if(N >= 2 && N <= 1000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				rgb[n][0] = Integer.parseInt(st.nextToken());
				rgb[n][1] = Integer.parseInt(st.nextToken());
				rgb[n][2] = Integer.parseInt(st.nextToken());
			}
			
			dp[0][0] = rgb[0][0];
			dp[0][1] = rgb[0][1];
			dp[0][2] = rgb[0][2];
			
			bw.write(String.valueOf(Math.min(Color(N-1, 0), (Math.min(Color(N-1, 1), Color(N-1, 2))))));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int Color(int n, int input) {
		if(dp[n][input] == 0) {
			if(input == 0) {
				dp[n][0] = Math.min(Color(n-1, 1), Color(n-1, 2)) + rgb[n][0];
			}
			if(input == 1) {
				dp[n][1] = Math.min(Color(n-1, 0), Color(n-1, 2)) + rgb[n][1];
			}
			if(input == 2) {
				dp[n][2] = Math.min(Color(n-1, 0), Color(n-1, 1)) + rgb[n][2];
			}
		}
		
		return dp[n][input];
	}
}