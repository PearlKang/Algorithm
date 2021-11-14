package N2675;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 1 && T <= 1000) {
			for(int t = 0; t < T; t++) {
				st = new StringTokenizer(br.readLine());
				int R = Integer.parseInt(st.nextToken());
				
				if(R >= 1 && R <= 8) {
					String S = st.nextToken();
					
					for(int s = 0; s < S.length(); s++)
						for(int r = 0; r < R; r++)
							bw.write(S.charAt(s));
				}
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}