package N22966;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 4) {
			String[][] array = new String[N][2];
			String title = null;
			int level = 5;
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[n][0] = st.nextToken();
				array[n][1] = st.nextToken();
			}
			
			for(int n = 0; n < N; n++) {
				if(level > Integer.parseInt(array[n][1])) {
					level = Integer.parseInt(array[n][1]);
					title = array[n][0];
				}
			}
			
			bw.write(title);
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}