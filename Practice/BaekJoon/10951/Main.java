package N10951;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		String tmp = null;
		
		while((tmp = br.readLine()) != null) {
			st = new StringTokenizer(tmp);
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if((A > 0 && A < 10) && (B > 0 && B < 10))
				bw.write(A + B + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}