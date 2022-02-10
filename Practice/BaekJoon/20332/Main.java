package N20332;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		if(n < 1 || n > 10000) {
			return;
		}
		
		int[] w = new int[n];
		int sum = 0;

		st = new StringTokenizer(br.readLine());
		
		for(int i = 0;i < n; i++) {
			sum += w[i] = Integer.parseInt(st.nextToken());

			if(w[i] < 1 || w[i] > 100000) {
				break;
			}
		}
		
		if(sum % 3 == 0) {
			bw.write("yes");
		}
		else {
			bw.write("no");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}