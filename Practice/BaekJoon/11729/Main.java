package N11729;

import java.io.*;
import java.util.*;

public class Main {
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 20) {
			bw.write(String.valueOf((int)Math.pow(2, N) - 1));
			bw.write(System.lineSeparator());
			
			Hanoi(N, 1, 2, 3);
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void Hanoi(int input, int from, int tmp, int to) throws Exception {
		if(input == 1) {
			bw.write(from + " " + to);
			bw.write(System.lineSeparator());
		}
		else {
			Hanoi(input-1, from, to, tmp);
			bw.write(from + " " + to);
			bw.write(System.lineSeparator());
			Hanoi(input-1, tmp, from, to);
		}
	}
}