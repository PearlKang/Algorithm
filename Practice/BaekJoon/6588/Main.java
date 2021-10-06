package N6588;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;

		int n = 0;
		int count = 0;
		
		while(count++ < 100000) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			if(n == 0)
				break;
			
			int goldbach = Goldbach(n); 
			
			if(n >= 6 && n <= 1000000 && (n % 2 == 0)) {
				if(goldbach != 0)
					bw.write(n + " = " + goldbach + " + " + (n - goldbach) + "\n");
			}
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
	
	public static int Goldbach(int num) {
		for(int i = 0; i <= num/2; i++)
			if(isPrime(i) && isPrime(num - i))
				return i;
		
		return 0;
	}
}