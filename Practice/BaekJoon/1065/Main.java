package N1065;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		if(N > 0 && N <= 1000)
			bw.write(String.valueOf(arithmeticSequence(N)));
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int arithmeticSequence(int input) {
		int output = 99;
		
		if(input < 100)
			return input;
		
		if(input == 1000)
			input = 999;
		
		for(int i = 100; i <= input; i++) {
			int hundredsPlace = i/100;
			int tensPlace = i/10%10;
			int onesPlace = i%10;
			
			if((hundredsPlace + onesPlace) == tensPlace * 2)
				output++;
		}
		return output;
	}
}