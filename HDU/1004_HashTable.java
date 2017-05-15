import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static {
		System.out.println();
	}

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>(123989);
		while (true) {
			int n = input.nextInt();
			if (n == 0)
				break;
			String color;
			while (n-- != 0) {
				color = input.next();
				Integer i = ht.get(color);
				if ( i != null) {
					ht.put(color, i + 1);
				} else {
					ht.put(color, 0);
				}
			}
			Set<Entry<String, Integer>> s = ht.entrySet();
			Iterator<Entry<String, Integer>> iterator = s.iterator();
			int max = -1;
			String anString = null;
			while (iterator.hasNext()) {
				Entry<String, Integer> e = iterator.next();
				if (e.getValue() > max) {
					max = e.getValue();
					anString = e.getKey();
				}
			}
			System.out.println(anString);
			ht.clear();
		}
	}
}