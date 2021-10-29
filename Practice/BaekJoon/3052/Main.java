package N3052;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = null;
		
		int[] array = new int[10];
		int[] chk = new int[42];
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken()) % 42;
		}
		
		for(int i = 0; i < 10; i++)
			chk[array[i]] = 1;
		
		for(int i = 0; i < 42; i++)
			if(chk[i] == 1)
				cnt++;
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.flush();
		bw.close();
	}
}