package N10814;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String[][] array = new String[N][2];
		
		if(N >= 1 && N <= 100000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[n][0] = st.nextToken();
				array[n][1] = st.nextToken();
			}
			
			Arrays.sort(array, new Comparator<String[]>() {
				public int compare(String[] s1, String[] s2) {
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				}
			});
			
			for(int n = 0; n < N; n++) {
				bw.write(array[n][0] + " " + array[n][1]);
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}