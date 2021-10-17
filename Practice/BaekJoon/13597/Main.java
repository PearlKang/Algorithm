package N13597;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		
		if((A >= 1 && A <= 13) && (B >= 1 && B <= 13)) {
			if(A == B)
				bw.write(String.valueOf(A));
			else if(A > B)
				bw.write(String.valueOf(A));
			else if(A < B)
				bw.write(String.valueOf(B));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}