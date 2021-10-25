package N2562;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0, cnt = 0, max = 0;
		
		while(++n < 10) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > max) {
				max = num;
				cnt = n;
			}
		}
		
		sb.append(max).append(System.lineSeparator()).append(cnt);
		System.out.println(sb);
		
		br.close();
	}
}