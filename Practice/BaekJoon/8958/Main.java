package N8958;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int n = 0; n < N; n++) {
			String input = br.readLine();
			int continuous = 0, score = 0;
			
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == 'O')
					score += ++continuous;
				else
					continuous = 0;
			}
			sb.append(score).append(System.lineSeparator());
		}
		System.out.println(sb);
		br.close();
	}
}