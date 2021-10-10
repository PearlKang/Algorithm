package N1406;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		String input = st.nextToken();
		int N = input.length();
		
		Stack<Character> lStack = new Stack<Character>();
		Stack<Character> rStack = new Stack<Character>();
		
		for(int i = 0; i < N; i++)
			lStack.push(input.charAt(i));

		if(N <= 100000) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			if(M >= 1 && M <= 500000) {
				for(int m = 0; m < M; m++) {
					st = new StringTokenizer(br.readLine());
					
					switch(st.nextToken()) {
					case "L":
						if(lStack.size() != 0)
							rStack.push(lStack.pop());
						break;
					case "D":
						if(rStack.size() != 0)
							lStack.push(rStack.pop());
						break;
					case "B":
						if(lStack.size() != 0)
							lStack.pop();
						break;
					case "P":
						lStack.push(st.nextToken().charAt(0));
						break;
					}
				}
				while(!lStack.isEmpty()) {
					rStack.push(lStack.pop());
				}
				while(!rStack.isEmpty()) {
					bw.write(rStack.pop());
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}