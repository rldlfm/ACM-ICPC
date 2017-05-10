import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		String aString,bString;
		BigInteger aBigInteger,bBigInteger;
		int t = scanner.nextInt();
		for (int i = 1; i <= t; ++i) {
			aString = scanner.next();
			bString = scanner.next();
			aBigInteger = new BigInteger(aString);
			bBigInteger = new BigInteger(bString);
			System.out.println("Case " + i  + ":");
			System.out.print(aString + " + " + bString + " = ");
			System.out.println(aBigInteger.add(bBigInteger));
			if ( i != t) {
				System.out.println();
			}
		}
		
		scanner.close();
	}
}
//HDU 1002
//result:Accept
