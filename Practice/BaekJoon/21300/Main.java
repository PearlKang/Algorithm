package N21300;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int number = 6, sum = 0;
		int[] input = new int[number];
		
		for(int i = 0; i < number; i++) {
			input[i] = Integer.parseInt(st.nextToken());
			sum += input[i];
		}
		
		bw.write(String.valueOf(sum*5));
		
		bw.flush();
		bw.close();
		br.close();
	}
}