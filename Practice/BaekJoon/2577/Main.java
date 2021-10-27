package N2577;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		
		int ABC = A*B*C;
		
		if((A >= 100 && A < 1000) && (B >= 100 && B < 1000) && (C >= 100 && C < 1000)) {
			int[] num = new int[10];
			
			for(int i = 0; i < 10; i++)
				num[i] = 0;
			
			while(ABC != 0) {
				switch(ABC % 10) {
				case 0: num[0]++; break;
				case 1: num[1]++; break;
				case 2: num[2]++; break;
				case 3: num[3]++; break;
				case 4: num[4]++; break;
				case 5: num[5]++; break;
				case 6: num[6]++; break;
				case 7: num[7]++; break;
				case 8: num[8]++; break;
				case 9: num[9]++; break;
				}
				ABC = ABC / 10;
			}
			
			for(int i = 0; i < 10; i++) {
				bw.write(String.valueOf(num[i]));
				bw.write(System.lineSeparator());			
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}