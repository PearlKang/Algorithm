package N4892;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n0, n1, cnt = 0;

		while(true) {
			n0 = Integer.parseInt(br.readLine());

			if(n0 == 0)
				break;
			
			if(n0 > 0 && n0 < 1000000) {
				n1 = 3 * n0;
				
				if(n1 % 2 == 0)
					bw.write(String.valueOf(++cnt) + ". even " + String.valueOf(n0 / 2) + "\n");
				else
					bw.write(String.valueOf(++cnt) + ". odd " + String.valueOf((n0 - 1) / 2) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}