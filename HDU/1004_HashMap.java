import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Main {
	static {
		System.out.println();
	}

	public static void main(String[] args) {
		int t;
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String,Integer>(1230);
		String str = "";
		while (input.hasNext()) {
			t = input.nextInt();
			if ( t == 0)
				break;
			while (t-- != 0) {
				str = input.next();
				if (hm.containsKey(str)) {
					hm.put(str, hm.get(str) + 1);
				} else {
					hm.put(str, 1);
				}
			}
			Iterator <Entry< String, Integer> >	it = hm.entrySet().iterator();
			int max = -1;
			while ( it.hasNext()) {
				Entry<String, Integer> en = it.next();
				int v = en.getValue();
				if (  v > max) {
					max = v;
					str = en.getKey();
				}
			}
			System.out.println(str);
			hm.clear();
		}
		input.close();
	}

}
