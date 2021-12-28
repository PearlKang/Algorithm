package N2908;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		A = reverseNumber(A);
		B = reverseNumber(B);
		
		if(A > B)
			bw.write(String.valueOf(A));
		else
			bw.write(String.valueOf(B));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int reverseNumber(int input) {
		return (input%10)*100 + (input/10%10)*10 + input/100;
	}
}