package thirteentwoo;

import java.util.*;


public class taskuno {
	    
	public static void main(String[] args) {
	        
	        new LinkList().start();
	        new VectorList().start();
	        new StackList().start();
	        new ArrayListClass().start();
	    }
	}

	class LinkList extends Thread {
	    public void run() {
	        List<Integer> list1 = new LinkedList<>();
	        list1.add(35);
	        list1.add(23);
	        System.out.println("The given list is: " + list1);
	        System.out.println("The number of elements in the list: " + list1.size());
	    }
	}

	class VectorList extends Thread {
	    public void run() {
	        List<Integer> list1 = new Vector<>();
	        list1.add(67);
	        list1.add(82);
	        System.out.println("The given list is: " + list1);
	        System.out.println("The number of elements in the list: " + list1.size());
	    }
	}

	class ArrayListClass extends Thread {
	    public void run() {
	        List<Integer> list1 = new ArrayList<>();
	        list1.add(56);
	        list1.add(49);
	        System.out.println("The given list is: " + list1);
	        System.out.println("The number of elements in the list: " + list1.size());
	    }
	}

	class StackList extends Thread {
	    public void run() {
	        List<Integer> list1 = new Stack<>();
	        list1.add(49);
	        list1.add(49);
	        System.out.println("The given list is: " + list1);
	        System.out.println("The number of elements in the list: " + list1.size());
	    }
	}

