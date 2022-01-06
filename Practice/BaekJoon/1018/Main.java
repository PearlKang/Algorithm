package N1018;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if((N >= 8 && N <= 50) && (M >= 8 && M <= 50)) {
			String[] input = new String[N];
			int min = 1000000;
			int cnt;
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				input[n] = st.nextToken();
			}
			
			for(int n = 0; n < N-7; n++) {
				for(int m = 0; m < M-7; m++) {
					cnt = 0;
					
					for(int n1 = n; n1 < n+7; n1++) {
						for(int m1 = m; m1 < m+7; m1++) {
							if((input[n1].charAt(m1) != input[n1].charAt(m1+1)) && (input[n1].charAt(m1) != input[n1+1].charAt(m1))) {
								continue;
							}
							else {
								if((input[n1].charAt(m1) == input[n1].charAt(m1+1)) && (input[n1].charAt(m1) == input[n1+1].charAt(m1))) {
									if(input[n1].charAt(m1) == 'B')
										input[n1] = input[n1].substring(0, m1) + "W" + input[n1].substring(m1+1);
									else
										input[n1] = input[n1].substring(0, m1) + "B" + input[n1].substring(m1+1);
								}
								else if((input[n1].charAt(m1) != input[n1].charAt(m1+1)) && (input[n1].charAt(m1) == input[n1+1].charAt(m1))) {
									if(input[n1].charAt(m1) == 'B')
										input[n1+1] = input[n1+1].substring(0, m1) + "W" + input[n1+1].substring(m1+1);
									else
										input[n1+1] = input[n1+1].substring(0, m1) + "B" + input[n1+1].substring(m1+1);
								}
								else if((input[n1].charAt(m1) == input[n1].charAt(m1+1)) && (input[n1].charAt(m1) != input[n1+1].charAt(m1))) {
									if(input[n1].charAt(m1) == 'B')
										input[n1] = input[n1].substring(0, m1+1) + "W" + input[n1].substring(m1+2);
									else
										input[n1] = input[n1].substring(0, m1+1) + "B" + input[n1].substring(m1+2);
								}
								cnt++;
							}
						}
					}
					
					if(min > cnt) {
						min = cnt;
					}
				}
			}
			
			bw.write(String.valueOf(min));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}