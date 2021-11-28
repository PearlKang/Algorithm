package N10250;

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
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if((H >= 1 && H <= 99) && (W >= 1 && W <= 99) && (N >= 1 && N <= H * W)) {
				if(N % H == 0)
					bw.write(String.valueOf(N / H));
				else
					bw.write(String.valueOf(N % H));
				
				if(N / H < 10)
					bw.write(String.valueOf(0));
				
				if(N % H == 0)
					bw.write(String.valueOf(N));
				else
					bw.write(String.valueOf(N / H + 1));
				
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}