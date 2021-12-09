package N20492;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1000 && N <= 10000000 && N % 1000 == 0) {
			bw.write(String.valueOf((int)(N*(1-0.22))));
			bw.write(" ");
			bw.write(String.valueOf((int)(N*(1-0.2*0.22))));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}