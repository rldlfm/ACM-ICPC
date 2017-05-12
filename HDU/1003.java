import java.util.Scanner;

class Main {
//	static {	System.out.println(); }

	public static void main(String[] args) {

		int x, y;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; ++i) {
			x = y = 0;
			int n = sc.nextInt();
			int sum = 0, start = 1, end = 1,max = -9999;
			while ( n-- != 0) {
				int tmp = sc.nextInt();
				sum += tmp;
				if ( sum > max ) {
					max = sum;
					x = start;
					y = end;
				}
				
				if ( sum >= 0) {
					end++;
				} else {
					sum = 0;
					end++;
					start = end;
				}
			}
				
			
			System.out.println("Case " + i + ":");
			System.out.println(max + " " + x + " " + y);
			if ( i != t )
				System.out.println();
		}

	}
}