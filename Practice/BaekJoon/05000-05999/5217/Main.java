package N5217;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		if(T < 100) {
			for(int t = 0; t < T; t++) {
				int n = Integer.parseInt(br.readLine());
				
				if(n >= 1 && n <= 12) {
					sb.append("Pairs for ").append(String.valueOf(n)).append(": ");
					
					for(int m = 1; m <= n/2; m++) {
						if(m != n-m) {
							sb.append(String.valueOf(m)).append(" ").append(String.valueOf(n-m));

							if((m != n-m-1) && (m != n-m-2))
								sb.append(", ");
						}
					}
					
					sb.append(System.lineSeparator());
				}
			}
		}
		
		br.close();
		System.out.println(sb);
	}
}