package N6749;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int Y = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(Y + (W - Y) * 2));
		
		br.close();
		bw.flush();
		bw.close();
	}
}