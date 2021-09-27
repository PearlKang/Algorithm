import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		int MAX = 40;
		int fibo[][] = new int[MAX + 1][2];
		fibo[0][0] = 1;
		fibo[0][1] = 0;
		fibo[1][0] = 0;
		fibo[1][1] = 1;

		for(int i = 0;i < T;i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			for(int j = 2;j <= n;j++) {
				fibo[j][0] = fibo[j-1][0] + fibo[j-2][0];
				fibo[j][1] = fibo[j-1][1] + fibo[j-2][1];
			}
			System.out.println(fibo[n][0] + " " + fibo[n][1]);
		}
    }
}
