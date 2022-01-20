package N10989;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[] array = new int[10000000];
		
		if(N >= 1 && N <= 10000000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[Integer.parseInt(st.nextToken())]++;
			}
			
			for(int n = 0; n < 10000; n++) {
				if(array[n] > 0) {
					for(int i = 0; i < array[n]; i++) {
						bw.write(String.valueOf(n));
						bw.write(System.lineSeparator());
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}