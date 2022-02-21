import java.util.HashMap;
import java.util.Set;

public class Students {

	// creating hashmap
	public HashMap<String, String> getStudent(HashMap<String, Integer> s) {
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = s.keySet();
		// set the values using if elseif statement
		for (String se : set) {
			Integer marks = s.get(se);
			if (marks >= 90) {
				medal.put(se, "Gold");
			} else if (marks >= 80) {
				medal.put(se, "Silver");
			} else if (marks >= 70) {
				medal.put(se, "Bronze");
			}

		}
		return medal;

	}

	public static void main(String[] args) {
		HashMap<String, Integer> s = new HashMap<>();
		Students std = new Students();
		s.put("111", 50);
		s.put("222", 80);
		s.put("333", 95);
		s.put("444", 70);
		s.put("444", 88);
		s.put("444", 55);
		System.out.println(std.getStudent(s));
	}

}