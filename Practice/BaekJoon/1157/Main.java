package N1157;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		
		int[] array = new int[26];
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= 'a')
				array[input.charAt(i) - 'a']++;
			else
				array[input.charAt(i) - 'A']++;
		}
		
		int max = 0;
		char maxChar = ' ';
		
		for(int i = 0; i < 26; i++) {
			if(max < array[i]) {
				max = array[i];
				maxChar = (char)(i + 'A');
			}
			else if(max == array[i])
				maxChar = '?';
		}
			bw.write(String.valueOf(maxChar));
		
		bw.flush();
		bw.close();
		br.close();
	}
}