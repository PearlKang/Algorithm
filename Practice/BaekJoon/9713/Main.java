package N9713;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(((N % 2 == 0) ? (N / 2) : (N / 2 + 1)) * (1 + ((N % 2 == 0) ? (N - 1) : (N))) / 2));
			bw.write(System.lineSeparator());
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}