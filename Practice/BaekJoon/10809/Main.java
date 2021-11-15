package N10809;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String S = st.nextToken().toLowerCase();
		
		if(S.length() > 0  && S.length() <= 100) {
			for(int i = 0; i < 26; i++) {
				boolean flag = false;

				for(int s = 0; s < S.length(); s++) {
					if(S.charAt(s) == (97 + i)) {
						bw.write(String.valueOf(S.indexOf(S.charAt(s))));
						flag = true;
						break;
					}
				}
				if(!flag)
					bw.write(String.valueOf(-1));
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}