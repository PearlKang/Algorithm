package N4101;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine());

			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			
			if(input1 == 0 && input2 == 0)
				break;
			
			if((input1 > 0 && input1 <= 1000000) && (input2 > 0 && input2 <= 1000000)) {
				if(input1 > input2)
					bw.write("Yes\n");
				else
					bw.write("No\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}