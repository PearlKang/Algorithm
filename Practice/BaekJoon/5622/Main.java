package N5622;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		int length = input.length();
		int cnt = 0;
		
		if(length >= 2 && length <= 15) {
			for(int i  = 0; i < length; i++) {
				char tmp = input.charAt(i);
				cnt += (tmp - 'A') / 3 + 3;
				if(tmp == 'Z')
					cnt--;
			}
			bw.write(String.valueOf(cnt));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}