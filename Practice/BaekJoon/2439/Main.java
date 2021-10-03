package N2439;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 100) {
			for(int n = 0; n < N; n++) {
				for(int m = 0; m < N-n-1; m++)
					bw.write(" ");
				for(int m = 0; m <= n; m++)
					bw.write("*");
				bw.write("\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}