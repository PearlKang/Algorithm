package N4344;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		
		for(int c = 0; c < C; c++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			int sum = 0;
			double cnt = 0;
			
			if(N < 1 || N > 1000)
				continue;
			
			for(int n = 0; n < N; n++) {
				score[n] = Integer.parseInt(st.nextToken());
				sum += score[n];
			}
			
			double avg = sum / N;
			
			for(int n = 0; n < N; n++)
				if(score[n] > avg)
					cnt++;
			
			bw.write(String.format("%.3f", cnt*100/N) + "%");
			bw.write(System.lineSeparator());
		}
		br.close();
		bw.flush();
		bw.close();
	}
}