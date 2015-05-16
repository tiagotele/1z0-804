import java.util.*;

public class STtext{
	public static void main(String [] args){
		StringTokenizer st = new StringTokenizer("a bc d e");
		System.out.println("\n " + st.countTokens());
		while(st.hasMoreTokens()){
			System.out.print(">" + st.nextToken() + "< ");
		}
		System.out.println("\n " + st.countTokens());

		//Seconde argument "a" is this StringTokenizer's delimiter

		StringTokenizer st2 = new StringTokenizer("a b cab a ba d" , "a");
		System.out.println("\n " + st2.countTokens());
		while(st2.hasMoreTokens()){
			System.out.print(">" + st2.nextToken() + "< ");
		}
		System.out.println("\n " + st2.countTokens());
	}
}