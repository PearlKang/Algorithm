package N9316;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int n = 0; n < N; n++)
			sb.append("Hello World, Judge ").append(n+1).append("!").append(System.lineSeparator());

		System.out.print(sb);
		br.close();		
	}
}