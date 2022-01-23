package N11651;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] array = new int[N][2];
		
		if(N >= 1 && N <= 100000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[n][0] = Integer.parseInt(st.nextToken());
				array[n][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(array, (e1, e2) -> {
				if(e1[1] == e2[1]) {
					return e1[0] - e2[0];
				}
				else {
					return e1[1] - e2[1];
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