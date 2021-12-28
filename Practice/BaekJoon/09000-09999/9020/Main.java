package N9020;

import java.io.*;

public class Main {
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		isPrime();
		
		for(int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n >= 4 && n <= 10000) {
				int front = n/2;
				int back = n/2;
				while(true) {
					if(!prime[front] && !prime[back]) {
						sb.append(front).append(" ").append(back).append(System.lineSeparator());
						break;
					}
					front--;
					back++;
				}
			}
		}
		System.out.print(sb);
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