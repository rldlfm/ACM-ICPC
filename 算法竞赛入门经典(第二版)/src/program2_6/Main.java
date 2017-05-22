package program2_6;

/*P24 近似计算
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
		double result = 0.0;
		double x;
		int t = 1, flag = 1;
		while (true) {
			x = 1.0 / t;
			if (flag == 1) {
				result += x;
				flag = 0;
			} else if (flag == 0) {
				result -= x;
				flag = 1;
			}
			if (x < 1e-6)// or x < 0.000001
				break;
			t += 2;
		}
		System.out.println(result);
	}

}
