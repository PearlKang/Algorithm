package N8958;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			int length = input.length();
			int continuous = 0, score = 0;
			
			if(length > 0 && length < 80) {
				for(int i = 0; i < length; i++) {
					if(input.charAt(i) == 'O')
						score += ++continuous;
					else
						continuous = 0;
				}
			}
			bw.write(String.valueOf(score));
			bw.write(System.lineSeparator());
		}
		br.close();
		bw.flush();
		bw.close();
	}
}