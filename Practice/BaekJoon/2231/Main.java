package N2231;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int minM = 1000000;
		
		if(N >= 1 && N <= 1000000) {
			for(int i = 1; i < N; i++) {
				int M = i;
				int tmp = i;
				
				while(tmp != 0) {
					M += tmp % 10;
					tmp /= 10;
				}
				
				if(N == M && minM > M) {
					minM = i;
				}
			}
		}
		
		if(minM == 1000000)
			bw.write(String.valueOf(0));
		else
			bw.write(String.valueOf(minM));
		
		bw.flush();
		bw.close();
		br.close();
	}
}