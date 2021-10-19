package N4892;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		int n0, n1, n2, n3, n4, cnt = 0;

		while(true) {
			st = new StringTokenizer(br.readLine());

			n0 = Integer.parseInt(st.nextToken());

			if(n0 == 0)
				break;
			
			if(n0 > 0 && n0 < 1000000) {
				n1 = 3 * n0;
				
				if(n1 % 2 == 0)
					n2 = n1 / 2;
				else
					n2 = (n1 + 1) / 2;
				
				n3 = 3 * n2;
				n4 = n3 / 9;
				
				if(n1 % 2 == 0)
					bw.write(String.valueOf(++cnt) + ". even " + String.valueOf(n4) + "\n");
				else
					bw.write(String.valueOf(++cnt) + ". odd " + String.valueOf(n4) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}