import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		int[] array = new int[N];
		int[] dp = new int[N];

		st = new StringTokenizer(br.readLine());

		for(int i = 0;i < N;i++) {
			array[i] = Integer.parseInt(st.nextToken());
			dp[i] = 0;
		}

		dp[0] = array[0];
		int output = array[0];

		for(int i = 1;i < N;i++) {
			dp[i] = Math.max(dp[i-1] + array[i],array[i]);
			output = Math.max(output,dp[i]);
		}

		System.out.println(output);
    }
}
