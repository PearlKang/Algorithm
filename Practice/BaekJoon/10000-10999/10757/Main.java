package N10757;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		String A = reverse(st.nextToken());
		String B = reverse(st.nextToken());
		String output = "";
		int tmp = 0;
		
		while(true) {
			if(A.length() == 0 && B.length() == 0) {
				if(tmp == 1)
					output += String.valueOf(1);
				break;
			}
			else if(A.length() == 0)
				tmp += Character.getNumericValue(B.charAt(0));
			else if(B.length() == 0)
				tmp += Character.getNumericValue(A.charAt(0));
			else
				tmp += Character.getNumericValue(A.charAt(0)) + Character.getNumericValue(B.charAt(0));
			
			if(tmp >= 10) {
				output += String.valueOf(tmp%10);
				tmp = 1;
			}
			else {
				output += String.valueOf(tmp);
				tmp = 0;
			}
			
			if(A.length() == 0)
				B = B.substring(1);
			else if(B.length() == 0)
				A = A.substring(1);
			else {
				A = A.substring(1);
				B = B.substring(1);
			}
		}
		bw.write(reverse(output));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static String reverse(String input) {
		char[] output = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++)
			output[i] = input.charAt(input.length() - i - 1);
		
		return String.valueOf(output);
	}
}