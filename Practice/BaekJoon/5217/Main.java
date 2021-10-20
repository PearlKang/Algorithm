package N5217;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		if(T < 100) {
			for(int t = 0; t < T; t++) {
				st = new StringTokenizer(br.readLine());
				
				int n = Integer.parseInt(st.nextToken());
				
				if(n >= 1 && n <= 12) {
					bw.write("Pairs for " + String.valueOf(n) + ": ");
					
					for(int m = 1; m <= n/2; m++) {
						if(m != n-m) {
							bw.write(String.valueOf(m) + " " + String.valueOf(n-m));

							if((m != n-m-1) && (m != n-m-2))
								bw.write(", ");
						}
					}
					
					bw.write(System.lineSeparator());
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}