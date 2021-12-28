package N10809;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String S = st.nextToken().toLowerCase();
		
		int[] output = new int[26];
		
		for(int i = 0; i < 26; i++)
			output[i] = -1;
		
		for(int i = 0; i < S.length(); i++) {
			char input = S.charAt(i);
			
			if(output[input - 'a'] == -1) {
				output[input - 'a'] = i;
				continue;
			}
		}
		
		for(int i:output) {
			bw.write(String.valueOf(i));
			bw.write(" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}