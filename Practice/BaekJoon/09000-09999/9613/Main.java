package N9613;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 1 && T <= 100) {
			for(int t = 0; t < T; t++) {
				st = new StringTokenizer(br.readLine());
				
				int N = Integer.parseInt(st.nextToken());
				int[] array = new int[N];
				long sum = 0;
				
				for(int n = 0; n < N; n++)
					array[n] = Integer.parseInt(st.nextToken());
				
				for(int n = 0; n < N - 1; n++) {
					for(int m = n + 1; m < N; m++) {
						sum += gcd(array[n], array[m]);						
					}
				}
				bw.write(sum + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}