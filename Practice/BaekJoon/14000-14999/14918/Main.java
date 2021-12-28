package N14918;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if((a >= -100000 && a <= 100000) && (b >= -100000 && b <= 100000))
			bw.write(String.valueOf(a+b));
		
		bw.flush();
		bw.close();
		br.close();
	}
}