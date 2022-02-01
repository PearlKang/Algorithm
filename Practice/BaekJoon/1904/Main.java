package N1904;

import java.io.*;
import java.util.*;

public class Main {
	public static int[] dp = new int[1000001];
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 1000000) {
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			
			for(int n = 3; n < dp.length; n++) {
				dp[n] = -1;
			}
			
			bw.write(String.valueOf(Tile(N)));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int Tile(int input) {
		if(dp[input] == -1) {
			dp[input] = (Tile(input-1) + Tile(input-2)) % 15746;
		}
		
		return dp[input];
	}
}