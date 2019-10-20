package easy;

public class CenturyFromYear {
	
	public static int centuryFromYear(int year) {
	    int c = 0;
	    int r = 0;
	    
	    if (year < 100) {
	        c = 1;
	    }
	    
	    else {
	        while (year>0) {
	            if (year/1000 != 0) {
	                if (year%100 == 0) {
	                    c = year/100;
	                }
	                else if (year%100 != 0) {
	                    r++;
	                    c = year/100;
	                }
	                year = year/10000;
	            }
	            else if (year%10 != 0 && year/10 != 0) {
	                r++;
	                c=year;
	                year=year/10;
	            }
	            else if (year%10 == 0 || year%10 != 0) {
	                c=year;
	                year=year/10;
	            }
	        }
	        if (r>0) {
	            c = c+1;
	        }
	    }
	    return c;
	}
	
	public static void main (String[] args) {
		System.out.println(centuryFromYear(2098));
	}

}
