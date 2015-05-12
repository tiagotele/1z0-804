import java.util.*;
class TestDates {
  	public static void main(String[] args) {
	    Date d1 = new Date(1_00_000_000_000L);      // a trillion, Java 7 style
	    System.out.println("1st date " + d1.toString());
	    d1.setTime(d1.getTime() + 3_600_000);
	    System.out.println("New time " + d1.toString());

	    Date now = new Date();
	    System.out.println("Now " + now.getTime());
	}
}