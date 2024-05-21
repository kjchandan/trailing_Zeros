package trailing_zeros;

import java.util.*;
public class Trailing_zeros {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();//128
		
		
		System.out.println(Math.log((n)^(n&n-1))/Math.log(2));
		//7 trailing zeros(coninous zeros.)
	}
}
