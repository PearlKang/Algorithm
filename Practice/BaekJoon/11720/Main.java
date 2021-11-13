package N11720;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 100) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			int output = 0;
			
			for(int i = 0; i < input.length(); i++)
				output += Integer.parseInt(String.valueOf(input.charAt(i)));
			
			bw.write(String.valueOf(output));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}