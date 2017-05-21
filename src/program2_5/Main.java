package program2_5;

import java.util.Scanner;

/*
 * 3n + 1问题
 * 输入 (n <= 10^9),输出转换的次数count
 */
public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n = input.nextInt();
		int count = 0;
		long nn = n; //在多次的转换中,足以使3n + 1爆出int,因此此处转换成long来计算
		while ( nn != 1) {
			if ( nn % 2 == 0) {
				nn /= 2;
			} else {
				nn = 3 * nn + 1;
			}
			count++;
		}
		System.out.println(count);
		
	}

}
