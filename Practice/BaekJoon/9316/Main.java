package N9316;

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
			bw.write("Hello World, Judge ");
			bw.write(String.valueOf(n+1));
			bw.write("!");
			bw.write(System.lineSeparator());
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}