package N8370;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int k1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int k2 = Integer.parseInt(st.nextToken());
		
		if((n1 >= 1 && n1 <= 1000) && (k1 >= 1 && k1 <= 1000) && (n2 >= 1 && n2 <= 1000) && (k2 >= 1 && k2 <= 1000))
			bw.write(String.valueOf(n1*k1+n2*k2));
		
		br.close();
		bw.flush();
		bw.close();
	}
}