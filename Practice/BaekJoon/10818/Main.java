package N10818;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 1000000) {
			st = new StringTokenizer(br.readLine());
			
			int i = 0;
			int[] array = new int[N];
			
			while(st.hasMoreTokens())
				array[i++] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(array);
			
			bw.write(String.valueOf(array[0]) + " " + array[array.length - 1]);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}