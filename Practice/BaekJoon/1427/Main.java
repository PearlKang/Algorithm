package N1427;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 1000000000) {
			int cnt = 0;
			int tmp = N;
			
			while(tmp != 0) {
				cnt++;
				tmp /= 10;
			}
			
			Integer[] input = new Integer[cnt];
			
			for(int n = 0; n < cnt; n++) {
				input[n] = N % 10;
				N /= 10;
			}
			
			Arrays.sort(input, Collections.reverseOrder());
			
			for(int n = 0; n < cnt; n++)
				bw.write(String.valueOf(input[n]));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}