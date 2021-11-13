import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		if(N == 0 || N == 1) {
			System.out.println(1);
			return;
		}

		long dp[] = new long[N + 1];

		for(int i = 0;i <= N;i++)
			dp[i] = 0;

		dp[0] = 1;
		dp[1] = 1;

		for(int i = 2;i <= N;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[N-1]);
    }
}
