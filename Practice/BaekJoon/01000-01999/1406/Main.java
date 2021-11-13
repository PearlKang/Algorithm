package N1406;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int N = input.length();
		
		Deque<Character> lStack = new ArrayDeque<>();
		Deque<Character> rStack = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++)
			lStack.addLast(input.charAt(i));
		
		int M = Integer.parseInt(br.readLine());
		
		for(int m = 0; m < M; m++) {
			String tmp = br.readLine();
			
			switch(tmp.charAt(0)) {
			case 'L':
				if(!lStack.isEmpty())
					rStack.addFirst(lStack.removeLast());
				break;
			case 'D':
				if(!rStack.isEmpty())
					lStack.addLast(rStack.removeFirst());
				break;
			case 'B':
				if(!lStack.isEmpty())
					lStack.removeLast();
				break;
			case 'P':
				lStack.addLast(tmp.charAt(2));
				break;
			}
		}
		while(!lStack.isEmpty()) {
			bw.write(lStack.pop());
		}
		while(!rStack.isEmpty()) {
			bw.write(rStack.pop());
		}
			
		br.close();
		bw.flush();
		bw.close();
	}
}