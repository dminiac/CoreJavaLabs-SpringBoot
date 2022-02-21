
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondSmallestInArray {

	public static int getSecondSmallest(Integer[] a, int total) {

		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(1);
		return element;
	}

	public static void main(String[] args) {
		Integer a[] = { 51, 12, 10, 1, 91, 20, 25 };
		Integer b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Smallest Number is " + getSecondSmallest(a, 7)); 
		System.out.println("Second Smallest Number is " + getSecondSmallest(b, 7));
	}

}