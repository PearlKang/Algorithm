package N6778;

import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int antenna = Integer.parseInt(br.readLine());
		int eyes = Integer.parseInt(br.readLine());
		
		if(antenna >= 3 && eyes <= 4) {
			sb.append("TroyMartian");
			sb.append(System.lineSeparator());
		}
		
		if(antenna <= 6 && eyes >= 2) {
			sb.append("VladSaturnian");
			sb.append(System.lineSeparator());
		}
		
		if(antenna <= 2 && eyes <= 3)
			sb.append("GraemeMercurian");
		
		System.out.print(sb);
		br.close();
	}
}