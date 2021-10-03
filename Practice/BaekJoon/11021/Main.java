package N11021;

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
			st = new StringTokenizer(br.readLine());
			bw.write("Case #" + (t+1) + ": ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}