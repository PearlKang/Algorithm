package N1193;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		
		if(X >= 1 && X <= 10000000)
			bw.write(output(X));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static String output(int input) {
		if(input == 1)
			return "1/1";

		int output = sequence(input);
		int numerator = 1;
		int denominator = output+1;
		
		for(int i = 1; i < input - sum(output); i++) {
			numerator++;
			denominator--;
		}

		if(output % 2 == 1)
			return numerator + "/" + denominator;	
		else
			return denominator + "/" + numerator;
	}
	
	public static int sequence(int input) {
		for(int i = 1;; i++)
			if(input > sum(i) && input <= sum(i+1))
				return i;
	}

	public static int sum(int input) {
		return input*(input+1)/2;
	}
}