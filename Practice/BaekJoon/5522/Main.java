package N5522;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int output = 0;
		
		for(int i = 0; i < 5; i++)
			output += Integer.parseInt(br.readLine());
		
		System.out.println(output);

		br.close();
	}
}