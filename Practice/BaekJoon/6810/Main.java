package N6810;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		String number = "9780921418";
		int[] num = new int[3];
		int sum = 0;
		int digit = 1;
		
		for(int i = 0; i < number.length(); i++) {
			sum += Character.getNumericValue(number.charAt(i)) * digit;
			digit = (digit == 1) ? 3 : 1;
		}
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			num[i] = Integer.parseInt(st.nextToken());
			sum += num[i] * digit;
			digit = (digit == 1) ? 3 : 1;
		}
		
		bw.write("The 1-3-sum is " + sum);
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}