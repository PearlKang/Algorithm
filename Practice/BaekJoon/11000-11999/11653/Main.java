package N11653;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 10000000) {
			while(true) {
				for(int i = 1; i <= N; i++) {
					if(N % i == 0 && i != 1) {
						bw.write(String.valueOf(i));
						bw.write(System.lineSeparator());
						N /= i;
						break;
					}
				}
				
				if(N == 1)
					break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}