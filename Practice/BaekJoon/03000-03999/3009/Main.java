package N3009;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		int[] x = new int[3];
		int[] y = new int[3];
				
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		if(x[0] == x[1])
			bw.write(String.valueOf(x[2]));
		else if(x[0] == x[2])
			bw.write(String.valueOf(x[1]));
		else if(x[1] == x[2])
			bw.write(String.valueOf(x[0]));
		
		bw.write(" ");
		
		if(y[0] == y[1])
			bw.write(String.valueOf(y[2]));
		else if(y[0] == y[2])
			bw.write(String.valueOf(y[1]));
		else if(y[1] == y[2])
			bw.write(String.valueOf(y[0]));
		
		bw.flush();
		bw.close();
		br.close();
	}
}