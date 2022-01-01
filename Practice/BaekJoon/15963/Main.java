package N15963;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		System.out.println(9999999999);
		
		if(N == M)
			bw.write(String.valueOf("1"));
		else
			bw.write(String.valueOf("0"));
		
		bw.flush();
		bw.close();
		br.close();
	}
}