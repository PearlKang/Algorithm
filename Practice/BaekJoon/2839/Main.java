package N2839;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 3 && N <= 5000) {
			int min = -1;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(N == 3*i + 5*j) {
						if(min > i + j || min == -1) {
							min = i + j;
						}
					}
					else if(N < 3*i + 5*j) {
						break;
					}
				}
			}
			
			bw.write(String.valueOf(min));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}