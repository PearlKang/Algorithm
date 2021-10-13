package N1550;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//input : 16, hexa
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		//output1 : 10, decimal
		int tmp10 = Integer.parseInt(st.nextToken(),16);
		//output2 : 16, hex
		String tmp16 = Integer.toHexString(tmp10);
		
		bw.write(tmp10 + "\n");
		bw.write(tmp16 + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}