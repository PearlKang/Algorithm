package N2869;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int count = (V-B)/(A-B);
		
		if((V-B)%(A-B) != 0)
			bw.write(String.valueOf(count+1));
		else
			bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}