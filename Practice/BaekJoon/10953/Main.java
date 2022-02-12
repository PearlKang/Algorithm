package N10953;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 1 && T <= 200000) {
			for(int t = 0; t < T; t++) {
				st = new StringTokenizer(br.readLine(), ",");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				if(A > 0 && A <10 && B > 0 && B <10) {
					bw.write(String.valueOf(A+B));
					bw.write(System.lineSeparator());
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}