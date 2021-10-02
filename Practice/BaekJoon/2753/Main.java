package N2753;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int year = Integer.parseInt(st.nextToken());
		boolean moon = false;
		
		if(year >= 1 && year <= 4000) {
			if(year % 4 == 0)
				moon = true;
			if(year % 100 == 0)
				moon = false;
			if(year % 400 == 0)
				moon = true;
			
			if(moon)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}