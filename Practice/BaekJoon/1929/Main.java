package N1929;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		if(M >= 1 && M <= N && N <= 1000000) {
			for(int i = M; i <= N; i++) {
				if(isPrime(i)) {
					bw.write(String.valueOf(i));
					bw.write(System.lineSeparator());
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static boolean isPrime(int input) {
		if(input == 1)
			return false;
				
		for(int i = 2; i <= Math.sqrt(input); i++)
			if(input % i == 0)
				return false;
		
		return true;
	}
}