package N10093;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(A > B) {
			long tmp = A;
			A = B;
			B = tmp;
		}
		
		if(A == B) {
			bw.write(String.valueOf(0));
		}
		else {
			long between = B-A-1;
			
			bw.write(String.valueOf(between));
			bw.write(System.lineSeparator());
			
			for(int i = 0; i < between; i++) {
				bw.write(String.valueOf(A+1+i));
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}