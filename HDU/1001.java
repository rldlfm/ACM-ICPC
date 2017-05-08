import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n,result;
		while ( scanner.hasNextInt() ) {
			n = scanner.nextLong();
			result = ( 1L + n ) * n / 2;
			System.out.println(result);
			System.out.println();
		}
		scanner.close();
	}
}
