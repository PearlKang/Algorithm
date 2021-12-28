package N2581;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if((M >= 1 && M <= 10000) && (N >= 1 && N <= 10000) && M <= N) {
			int minimum = 10001;
			int sum = 0;
			
			for(int i = M; i <= N; i++) {
				if(isPrime(i)) {
					sum += i;
					if(minimum > i)
						minimum = i;
				}
			}
			if(minimum != 10001) {
				bw.write(String.valueOf(sum));
				bw.write(System.lineSeparator());
				bw.write(String.valueOf(minimum));
			}
			else
				bw.write(String.valueOf(-1));	
		}
		
		bw.flush();
		bw.close();
		br.close();
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