package N2941;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < 8; i++)
			input = input.replace(array[i], " ");

		bw.write(String.valueOf(input.length()));
		
		bw.flush();
		bw.close();
		br.close();
	}
}