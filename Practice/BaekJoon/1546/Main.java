package N1546;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] score = br.readLine().split(" ");
		
		double M = 0, sum = 0;
		
		for(int n = 0; n < N; n++)
			if(M < Integer.parseInt(score[n]))
				M = Integer.parseInt(score[n]);

		for(int n = 0; n < N; n++)
			sum += Integer.parseInt(score[n]) * 100 / M;

		System.out.println(sum/N);
		
		br.close();
	}
}