package N9184;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		boolean check = a == -1 && b == -1 && c == -1 ? false : true;
		
		while(check) {
			bw.write(String.valueOf(w(a, b, c)));
			bw.write(System.lineSeparator());
			
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			check = a == -1 && b == -1 && c == -1 ? false : true;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int w(int a1, int b1, int c1) {
		if (a1 <= 0 || b1 <= 0 || c1 <= 0) {
			return 1;
		}
		
		if (a1 > 20 || b1 > 20 || c1 > 20) {
			return w(20, 20, 20);
		}
		
		if (a1 < b1 && b1 < c1) {
			return w(a1, b1, c1-1) + w(a1, b1-1, c1-1) - w(a1, b1-1, c1);
		}
		
		return w(a1-1, b1, c1) + w(a1-1, b1-1, c1) + w(a1-1, b1, c1-1) - w(a1-1, b1-1, c1-1);
	}
}