package program2_5;

import java.util.Scanner;

/*
 * 3n + 1����
 * ���� (n <= 10^9),���ת���Ĵ���count
 */
public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n = input.nextInt();
		int count = 0;
		long nn = n; //�ڶ�ε�ת����,����ʹ3n + 1����int,��˴˴�ת����long������
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
