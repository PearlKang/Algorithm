package N15802;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		
		if(true)
			bw.write(String.valueOf("1"));
		else
			bw.write(String.valueOf("0"));
		
		bw.flush();
		bw.close();
		br.close();
	}
}