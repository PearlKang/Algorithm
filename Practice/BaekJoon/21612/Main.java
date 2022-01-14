package N21612;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		
		if(B >= 80 && B <= 200) {
			int output = 5 * B - 400;
			bw.write(String.valueOf(output));
			bw.write(System.lineSeparator());
			
			if(output > 100)
				bw.write("-1");
			else if(output < 100)
				bw.write("1");
			else
				bw.write("0");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}