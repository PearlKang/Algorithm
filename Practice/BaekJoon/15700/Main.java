package N15700;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		if((N >= 1 && N <= 1000000000) && (M >= 1 && M <= 1000000000))
			bw.write(String.valueOf(N*M/2));
		
		bw.flush();
		bw.close();
		br.close();
	}
}