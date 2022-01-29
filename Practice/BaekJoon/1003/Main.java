package N1003;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		int[][] fibonacci = new int[41][2];
		
		fibonacci[0][0] = 1;
		fibonacci[0][1] = 0;
		fibonacci[1][0] = 0;
		fibonacci[1][1] = 1;
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			for(int i = 2; i <= N; i++) {
				fibonacci[i][0] = fibonacci[i-1][0] + fibonacci[i-2][0];
				fibonacci[i][1] = fibonacci[i-1][1] + fibonacci[i-2][1];
			}
			
			bw.write(String.valueOf(fibonacci[N][0]));
			bw.write(" ");
			bw.write(String.valueOf(fibonacci[N][1]));
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}