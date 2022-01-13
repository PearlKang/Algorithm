package N22938;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int X1 = Integer.parseInt(st.nextToken());
		int Y1 = Integer.parseInt(st.nextToken());
		int R1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int X2 = Integer.parseInt(st.nextToken());
		int Y2 = Integer.parseInt(st.nextToken());
		int R2 = Integer.parseInt(st.nextToken());
		
		if(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2) < Math.pow(R1 + R2, 2)) {
			bw.write("YES");
		}
		else {
			bw.write("NO");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}