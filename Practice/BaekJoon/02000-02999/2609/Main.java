package N2609;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		if((A > 0 && A <= 10000) && (B > 0 && B <= 10000)) {
			int GCD = gcd(A, B);
			bw.write(GCD + "\n");
			bw.write(A * B / GCD + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
