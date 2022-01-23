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
			int sum = 0;
			int cnt = 0;
			int modeCnt = 0;
			int mode = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int median = 0;
			int medianCnt = 0;

			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				int tmp = Integer.parseInt(st.nextToken());
				array[tmp + 4000]++;
				sum += tmp;
				
				if(max < tmp)
					max = tmp;
				if(min > tmp)
					min = tmp;
			}
			
			for(int n = 0; n < 8001; n++) {
				medianCnt += array[n];
				
				if(medianCnt >= (N/2 + 1)) {
					median = n - 4000;
					break;
				}
			}
			
			for(int n = 0; n < 8001; n++) {
				if(cnt < array[n] && array[n] > 0) {
					cnt = array[n];
				}
			}
			
			for(int n = 0; n < 8001; n++) {
				if(array[n] == cnt && array[n] > 0) {
					cnt = array[n];
					modeCnt++;
					
					if(modeCnt > 2) {
						break;
					}
					
					if(modeCnt == 1 || modeCnt == 2) {
						mode = n - 4000;
					}
				}
			}
			
			bw.write(String.valueOf((int)Math.round((double)sum/N)));
			bw.write(System.lineSeparator());
			bw.write(String.valueOf(median));
			bw.write(System.lineSeparator());
			bw.write(String.valueOf(mode));
			bw.write(System.lineSeparator());
			bw.write(String.valueOf(max - min));
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}