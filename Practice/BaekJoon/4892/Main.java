package N4892;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = 0;
		
		while(true) {
			int n0 = Integer.parseInt(br.readLine());
			
			if(n0 == 0)
				break;
			
			sb.append(++cnt).append((3 * n0) % 2 == 0 ? ". even " : ". odd ").append((3 * n0) % 2 == 0 ? n0 / 2 : (n0 - 1) / 2).append(System.lineSeparator());
		}
		
		br.close();
		System.out.println(sb);
	}
}