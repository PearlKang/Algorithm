package N9020;

import java.io.*;
import java.util.*;

public class Main {
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		isPrime();
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			if(n >= 4 && n <= 10000) {
				int front = n/2;
				int back = n/2;
				while(true) {
					if(!prime[front] && !prime[back]) {
						bw.write(String.valueOf(front) + " " + String.valueOf(back));
						bw.write(System.lineSeparator());
						break;
					}
					front--;
					back++;
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	//Sieve Of Eratosthenes
	public static void isPrime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j = i*i; j < prime.length; j+=i)
				prime[j] = true;
		}
	}
}