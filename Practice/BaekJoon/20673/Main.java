package N20673;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int q = Integer.parseInt(st.nextToken());
		
		if(p >= 0 && p <= 1000 && q >= 0 && q <= 500 && q <= p) {
			if(p <= 50 && q <= 10) {
				bw.write("White");
			}
			else if(q > 30) {
				bw.write("Red");
			}
			else {
				bw.write("Yellow");	
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}