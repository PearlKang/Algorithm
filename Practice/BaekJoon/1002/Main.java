package N1002;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			if((x1 >= -10000 && x1 <= 10000) && (x2 >= -10000 && x2 <= 10000) && (y1 >= -10000 && y1 <= 10000) && (y2 >= -10000 && y2 <= 10000) && (r1 > 0 && r1 <= 10000) && (r2 > 0 && r2 <= 10000)) {
				int output = 0;
				double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
				
				if(x1 == x2 && y1 == y2 && r1 == r2)
					output = -1;
				else if(distance == r1 + r2 || r1 == distance + r2 || r2 == r1 + distance)
					output = 1;
				else if(distance < r1 + r2 && r1 < distance + r2 && r2 < r1 + distance)
					output = 2;
				else
					output = 0;
				
				bw.write(String.valueOf(output));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}