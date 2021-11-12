package N11654;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int input = st.nextToken().charAt(0);
		
		System.out.println(input);
		
		br.close();
	}
}