import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class SortedOrder {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>(); 
		hmap.put(5, "Harsha"); 
		hmap.put(11, "Ram");
		hmap.put(4, "Bramhaji");
		hmap.put(77, "Chinni");
		hmap.put(9, "Ashish");
		hmap.put(66, "Bindi");
		hmap.put(0, "Sindu");

		System.out.println("Before Sorting:");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}
	}
}