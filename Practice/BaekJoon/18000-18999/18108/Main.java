package N18108;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		
		if(y >= 1000 && y <= 3000)
			bw.write(String.valueOf(y-543));
		
		bw.flush();
		bw.close();
		br.close();
	}
}