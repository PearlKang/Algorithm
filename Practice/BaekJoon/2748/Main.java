package N2748;

import java.io.*;
import java.util.*;

public class Main {
	public static long[] array;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		array = new long[n+1];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
		
		array[0] = 0;
		array[1] = 1;
		
		if(n > 0 && n <= 90) {
			bw.write(String.valueOf(fibonacci(n)));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static long fibonacci(int input) {
		if(array[input] == -1) {
			array[input] = fibonacci(input-1) + fibonacci(input-2);
		}
		
		return array[input];
	}
}