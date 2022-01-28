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
		
		if(n > 0 && n <= 90) {
			long f1 = 0;
			long f2 = 1;
			long sum = f1 + f2;
			
			for(int i = 1; i < n; i++) {
				sum = f1 + f2;
				f1 = f2;
				f2 = sum;
			}
			
			bw.write(String.valueOf(sum));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}