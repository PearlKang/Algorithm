package N11319;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int S = Integer.parseInt(br.readLine());
		
		char[] vowel = {'A','E','I','O','U','a','e','i','o','u'};
		
		if(S >= 1 && S <= 100) {
			for(int s = 0; s < S; s++) {
				String input = br.readLine().replace(" ", "");
				
				int beforeLength = input.length();
				
				for(int i = 0; i < 10; i++)
					input = input.replace(String.valueOf(vowel[i]), "");
				
				int afterLength = input.length();
				
				bw.write(String.valueOf(afterLength) + " " + String.valueOf(beforeLength-afterLength));
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}