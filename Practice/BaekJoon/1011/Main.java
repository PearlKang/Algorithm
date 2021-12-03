package N1011;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			long x = Integer.parseInt(st.nextToken());
			long y = Integer.parseInt(st.nextToken());
						
			if(x >= 0 && x < y) {
				bw.write(String.valueOf(find(y-x)));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static long find(long input) {
		if(input == 1)
			return 1;
		for(long i = 1;; i++) {
			if(input > odd(i) && input <= even(i))
				return 2*i;
			else if(input > even(i) && input <= odd(i+1))
				return 2*i + 1;
		}
	}

	public static long odd(long input) {
		return input*input; 
	}

	public static long even(long input) {
		return input*(input+1); 
	}
}
/*
kn = kn-1 -1 + kn-1 + kn-1 + 1

1  1
2  1 1
3  1 1 1
4  1 2 1
5  1 2 1 1
6  1 2 2 1
7  1 2 2 1 1
8  1 2 2 2 1
9  1 2 3 2 1
10 1 2 3 2 1 1
11 1 2 3 2 2 1
12 1 2 3 3 2 1
13 1 2 3 3 2 1 1
14 1 2 3 3 2 2 1
15 1 2 3 3 3 2 1
16 1 2 3 4 3 2 1
17 
18 
19 
20 
21 
22 
23 
24 
25 1 2 3 4 5 4 3 2 1


1  1  1
3  4  1 2 1
5  9  1 2 3 2 1
7  16 1 2 3 4 3 2 1
9  25 1 2 3 4 5 4 3 2 1
11 36 1 2 3 4 5 6 5 4 3 2 1


2  2  1 1
4  6  1 2 2 1
6  12 1 2 3 3 2 1
8  20 1 2 3 4 4 3 2 1
10 30 1 2 3 4 5 5 4 3 2 1


1  1  1
2  2  1 1
3  4  1 2 1
4  6  1 2 2 1
5  9  1 2 3 2 1
6  12 1 2 3 3 2 1
7  16 1 2 3 4 3 2 1
8  20 1 2 3 4 4 3 2 1
9  25 1 2 3 4 5 4 3 2 1
10 30 1 2 3 4 5 5 4 3 2 1
11 36 1 2 3 4 5 6 5 4 3 2 1
*/