package assignment_programs;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
	int[] a= {1,4,1,3,7,3,4};
	Set<Integer> s=new LinkedHashSet<Integer>();
	for (int i=0; i<a.length;i++) {
		s.add(a[i]);
		}
	Iterator<Integer> i=s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next() + " ");
	}
	}

}
