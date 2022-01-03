package N7568;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[][] person = new int[N][3];
		
		if(N >= 2 && N <= 50) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				person[n][0] = Integer.parseInt(st.nextToken());
				person[n][1] = Integer.parseInt(st.nextToken());
				person[n][2] = 1;
			}
			
			for(int n = 0; n < N; n++) {
				for(int m = 0; m < N; m++) {
					if(n == m) {
						continue;
					}
					else {
						if(person[n][0] > person[m][0] && person[n][1] > person[m][1]) {
							person[m][2]++;
						}
					}
				}
			}
			
			for(int n = 0; n < N; n++) {
				bw.write(String.valueOf(person[n][2]) + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}