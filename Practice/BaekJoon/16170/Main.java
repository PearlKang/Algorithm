package N16170;

import java.text.SimpleDateFormat;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = null;
		Date date = null;
		
		sdf = new SimpleDateFormat("yyyy");
		date = new Date();
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("MM");
		date = new Date();
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("dd");
		date = new Date();
		System.out.println(sdf.format(date));
	}
}