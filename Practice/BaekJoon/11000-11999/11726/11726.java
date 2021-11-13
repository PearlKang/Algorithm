import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		if(n == 0 || n == 1) {
			System.out.println(1);
			return;
		}

		int dp[] = new int[n + 1];

		for(int i = 0;i <= n;i++)
			dp[i] = 0;

		dp[0] = 1;
		dp[1] = 1;

		for(int i = 2;i <= n;i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		System.out.println(dp[n]);
    }
}
