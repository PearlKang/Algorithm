package N4562;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			if(X < Y)
				bw.write("NO BRAINS\n");
			else
				bw.write("MMM BRAINS\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}