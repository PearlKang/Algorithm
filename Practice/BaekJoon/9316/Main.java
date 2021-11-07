package N9316;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int n = 0; n < N; n++)
			sb.append("Hello World, Judge ").append(n+1).append("!").append(System.lineSeparator());

		System.out.print(sb);
		br.close();		
	}
}