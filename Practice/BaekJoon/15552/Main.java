package N15552;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); 
				
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		if(T >= 0 && T <= 1000000) {
			for(int n = 0; n < T; n++) {
				st = new StringTokenizer(br.readLine());
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				//bw.write(A + B + "\n");
				//sb.append(A + B + "\n");
				sb.append(A + B).append("\n");
			}
		}
		br.close();
		//bw.flush();
		//bw.close();
		System.out.println(sb);
	}
}