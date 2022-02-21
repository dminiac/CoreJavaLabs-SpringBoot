import java.util.HashMap;
import java.util.Iterator;

public class getSquares {

	public static HashMap method(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // creating hash map

		for (int num : array) {
			map.put(num, num * num);
		}
		return map;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5 };
		HashMap<Integer, Integer> map = method(array);

		Iterator<Integer> it = map.keySet().iterator(); // keySet() returns a Set and Sets have unique value. this is
														// possible since map keys must also be unique
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

}