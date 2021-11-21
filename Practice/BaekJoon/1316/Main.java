package N1316;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		if(N > 0 && N <= 100) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				String input = st.nextToken();
				
				if(isGroupWords(input))
					cnt++;
			}
			
			bw.write(String.valueOf(cnt));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static boolean isGroupWords(String input) {
		boolean[] isGroupWord = new boolean[26];
		
		int beforeWord = 0;
		
		for(int i = 0; i < input.length(); i++) {
			int nowWord = input.charAt(i);
			
			if(beforeWord != nowWord) {
				if(!isGroupWord[nowWord - 'a']) {
					isGroupWord[nowWord - 'a'] = true;
					beforeWord = nowWord;
				}
				else
					return false;
			}
		}
		
		return true; 
	}
}