package N2752;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] input = new int[3];

		String[] temp = br.readLine().split(" ");
		
		for(int i = 0; i < 3; i++)
			input[i] = Integer.parseInt(temp[i]);
		
		Arrays.sort(input);
		
		for(int i : input)
			sb.append(i).append(" ");
		
		System.out.println(sb);
		
		br.close();
	}
}