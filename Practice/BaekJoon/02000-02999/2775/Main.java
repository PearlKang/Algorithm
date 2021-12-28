package N2775;

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
			int K = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			int[][] array = new int[K+1][N];
			
			for(int i = 0; i < N; i++)
				array[0][i] = i+1;
			
			for(int i = 1; i < K+1; i++)
				for(int j = 0; j < N; j++)
					for(int k = 0; k <= j; k++)
						array[i][j] += array[i-1][k];
			
			bw.write(String.valueOf(array[K][N-1]));
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}