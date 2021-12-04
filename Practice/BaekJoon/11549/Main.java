package N11549;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 1 && T <= 4) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			if((A >= 1 && A <= 4) && (B >= 1 && B <= 4) && (C >= 1 && C <= 4) && (D >= 1 && D <= 4) && (E >= 1 && E <= 4)) {
				int count = 0;
				
				if(T == A)
					count++;
				if(T == B)
					count++;
				if(T == C)
					count++;
				if(T == D)
					count++;
				if(T == E)
					count++;
				
				bw.write(String.valueOf(count));
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}