package N1152;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		sb.append(st.countTokens());
		
		System.out.print(sb);
		br.close();
	}
}