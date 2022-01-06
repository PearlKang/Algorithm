package N17010;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			String K = st.nextToken();
			
			for(int l = 0; l < L; l++) {
				bw.write(K);
			}
			
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}