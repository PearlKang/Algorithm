package N2292;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		
		if(N >= 1 && N <= 1000000000)
			bw.write(String.valueOf(sequence(N)));

		bw.flush();
		bw.close();
		br.close();
	}
	
	public static long sequence(long input) {
		if(input == 1)
			return 1;
		
		for(int i = 0;; i++)
			if(input > sum(i) && input <= sum(i+1))
				return i+1;
	}
	
	public static long sum(long input) {
		return 1 + 3 * input * (input-1);
	}
}

/*
1
6
12
18
24
6*n

1 + 6 + 12 + 18 + 24 + ...
1   2   3    4    5

1 + 6 * n

1 + 6 * (1 + 2 + 3 + ...)

1 + 3 * n * (n - 1) <= input
*/