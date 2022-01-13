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
		
		if(N >= 1 && N <= 100000) {
			int[][] array = new int[N][2];
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				array[n][0] = Integer.parseInt(st.nextToken());
				array[n][1] = Integer.parseInt(st.nextToken());
			}
			
			for(int n = 0; n < N; n++) {
				for(int m = n; m < N; m++) {
					if(array[n][1] > array[m][1]) {
						int tmp = array[n][0];
						array[n][0] = array[m][0];
						array[m][0] = tmp;
						
						tmp = array[n][1];
						array[n][1] = array[m][1];
						array[m][1] = tmp;
					}
					else if(array[n][1] == array[m][1]) {
						if(array[n][0] > array[m][0]) {
							int tmp = array[n][0];
							array[n][0] = array[m][0];
							array[m][0] = tmp;
							
							tmp = array[n][1];
							array[n][1] = array[m][1];
							array[m][1] = tmp;
						}
					}
				}
			}
			
			for(int n = 0; n < N; n++) {
				bw.write(String.valueOf(array[n][0]) + " " + String.valueOf(array[n][1]));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}