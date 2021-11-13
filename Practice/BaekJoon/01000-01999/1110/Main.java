package N1110;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int output = N;
		int cnt = 0;
		
		if(N >= 0 && N <= 99) {
			while((N != output) || cnt == 0) {
				output = (output % 10) * 10 + ((output / 10) + (output % 10)) % 10;
				cnt++;
			}
			bw.write(cnt + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}