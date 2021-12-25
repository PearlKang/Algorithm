package N3053;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int input = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(input*input*Math.PI));
		bw.write(System.lineSeparator());
		bw.write(String.valueOf(2*input*input));
		
		bw.flush();
		bw.close();
		br.close();
	}
}