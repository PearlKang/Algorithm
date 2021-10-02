package N14681;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		
		if((x >= -1000 && x <= 1000 && x != 0) && (y >= -1000 && y <= 1000 && y != 0)) {
			if(x > 0 && y > 0)
				System.out.println(1);
			else if(x < 0 && y > 0)
				System.out.println(2);
			else if(x < 0 && y < 0)
				System.out.println(3);
			else if(x > 0 && y < 0)
				System.out.println(4);
		}
	}
}