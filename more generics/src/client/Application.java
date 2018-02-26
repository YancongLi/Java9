package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	
	public static void main(String[] args) {
		Container<Integer, String> container = new Container<Integer, String>(666, "Wow");
		
		int val1 =  container.getItem1();
		String val2 = container.getItem2();
		
		System.out.println(val1);
		System.out.println(val2);
		
		System.out.println("---------------");
		
		Container<Integer, Integer> container2 = new Container<Integer, Integer>(2333, 996);
		System.out.println(container2.getItem1());
		System.out.println(container2.getItem2());
		
		System.out.println("--------------");
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(666);
		
		Set<Integer> setAfterUnion = union(set1, set2);
		Iterator<Integer> iterator = setAfterUnion.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		
		return result;
	}
	
	
}

