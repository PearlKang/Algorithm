package N11022;

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
			
			int A = Integer.parseInt(st.nextToken()); 
			int B = Integer.parseInt(st.nextToken());
			
			if((A > 0 && A < 10) && (B > 0 && B < 10)) {
				bw.write("Case #" + (t+1) + ": " + A + " + " + B + " = ");
				bw.write(A + B + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}