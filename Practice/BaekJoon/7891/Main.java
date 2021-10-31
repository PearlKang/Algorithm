package N7891;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		if(t <= 100) {
			for(int i = 0; i < t; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				if((x >= -1000000000 && x <= 1000000000) && (y >= -1000000000 && y <= 1000000000)) {
					bw.write(String.valueOf(x + y));
					bw.write(System.lineSeparator());
				}
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}