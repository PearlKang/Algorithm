package N6749;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Y = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine());
		
		System.out.println(Y + (W - Y) * 2);
		br.close();
	}
}