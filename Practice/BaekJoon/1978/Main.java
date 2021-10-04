package N1978;

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
			st = new StringTokenizer(br.readLine());
			int cnt = 0;
			
			for(int n = 0; n < N; n++) {
				int input = Integer.parseInt(st.nextToken());
				cnt = isPrime(input) ? ++cnt : cnt;
			}
			bw.write(cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static boolean isPrime(int num) {
		if(num == 1)
			return false;
		
		for(int i = 2; i <= Math.sqrt(num); i++)
			if(num % i == 0)
				return false;
		
		return true;
	}
}