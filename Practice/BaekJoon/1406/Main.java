package N1406;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		String input = st.nextToken();
		int N = input.length();

		if(N <= 100000) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			if(M >= 1 && M <= 500000) {
				String tmp = input + "*";

				for(int m = 0; m < M; m++) {
					int cursor = tmp.indexOf("*");

					st = new StringTokenizer(br.readLine());

					switch(st.nextToken()) {
					case "L":
						if(cursor != 0)
							tmp = input.substring(0, cursor-1) + "*" + input.substring(cursor-1);
						break;
					case "D":
						if(cursor != input.length())
							tmp = input.substring(0, cursor+1) + "*" + input.substring(cursor+1);
						break;
					case "B":
						if(cursor != 0) {
							tmp = input.substring(0, cursor-1) + "*" + input.substring(cursor);
							input = tmp.replace("*", "");
						}
						break;
					case "P":
						tmp = input.substring(0, cursor) + st.nextToken() + "*" + input.substring(cursor);
						input = tmp.replace("*", "");
						break;
					}
				}
				bw.write(input + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
