package N1085;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		if((w >= 1 && w <= 1000) && (h >= 1 && h <= 1000) && (x >= 1 && x <= w-1) && (y >= 1 && y <= h-1))
			bw.write(String.valueOf(Math.min(Math.min(x, y), Math.min(w-x, h-y))));
		
		bw.flush();
		bw.close();
		br.close();
	}
}