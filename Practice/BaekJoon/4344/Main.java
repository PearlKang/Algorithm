package N4344;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(br.readLine());
		
		for(int c = 0; c < C; c++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int sum = 0;
			double cnt = 0;
			
			if(N < 1 || N > 1000)
				continue;
			
			for(int n = 1; n <= N; n++)
				sum += Integer.parseInt(input[n]);
			
			double avg = sum / N;
			
			for(int n = 1; n <= N; n++)
				if(Integer.parseInt(input[n]) > avg)
					cnt++;
			
			bw.write(String.format("%.3f", cnt*100/N) + "%");
			bw.write(System.lineSeparator());
		}
		br.close();
		bw.flush();
		bw.close();
	}
}