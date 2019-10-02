package Easy;

public class AddBinary {
	static String a = "11001";
	static String b = "111";
	static String co = "0"; // carry-over variable

	public static String addBinary(String x, String y) {
		String c = "";
		int yIndex = y.length() - 1;
		
		for (int i=x.length()-1; i>=0; i--) {
			int added = 0; // x[i] + y[yIndex]
			
			//System.out.println(x.charAt(i));
			//System.out.println(co);
			if (yIndex < 0) {
				if (x.charAt(i)=='1' && co.equals("1")) {
					c = "0" + c;
				//	System.out.println(c);
					co="1";
				}
				else if (x.charAt(i)=='0' && co.equals("1")) {
					c="1" + c;
					co="0";
				}
				else if (co.equals("0")){
					c=x.charAt(i) + c;
				//	co="0";
				}
			}
			else {
				added = Character.getNumericValue(x.charAt(i)) + Character.getNumericValue(y.charAt(yIndex));
				yIndex--;
			//	System.out.println(added);
			}
			if (added==2 && co.equals("1") ) {
				//added = 1;
				c = "1" + c;
				co = "1";
			//	yIndex--;
			}
			if (added==2 && co.equals("0")) {
				//added=0;
				c = "0" + c;
				co = "1";
			//	yIndex--;
			}
			if (added==1 && co.equals("1")) {
				c="0"+c;
				co="1";
			//	yIndex--;
			}
			if (added==1 && co.equals("0")) {
				c="1" + c;
				co="0";
				//yIndex--;
			}
			else if (added == 0 && co.contentEquals("0")){
					c="0"+c;
					co="0";
					//System.out.println(c);
			}
		}
		if (co.equals("1")) {
			c="1" + c;
		}
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		addBinary(a, b);

	}

}
