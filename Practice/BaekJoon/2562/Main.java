package N2562;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] input = new int[9];
		
		for(int i = 0; i < 9; i++)
			input[i] = Integer.parseInt(br.readLine());

		int n = 0, cnt = 0, max = 0;
		
		for(int i = 0; i < 9; i++) {
			if(input[i] > max) {
				max = input[i];
				cnt = i+1;
			}
		}
		
		sb.append(max).append(System.lineSeparator()).append(cnt);
		System.out.println(sb);
		
		br.close();
	}
}