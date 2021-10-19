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
			
			int n1 = 3 * n0;
			
			if(n1 % 2 == 0)
				sb.append(++cnt).append(". even ").append(n0 / 2).append("\n");
			else
				sb.append(++cnt).append(". odd ").append((n0 - 1) / 2).append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}
}