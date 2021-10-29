package N6749;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int Y = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine());
		
		sb.append(Y + (W - Y) * 2);
		System.out.println(sb);
		br.close();
	}
}