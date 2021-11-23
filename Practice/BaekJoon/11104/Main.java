package N11104;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		if(n <= 1000) {
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String input = st.nextToken();
				
				bw.write(String.valueOf(Integer.parseInt(input, 2)));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}