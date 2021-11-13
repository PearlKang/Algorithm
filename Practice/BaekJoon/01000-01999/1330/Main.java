package N1330;

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int maxNum = 10000;
		
		if(A >= - maxNum && A <= maxNum && B >= - maxNum && B <= maxNum) {
			if(A > B)
				System.out.println(">");
			else if(A < B)
				System.out.println("<");
			else
				System.out.println("==");
		}
	}
}