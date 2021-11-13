package N9713;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			int n, a = 1, l;
			
			if(N % 2 == 0)
				n = N / 2;
			else
				n = N / 2 + 1;
			
			if(N % 2 == 0)
				l = N - 1;
			else
				l = N;
			
			sb.append(n * (a + l) / 2).append(System.lineSeparator());
		}
		System.out.println(sb);
		br.close();
	}
}