package program2_5;

import java.util.Scanner;

/* P24 3n + 1 
 * 给出n ( n <= 10^9),求出转换的次数count
 * sample input:
 * 987654321
 * sample output:
 * 180
 * 
 */
public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = input.nextInt();
		long t = n; // 多次3n + 1转换,可使n溢出int, 故先提升为long
		int count = 0;
		while (t != 1) {
			if (t % 2 == 0) {
				t /= 2;
			} else {
				t = t * 3 + 1;
			}
			count++;
		}
		System.out.println(count);
	}

}
