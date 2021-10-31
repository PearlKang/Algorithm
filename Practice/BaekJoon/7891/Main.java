package N7891;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
		}
		br.close();
	}
}