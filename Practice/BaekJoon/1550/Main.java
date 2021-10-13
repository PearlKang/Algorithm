package N1550;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int input = Integer.parseInt(st.nextToken(),16);
		
		bw.write(input + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}