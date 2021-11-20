package N2941;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String s:array)
			input = input.replace(s, " ");

		System.out.print(input.length());
		br.close();
	}
}