package hash_set_20_Jan;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// LinkedHashSet<Integer>lSet=new LinkedHashSet();
		// HashSet lSet=new HashSet();
		LinkedHashSet lSet = new LinkedHashSet();

		lSet.add(100);
		lSet.add(200);
		lSet.add(300);
		lSet.add(400);
		lSet.add(500);

		System.out.println(lSet);
	}
}