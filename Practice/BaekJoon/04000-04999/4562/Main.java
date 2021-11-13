package N4562;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int n = 0; n < N; n++) {
			String[] input = br.readLine().split(" ");
			int X = Integer.parseInt(input[0]);
			int Y = Integer.parseInt(input[1]);
			
			if(X < Y)
				bw.write("NO BRAINS\n");
			else
				bw.write("MMM BRAINS\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}