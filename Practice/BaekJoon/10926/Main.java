package N10926;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		String input = st.nextToken();
		int length = input.length();
		
		if(length <= 50)
			bw.write(input + "??!");
		
		bw.flush();
		bw.close();
		br.close();
	}
}