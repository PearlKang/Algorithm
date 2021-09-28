package N1966;

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if((N < 1 || N > 100) || (M < 0 || M >= N))
				break;

			
			st = new StringTokenizer(br.readLine());

			if(N == 1) {
				System.out.println(1);
				continue;
			}
			else {
				LinkedList<int[]> queue = new LinkedList<>();

				for(int n = 0; n < N; n++) {
					queue.offer(new int[] {n, Integer.parseInt(st.nextToken())});
				}
				
				int count = 0;
				
				
				while(!queue.isEmpty()) {
					for(int n = 0; n < N-1-count; n++) {
						int[] front = queue.peek();

						if(queue.get(0)[1] < queue.get(n+1)[1]) {
							queue.offer(front);
							queue.poll();
							n = -1;
						}
					}
					count++;
					if(queue.get(0)[0] == M)
						break;
					queue.poll();
				}
				
				System.out.println(count);
			}
		}
	}
}
/*
1
4 2
4 3 2 1
*/