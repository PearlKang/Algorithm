package N9713;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			
			int n, a = 1, d = 2, l;
			
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