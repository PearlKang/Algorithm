package N2447;

import java.io.*;
import java.util.*;

public class Main {
	public static char[][] array;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		array = new char[N][N];
		
		if(N >= Math.pow(3, 1) && N <= Math.pow(3, 8) && ((N % Math.pow(3, 1) == 0) || (N % Math.pow(3, 2) == 0) || (N % Math.pow(3, 3) == 0) || (N % Math.pow(3, 4) == 0) || (N % Math.pow(3, 5) == 0) || (N % Math.pow(3, 6) == 0) || (N % Math.pow(3, 7) == 0) || (N % Math.pow(3, 8) == 0))) {
			makeStar(0, 0, N);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++)
					bw.write(array[i][j]);
				bw.write(System.lineSeparator());
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void makeStar(int x, int y, int n) {
		if(n == 1)
			array[x][y] = '*';
		else {
			n /= 3;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(i == 1 && j == 1)
						continue;
					else
						makeStar(x + i*n, y + j*n, n);
				}
			}
		}
	}
}