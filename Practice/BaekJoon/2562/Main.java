package N2562;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 0, cnt = 0, max = 0;
		
		while(++n < 10) {
			StringTokenizer st = null;
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num > 0 && num < 100) { 
				if(num > max) {
					max = num;
					cnt = n;
				}
			}
		}
		
		bw.write(String.valueOf(max));
		bw.write(System.lineSeparator());
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.flush();
		bw.close();
	}
}