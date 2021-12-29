package N17388;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		if((S >= 0 && S <= 100) && (K >= 0 && K <= 100) && (H >= 0 && H <= 100)) {
			if(S+K+H >= 100)
				bw.write("OK");
			else {
				if(S < K && S < H)
					bw.write("Soongsil");
				else if(K < H && K < S)
					bw.write("Korea");
				else if(H < K && H < S)
					bw.write("Hanyang");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}