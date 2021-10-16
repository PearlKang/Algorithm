package N2752;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] input = new int[3];

		String[] temp = br.readLine().split(" ");
		
		for(int i = 0; i < 3; i++)
			input[i] = Integer.parseInt(temp[i]);
		
		Arrays.sort(input);
		
		for(int i = 0; i < 3; i++)
			bw.write(input[i] + " ");
		
		br.close();
		bw.flush();
		bw.close();
	}
}