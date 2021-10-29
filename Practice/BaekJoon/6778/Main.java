package N6778;

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int antenna = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int eyes = Integer.parseInt(st.nextToken());
		
		if(antenna >= 3 && eyes <= 4) {
			bw.write("TroyMartian");
			bw.write(System.lineSeparator());
		}
		
		if(antenna <= 6 && eyes >= 2) {
			bw.write("VladSaturnian");
			bw.write(System.lineSeparator());
		}
		
		if(antenna <= 2 && eyes <= 3)
			bw.write("GraemeMercurian");
		
		br.close();
		bw.flush();
		bw.close();
	}
}