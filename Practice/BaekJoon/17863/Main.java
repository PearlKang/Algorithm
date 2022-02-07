package N17863;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1000000 && N <= 9999999) {
			if(N/10000 == 555)
				bw.write("YES");
			else
				bw.write("NO");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}