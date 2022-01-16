package N21591;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int wc = Integer.parseInt(st.nextToken());
		int hc = Integer.parseInt(st.nextToken());
		int ws = Integer.parseInt(st.nextToken());
		int hs = Integer.parseInt(st.nextToken());
		
		if((wc >= 1 && wc <= 1000) && (hc >= 1 && hc <= 1000) && (ws >= 1 && ws <= 1000) && (hs >= 1 && hs <= 1000)) {
			if((wc - ws > 1) && (hc - hs > 1)) {
				bw.write("1");
			}
			else {
				bw.write("0");				
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}