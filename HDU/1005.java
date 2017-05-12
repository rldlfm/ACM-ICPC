import java.util.Arrays;
import java.util.Scanner;

class Main {
	static {
		System.out.println();
	}

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int a,b,n;
		int[] allResult = new int[55];
		while ( true ) {
			a = input.nextInt();
			b = input.nextInt();
			n = input.nextInt();
			if ( a ==  0 && b == 0 && n == 0)
				break;
			allResult[1] = allResult[2] = 1;
			for (int i = 3; i < 55; ++i) {
				allResult[i] = ( a * allResult[i-1] + b * allResult[i-2] ) % 7;
			}
			int loopCount = 0;
			for (int i = 4; i < 55; ++i) {
				if ( allResult[i] == allResult[3] && allResult[i + 1] == allResult[4]) {
					loopCount = i - 3;
					break;
				}
			}
			if ( n < 3 )
				System.out.println("1");
			else {
				n = ( n - 2) % loopCount;
				if ( n == 0)
					n = loopCount; //当整除时,应为循环节的最后一个位置
				System.out.println(allResult[n + 2]);
			}
			
		}
	}

}
