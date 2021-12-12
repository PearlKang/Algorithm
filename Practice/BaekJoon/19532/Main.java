package N19532;

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
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		if((a >= -999 && a <= 999) && (b >= -999 && b <= 999) && (c >= -999 && c <= 999) && (d >= -999 && d <= 999) && (e >= -999 && e <= 999) && (f >= -999 && f <= 999)) {
			if(b*d != a*e) {
				bw.write(String.valueOf((double)(b*f-c*e)/(b*d-a*e)));
				bw.write(" ");
				bw.write(String.valueOf((double)(a*f-c*d)/(a*e-b*d)));
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}