package N1149;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] rgb = new int[N][3];
		
		if(N >= 2 && N <= 1000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				rgb[n][0] = Integer.parseInt(st.nextToken());
				rgb[n][1] = Integer.parseInt(st.nextToken());
				rgb[n][2] = Integer.parseInt(st.nextToken());
			}
			
			for(int n = 1; n < N; n++) {
				rgb[n][0] += Math.min(rgb[n-1][1], rgb[n-1][2]);
				rgb[n][1] += Math.min(rgb[n-1][0], rgb[n-1][2]);
				rgb[n][2] += Math.min(rgb[n-1][0], rgb[n-1][1]);
			}
			
			bw.write(String.valueOf(Math.min(rgb[N-1][0], (Math.min(rgb[N-1][1], rgb[N-1][2])))));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}