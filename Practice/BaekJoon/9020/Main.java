package N9020;

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
			int n = Integer.parseInt(st.nextToken());
			
			if(n >= 4 && n <= 10000) {
				int goldbachP = goldbachPartition(n);
				bw.write(String.valueOf(goldbachP) + " " + String.valueOf(n-goldbachP));
				bw.write(System.lineSeparator());
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
	
	public static int goldbachPartition(int input) {
		int min = 10000;
		int output = 0;
		
		for(int i = 0; i <= input/2; i++) {
			if(isPrime(i) && isPrime(input-i)) {
				if(min > Math.abs(input-2*i)) {
					min = Math.abs(input-2*i);
					output = i;
				}
			}
		}
		
		return output;
	}
}