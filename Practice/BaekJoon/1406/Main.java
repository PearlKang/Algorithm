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
		
		Deque<Character> lStack = new ArrayDeque<>();
		Deque<Character> rStack = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++)
			lStack.addLast(input.charAt(i));

		if(N <= 100000) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			if(M >= 1 && M <= 500000) {
				for(int m = 0; m < M; m++) {
					st = new StringTokenizer(br.readLine());
					
					switch(st.nextToken()) {
					case "L":
						if(!lStack.isEmpty())
							rStack.addFirst(lStack.removeLast());
						break;
					case "D":
						if(!rStack.isEmpty())
							lStack.addLast(rStack.removeFirst());
						break;
					case "B":
						if(!lStack.isEmpty())
							lStack.removeLast();
						break;
					case "P":
						lStack.addLast(st.nextToken().charAt(0));
						break;
					}
				}
				while(!lStack.isEmpty()) {
					bw.write(lStack.pop());
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