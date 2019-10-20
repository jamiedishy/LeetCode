package easy;

public class CenturyFromYear {
	
	public static int centuryFromYear(int year) {
		int c = 0;
		
		if (year / 100 == 0) {
			c = 1;
		}
		else {
			c = year/100;
			if (year % 100 != 0) {
				c = c+1;
			}
		}
		return c;
	}
	
	public static void main (String[] args) {
		System.out.println(centuryFromYear(800));
	}

}
