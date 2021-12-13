package N15680;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N == 0)
			bw.write("YONSEI");
		else if(N == 1)
			bw.write("Leading the Way to the Future");
		
		bw.flush();
		bw.close();
		br.close();
	}
}