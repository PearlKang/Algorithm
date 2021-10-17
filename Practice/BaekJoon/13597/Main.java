package N13597;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if((A >= 1 && A <= 13) && (B >= 1 && B <= 13)) {
			if(A == B)
				bw.write(String.valueOf(A));
			else if(A > B)
				bw.write(String.valueOf(A));
			else if(A < B)
				bw.write(String.valueOf(B));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}