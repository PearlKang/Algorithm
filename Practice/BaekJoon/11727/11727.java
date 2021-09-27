import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		long[] bp = new long[N+1];

		if(N == 0 || N == 1) {
			System.out.println(1);
			return;
		}

		bp[0] = bp[1] = 1;

		for(int i = 2;i <= N;i++) {
			bp[i] = (bp[i-2] + bp[i-2] + bp[i-1]) % 10007;
		}

		System.out.println(bp[N]);
    }
}
