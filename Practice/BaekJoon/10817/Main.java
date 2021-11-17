package N10817;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int[] input = new int[3];
		
		for(int i = 0; i < 3; i++)
			input[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(input);
		
		bw.write(String.valueOf(input[1]));
		
		bw.flush();
		bw.close();
		br.close();
	}
}