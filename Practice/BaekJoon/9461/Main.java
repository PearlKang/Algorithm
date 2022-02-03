package N9461;

import java.io.*;
import java.util.*;

public class Main {
	public static int pn[] = new int[101];
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		pn[0] = 0;
		pn[1] = 1;
		pn[2] = 1;
		pn[3] = 1;
		
		if(T >= 1 && T <= 100) {
			for(int t = 0; t < T; t++) {
				st = new StringTokenizer(br.readLine());
				int N = Integer.parseInt(st.nextToken());
				
				bw.write(String.valueOf(PN(N)));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int PN(int input) {
		if(input > 2 && pn[input] == 0) {
			pn[input] = PN(input-2) + PN(input-3);
		}
		
		return pn[input];
	}
}