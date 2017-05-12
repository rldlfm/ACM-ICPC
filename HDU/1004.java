import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
	static {
		System.out.println();
	}

	public static void main(String[] args) {
		int t;
		Scanner input = new Scanner(System.in);
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		String str = "";
		while (input.hasNext()) {
			t = input.nextInt();
			if ( t == 0)
				break;
			while (t-- != 0) {
				str = input.next();
				if (tm.containsKey(str)) {
					tm.put(str, tm.get(str) + 1);
				} else {
					tm.put(str, 1);
				}
			}
			Iterator <Entry< String, Integer> >	it = 	tm.entrySet().iterator();
			int max = -1;
			while ( it.hasNext()) {
				Entry<String, Integer> en = it.next();
				int v = en.getValue();
				if (  v > max) {
					max = v;
					str = en.getKey();
				}
			}
			System.err.println(str);
			tm.clear();
		}

		input.close();
	}

}
