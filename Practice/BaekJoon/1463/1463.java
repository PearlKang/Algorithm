import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int dp[] = new int[N+1];

		for(int i = 0;i <= N;i++)
			dp[i] = 0;

		for(int i = 2;i <= N;i++) {
			dp[i] = dp[i-1] + 1;
			if(i % 2 == 0)
				dp[i] = Math.min(dp[i],dp[i/2] + 1);
			if(i % 3 == 0)
				dp[i] = Math.min(dp[i],dp[i/3] + 1);
		}

		System.out.println(dp[N]);
    }
}
