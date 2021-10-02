package N2884;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
			M -= 45;
			if(M < 0) {
				M += 60;
				H--;
				if(H < 0)
					H = 23;
			}
			System.out.println(H + " " + M);
		}
		
		br.close();
	}
}