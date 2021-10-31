package N7891;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			sb.append(Integer.parseInt(input[0]) + Integer.parseInt(input[1])).append(System.lineSeparator());
		}
		
		System.out.println(sb);
		br.close();
	}
}