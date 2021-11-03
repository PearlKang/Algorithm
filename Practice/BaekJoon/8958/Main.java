package N8958;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int n = 0; n < N; n++) {
			String input = br.readLine();
			int length = input.length();
			int continuous = 0, score = 0;
			
			if(length > 0 && length < 80) {
				for(int i = 0; i < length; i++) {
					if(input.charAt(i) == 'O')
						score += ++continuous;
					else
						continuous = 0;
				}
			}
			System.out.println(score);
		}
		br.close();
	}
}