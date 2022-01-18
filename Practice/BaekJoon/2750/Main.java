package N2750;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] array = new boolean[2001];
		
		if(N >= 1 && N <= 1000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[Integer.parseInt(st.nextToken()) + 1000] = true;
			}
			
			for(int n = 0; n < 2001; n++) {
				if(array[n]) {
					bw.write(String.valueOf(n-1000));
					bw.write(System.lineSeparator());
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}