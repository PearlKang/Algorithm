package N1546;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N <= 1000) {
			double[] score = new double[N];
			double M = 0, sum = 0;
			
			st = new StringTokenizer(br.readLine());
			
			for(int n = 0; n < N; n++) {
				score[n] = Integer.parseInt(st.nextToken());
				
				if(M < score[n])
					M = score[n];
			}

			for(int n = 0; n < N; n++)
				score[n] = (score[n] / M) * 100;
			
			for(int n = 0; n < N; n++)
				sum += score[n];
			
			System.out.println(sum/N);
		}
		
		br.close();
	}
}