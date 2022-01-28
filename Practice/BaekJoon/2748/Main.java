package N2748;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] fibonacci = new int[n+1];
		
		if(n > 0 && n <= 90) {
			for(int i = 0; i < fibonacci.length; i++) {
				if(i == 0) {
					fibonacci[i] = 0;
				}
				else if(i == 1) {
					fibonacci[i] = 1;
				}
				else {
					fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
				}
			}
			
			bw.write(String.valueOf(fibonacci[n]));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}