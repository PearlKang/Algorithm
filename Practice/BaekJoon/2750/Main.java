package N2750;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int[] array = new int[N];
		
		if(N >= 1 && N <= 1000) {
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[n] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(array);
			
			for(int n = 0; n < N; n++) {
				bw.write(String.valueOf(array[n]));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}