package N2752;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] input = new int[3];
		int tmp = 0;

		String[] temp = br.readLine().split("\s");
		
		for(int i = 0; i < 3; i++)
			input[i] = Integer.parseInt(temp[i]);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 3; j++) {
				if(input[i] > input[j]) {
					tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < 3; i++)
			sb.append(input[i] + " ");
		
		System.out.println(sb);
		
		br.close();
	}
}