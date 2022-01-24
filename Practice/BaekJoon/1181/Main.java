package N1181;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String[] array = new String[N];
		
		if(N >= 1 && N <= 20000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[n] = st.nextToken();
			}
			
			Arrays.sort(array, new Comparator<String>() {
				public int compare(String s1, String s2) {
					if(s1.length() == s2.length()) {
						return s1.compareTo(s2);
					}
					else {
						return s1.length() - s2.length();
					}
				}
			});
			
			for(int n = 0; n < N; n++) {
				if(n == 0) {
					bw.write(array[n]);
					bw.write(System.lineSeparator());
				}
				else if(!array[n].equals(array[n-1])) {
					bw.write(array[n]);
					bw.write(System.lineSeparator());
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}