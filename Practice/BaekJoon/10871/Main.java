package N10871;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		if((N >= 1 && N <= 10000) && (X >= 1 && X <= 10000)) {
			st = new StringTokenizer(br.readLine());
			
			for(int n = 0; n < N; n++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(tmp < X)
					bw.write(tmp + " ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}