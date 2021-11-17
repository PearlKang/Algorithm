package N10817;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		Arrays.sort(input);
		
		bw.write(input[1]);
		
		bw.flush();
		bw.close();
		br.close();
	}
}