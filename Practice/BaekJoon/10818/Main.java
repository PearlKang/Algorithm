package N10818;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 1000000) {
			st = new StringTokenizer(br.readLine());
			
			int min = 1000000, max = -1000000;
			int[] array = new int[N];
			
			while(st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				
				if(min > tmp)
					min = tmp;
				if(max < tmp)
					max = tmp;
			}
			
			bw.write(String.valueOf(min) + " " + String.valueOf(max));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}