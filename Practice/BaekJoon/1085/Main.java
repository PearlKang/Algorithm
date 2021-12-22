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
		
		if((w >= 1 && w <= 1000) && (h >= 1 && h <= 1000) && (x >= 1 && x <= w-1) && (y >= 1 && y <= h-1)) {
			if(x <= w-x && x <= y && x <= h-y)
				bw.write(String.valueOf(x));
			else if(w-x <= x && w-x <= y && w-x <= h-y)
				bw.write(String.valueOf(w-x));
			else if(y <= x && y <= w-x && y <= h-y)
				bw.write(String.valueOf(y));
			else if(h-y <= x && h-y <= w-x && h-y <= y)
				bw.write(String.valueOf(h-y));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}