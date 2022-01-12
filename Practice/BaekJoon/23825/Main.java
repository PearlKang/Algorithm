package N23825;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if((N >= 1 && N <= 1000000000) && (M >= 1 && M <= 1000000000)) {
			bw.write(String.valueOf(Math.min(N, M)/2));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}