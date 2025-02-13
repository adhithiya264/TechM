package thirteentwoo;

import java.util.*;

public class taskset2 {

	public static void main(String[] args) {

		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(14);
		hashSet.add(21);
		hashSet.add(35);
		hashSet.add(49);
		hashSet.add(10);
		hashSet.add(7);
		hashSet.add(28);
		hashSet.add(100);

		hashSet.remove(100);

		System.out.println("HashSet (Integer) - Divisible by 7:");
		for (Integer num : hashSet) {
			if (num % 7 == 0) {
				System.out.println(num);
			}
		}

	
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("honda");
		linkedHashSet.add("suzuki");
		linkedHashSet.add("kawasaki");
		linkedHashSet.add("tvs");
		linkedHashSet.add("hyundai");
		linkedHashSet.add("ultraviolette");
		linkedHashSet.add("yamaha");
		linkedHashSet.add("ktm");


		linkedHashSet.remove("Papaya");

	
		System.out.println("\nLinkedHashSet (String) - Size more than 5:");
		for (String s : linkedHashSet) {
			if (s.length() > 5) {
				System.out.println(s);
			}
		}


		Set<Float> treeSet = new TreeSet<>();
		treeSet.add(31.14f);
		treeSet.add(1.618f);
		treeSet.add(22.718f);
		treeSet.add(5.67f);
		treeSet.add(18.5f);
		treeSet.add(25.8f);
		treeSet.add(100.0f);
		treeSet.add(50.3f);

		
		treeSet.remove(100.0f);

	
		System.out.println("\nTreeSet (Float) - Greater than 20:");
		for (Float f : treeSet) {
			if (f > 20) {
				System.out.println(f);
			}
		}
	
		System.out.println("\nFinal collections with minimum 4 elements:");
	
		if (hashSet.size() >= 4) {
			System.out.println("HashSet: " + hashSet);
		}

	
		if (linkedHashSet.size() >= 4) {
			System.out.println("LinkedHashSet: " + linkedHashSet);
		}
	
		if (treeSet.size() >= 4) {
			System.out.println("TreeSet: " + treeSet);
		}

	}

}
