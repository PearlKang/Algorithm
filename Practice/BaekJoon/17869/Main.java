package N17869;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		int cnt = 0;
		
		while(true) {
			if(N % 2 == 0) {
				N /= 2;
			}
			else {
				N += 1;
			}
			
			cnt++;
			
			if(N == 1)
				break;
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}
}