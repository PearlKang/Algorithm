package N17530;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] output = new int[N];
		
		if(N >= 2 && N <= 10000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				output[n] = Integer.parseInt(st.nextToken());
			}
			
			int max = 0;
			
			for(int n = 0; n < N; n++) {
				if(max < output[n]) {
					max = output[n];
				}
			}
			
			if(max == output[0])
				bw.write("S");
			else
				bw.write("N");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}