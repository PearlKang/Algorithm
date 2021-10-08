package N9093;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t++) {
			String sentense = br.readLine();
			
			if(sentense.length() <= 1000) {
				st = new StringTokenizer(sentense);
				
				while(st.hasMoreTokens()) {
					String tmp = st.nextToken();
					if(tmp.length() <= 20)
						bw.write(String.valueOf(reverse(tmp)) + " ");
				}
				bw.write("\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static char[] reverse(String input) {
		char[] output = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++)
			output[i] = input.charAt(input.length() - i - 1);
		
		return output;
	}
}