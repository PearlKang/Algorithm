package N23037;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		if(n >= 10000 && n < 100000) {
			int sum = 0;
			
			while(n != 0) {
				int onesPlace = n%10;
				sum += multi(onesPlace);
				n /= 10;
			}
			bw.write(String.valueOf(sum));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int multi(int input) {
		return input*input*input*input*input;
	}
}