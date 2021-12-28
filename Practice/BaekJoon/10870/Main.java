package N10870;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		if(n >= 0 && n <= 20)
			bw.write(String.valueOf(fibonacci(n)));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int fibonacci(int input) {
		if(input == 0)
			return 0;
		else if(input == 1)
			return 1;
		else
			return fibonacci(input-2) + fibonacci(input-1);
	}
}