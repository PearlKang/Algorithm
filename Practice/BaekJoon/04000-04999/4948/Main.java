package N4948;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		while(n != 0) {
			int cnt = 0;
			
			if(n >= 1 && n <= 123456) {
				for(int i = n+1; i <= 2*n; i++)
					if(isPrime(i))
						cnt++;
				
				bw.write(String.valueOf(cnt));
				bw.write(System.lineSeparator());
			}
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
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