package N2562;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0, cnt = 0, max = 0;
		
		while(++n < 10) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > max) {
				max = num;
				cnt = n;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
		
		br.close();
	}
}