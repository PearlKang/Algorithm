package N1436;

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
		int cnt = 0;
		int num = 0;
		int tmp;
		
		if(N > 0 && N <= 10000) {
			while(cnt < N) {
				boolean flag = false;
				num++;
				tmp = num;
				
				while(tmp != 0) {
					if(tmp % 10 == 6 && (tmp / 10) % 10 == 6 && (tmp / 100) % 10 == 6)
						flag = true;
					
					tmp /= 10;
				}
				
				if(flag) {
					array[cnt] = num;
					cnt++;
				}
			}
			
			bw.write(String.valueOf(array[N-1]));
		}
				
		bw.flush();
		bw.close();
		br.close();
	}
}