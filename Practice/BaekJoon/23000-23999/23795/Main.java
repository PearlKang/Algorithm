package N23795;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		int sum = 0;
		int cnt = 0;
		
		while(cnt < 2000) {
			st = new StringTokenizer(br.readLine());
			int input = Integer.parseInt(st.nextToken());
			
			if(input == -1) {
				bw.write(String.valueOf(sum));
				break;
			}
			else {
				sum += input;
				if(sum > 2147483647)
					break;
				cnt++;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}