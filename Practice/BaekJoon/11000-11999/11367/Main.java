package N11367;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			
			bw.write(name + " ");
			
			if(score >= 97 && score <= 100)
				bw.write("A+");
			else if(score >= 90 && score <= 96)
				bw.write("A");
			else if(score >= 87 && score <= 89)
				bw.write("B+");
			else if(score >= 80 && score <= 86)
				bw.write("B");
			else if(score >= 77 && score <= 79)
				bw.write("C+");
			else if(score >= 70 && score <= 76)
				bw.write("C");
			else if(score >= 67 && score <= 69)
				bw.write("D+");
			else if(score >= 60 && score <= 66)
				bw.write("D");
			else if(score >= 0 && score <= 59)
				bw.write("F");
			
			bw.write(System.lineSeparator());
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}