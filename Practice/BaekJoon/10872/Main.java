package N10872;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 0 && N <= 12)
			bw.write(String.valueOf(factorial(N)));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	//recursiveFunction
	public static int factorial(int input) {
		if(input <= 1)
			return 1;
		else
			return input * factorial(input-1);
	}
}