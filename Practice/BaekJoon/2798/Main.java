package N2798;

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
		
		int[] array = new int[N];
		
		if((N >= 3 && N <= 100) && (M >= 10 && M <= 300000)) {
			st = new StringTokenizer(br.readLine());
			
			for(int n = 0; n < N; n++)
				array[n] = Integer.parseInt(st.nextToken());
			
			int output = 0;
			
			for(int i = 0; i < N-2; i++) {
				for(int j = i+1; j < N-1; j++) {
					for(int k = i+2; k < N; k++) {
						if((output <= M) && (output < array[i] + array[j] + array[k]) && (array[i] + array[j] + array[k] <= M))
							output = array[i] + array[j] + array[k];
						
						if(output == M)
							break;
					}
				}
			}
			
			bw.write(String.valueOf(output));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}