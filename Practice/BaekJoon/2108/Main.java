package N2108;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if((N >= 1 && N <= 500000) && (N % 2 == 1)) {
			int[] array = new int[8001];
			int total = 0;
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				int tmp = Integer.parseInt(st.nextToken());
				array[tmp + 4000]++;
				total += tmp;
			}
			
			bw.write(String.valueOf(total/N >= 0 ? Math.round(total/N) : Math.round(total/N) - 1));
			bw.write(System.lineSeparator());
			
			
			int mid = 0;
			int midCnt = 0;
			
			for(int n = 0; n < 8001; n++) {
				midCnt += array[n];
				
				if(midCnt >= (N/2 + 1)) {
					mid = n - 4000;
					break;
				}
			}
			
			bw.write(String.valueOf(mid));
			bw.write(System.lineSeparator());
			
			
			int cnt = 0;
			int manyNCnt = 0;
			int manyN = 0;
			
			for(int n = 0; n < 8001; n++) {
				if(cnt < array[n]) {
					cnt = array[n];
				}
			}
			
			for(int n = 0; n < 8001; n++) {
				if(array[n] == cnt) {
					cnt = array[n];
					manyNCnt++;
					
					if(manyNCnt == 1 || manyNCnt == 2) {
						manyN = n - 4000;
					}
				}
			}
			
			bw.write(String.valueOf(manyN));
			bw.write(System.lineSeparator());
			
			
			int maxN = 0;
			int minN = 0;
			
			for(int n = 0; n < 8001; n++) {
				if(array[n] > 0) {
					minN = n - 4000;
					break;
				}
			}
			
			for(int n = 8000; n >= 0; n--) {
				if(array[n] > 0) {
					maxN = n - 4000;
					break;
				}
			}
			
			bw.write(String.valueOf(Math.abs(maxN - minN)));
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}