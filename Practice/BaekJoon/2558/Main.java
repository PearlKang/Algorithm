package N2558;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		
		bw.write(A + B + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}