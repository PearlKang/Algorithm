package N18870;

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
		int[] tmp = new int[N];
		int[] rank = new int[N];
		rank[0] = 0;
		
		if(N >= 1 && N <= 1000000) {
			st = new StringTokenizer(br.readLine());
			
			for(int n = 0; n < N; n++) {
				array[n] = Integer.parseInt(st.nextToken());
				tmp[n] = array[n];
			}
			
			Arrays.sort(tmp);
			
			for(int n = 1, r = 0; n < N; n++) {
				rank[n] = (tmp[n] == tmp[n-1]) ? r : ++r;
			}
			
			for(int n = 0; n < N; n++) {
				for(int m = 0; m < N; m++) {
					if(array[n] == tmp[m]) {
						bw.write(String.valueOf(rank[m]));
						bw.write(" ");
						break;
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
/*
for(int n = 0; n < N; n++) {
	for(int m = 0; m < N; m++) {
		if(array[n][0] == tmp[m]) {
			if(m != 0 && tmp[m] == tmp[m-1]) {
				array[n][1] = array[n-1][1];
			}
			else {
				array[n][1] = m;
			}
			break;
		}
	}
}
*/