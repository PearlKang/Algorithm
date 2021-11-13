package N1934;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 1 && T <= 1000) {
			for(int t = 0; t < T; t++) {
				st = new StringTokenizer(br.readLine());

				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());

				if((A >= 1 && A <= 45000) && (B >= 1 && B <= 45000)) {
					int GCD = gcd(A, B);
					bw.write(A * B / GCD + "\n");
				}
			}
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