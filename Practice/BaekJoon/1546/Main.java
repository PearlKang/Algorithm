package N1546;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] score = br.readLine().split(" ");
		
		double M = 0, sum = 0;
		
		for(int n = 0; n < N; n++)
			if(M < Double.parseDouble(score[n]))
				M = Double.parseDouble(score[n]);

		for(int n = 0; n < N; n++)
			sum += Double.parseDouble(score[n]) * 100 / M;

		System.out.println(sum/N);
		
		br.close();
	}
}