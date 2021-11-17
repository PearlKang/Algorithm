package N1157;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String input = st.nextToken().toUpperCase();
		
		int max = 0;
		char maxChar = ' ';
		boolean flag = false;
		
		for(int i = 0; i < input.length(); i++) {
			int length = input.length() - input.replace(String.valueOf(input.charAt(i)), "").length();
			if(max < length) {
				max = length;
				maxChar = input.charAt(i);
			}
			else if(max == length)
				flag = true;
		}
		if(!flag)
			bw.write(String.valueOf(maxChar));
		else
			bw.write("?");
		
		bw.flush();
		bw.close();
		br.close();
	}
}