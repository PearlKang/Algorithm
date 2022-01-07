package N1018;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[][] input = new boolean[N][M];
		
		if((N >= 8 && N <= 50) && (M >= 8 && M <= 50)) {
			int min = 64;
			int cnt;
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				String tmp = st.nextToken();
				
				for(int m = 0; m < M; m++) {
					if(tmp.charAt(m) == 'B')
						input[n][m] = true;
					else
						input[n][m] = false;
				}
			}
			
			for(int n = 0; n < N-7; n++) {
				for(int m = 0; m < M-7; m++) {
					cnt = 0;
					boolean standard = input[n][m];
					
					for(int n1 = n; n1 < n+8; n1++) {
						for(int m1 = m; m1 < m+8; m1++) {
							if(standard != input[n1][m1])
								cnt++;
							
							standard = !standard;
						}
						
						standard = !standard;
					}
					
					cnt = Math.min(cnt, 64-cnt);
					min = Math.min(cnt, min);
				}
			}
			
			bw.write(String.valueOf(min));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}