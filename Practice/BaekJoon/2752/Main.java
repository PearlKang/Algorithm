package N2752;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int[] input = new int[3];
		int tmp = 0;
		
		for(int i = 0; i < 3; i++)
			input[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 3; j++) {
				if(input[i] > input[j]) {
					tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < 3; i++)
			bw.write(input[i] + " ");
		
		br.close();
		bw.flush();
		bw.close();
	}
}