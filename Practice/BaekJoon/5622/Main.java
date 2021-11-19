package N5622;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		
		int cnt = 0;

		for(int i  = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);
			cnt += (tmp - 'A') / 3 + 3;
			if(tmp == 'Z')
				cnt--;
		}
		bw.write(String.valueOf(cnt));

		bw.flush();
		bw.close();
		br.close();
	}
}