package N10699;

import java.text.SimpleDateFormat;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		System.out.println(sdf.format(date));
	}
}