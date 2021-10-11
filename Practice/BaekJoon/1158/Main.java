package N1158;

import java.io.*;
import java.util.*;
//Josephus
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		if((K >= 1 && K <= 5000) && (N >= 1 && N <= 5000) && (K <= N)) {
			for(int n = 0; n < N; n++)
				queue.add(n+1);
			
			for(int k = 0; k < K - 1; k++)
				queue.add(queue.remove());
			
			bw.write("<" + queue.remove());
			
			while(!queue.isEmpty()) {
				for(int k = 0; k < K - 1; k++)
					queue.add(queue.remove());
				
				bw.write(", " + queue.remove());
			}
			
			bw.write(">");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}