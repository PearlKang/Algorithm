package N10170;

class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("NFC West       W   L  T").append(System.lineSeparator());
		sb.append("-----------------------").append(System.lineSeparator());
		sb.append("Seattle        13  3  0").append(System.lineSeparator());
		sb.append("San Francisco  12  4  0").append(System.lineSeparator());
		sb.append("Arizona        10  6  0").append(System.lineSeparator());
		sb.append("St. Louis      7   9  0").append(System.lineSeparator());
		sb.append(System.lineSeparator());
		sb.append("NFC North      W   L  T").append(System.lineSeparator());
		sb.append("-----------------------").append(System.lineSeparator());
		sb.append("Green Bay      8   7  1").append(System.lineSeparator());
		sb.append("Chicago        8   8  0").append(System.lineSeparator());
		sb.append("Detroit        7   9  0").append(System.lineSeparator());
		sb.append("Minnesota      5  10  1").append(System.lineSeparator());
		
		System.out.print(sb);
	}
}