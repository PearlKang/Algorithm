package N2869;

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
		int V = Integer.parseInt(st.nextToken());
		int location = 0;
		
		for(int count = 1;; count++) {
			location += A;
			
			if(location >= V) {
				bw.write(String.valueOf(count));
				break;
			}
			
			location -= B;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}