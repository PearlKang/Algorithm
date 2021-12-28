package N13752;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		if(n >= 1 && n <= 100) {
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken());
				
				if(k >= 1 && k <= 80) {
					for(int j = 0; j < k; j++)					
						bw.write("=");
					bw.write(System.lineSeparator());
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}