package N17009;

import java.io.*;
import java.util.*;

public class Main {
	public static int[] dp = new int[1000001];
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int length = 6;
		int[] input = new int[length];
		
		for(int i = 0; i < length; i++) {
			st = new StringTokenizer(br.readLine());
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		int apple = Score(input[0], input[1], input[2]);
		int banana = Score(input[3], input[4], input[5]);
		
		if(apple > banana)
			bw.write("A");
		else if(apple < banana)
			bw.write("B");
		else
			bw.write("T");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int Score(int input1, int input2, int input3) {
		return 3*input1 + 2*input2 + 1*input3;
	}
}