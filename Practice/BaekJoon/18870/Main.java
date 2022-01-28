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
		// int[] sort = array.clone();
		int[] sort = new int[N];
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		if(N >= 1 && N <= 1000000) {
			st = new StringTokenizer(br.readLine());
			
			for(int n = 0; n < N; n++) {
				array[n] = sort[n] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(sort);
			
			int rank = 0;
			
			for(int i : sort) {
				if(!map.containsKey(i)) {
					map.put(i, rank++);
				}
			}
			
			for(int i : array) {
				bw.write(String.valueOf(map.get(i)));
				bw.write(" ");
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