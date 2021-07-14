package ds;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> Ll = new LinkedList<>();
		Ll.add("Octane");
		Ll.add("is");
		Ll.add("the");
		Ll.add("fastest");
		Ll.add("legend");
		Ll.add("in");
		Ll.add("Apex");
		Ll.add("Legend");
		Ll.add("fastest");

		System.out.println("1st");

		for (int i = 0; i < Ll.size(); i++) {

			System.out.print(Ll.get(i) + " ");
		}
		System.out.println();
		System.out.println("2nd");

		Ll.remove(7);
		Ll.remove("fastest");

		for (int i = 0; i < Ll.size(); i++) {

			System.out.print(Ll.get(i) + " ");

		}
		System.out.println();

		System.out.println("3rd");

		Ll.set(3, "fastest");//replace

		for (int i = 0; i < Ll.size(); i++) {

			System.out.print(Ll.get(i) + " ");

		}
		
		
		System.out.println();

		System.out.println("4th");

		Ll.add(4, "legend");//add

		for (int i = 0; i < Ll.size(); i++) {

			System.out.print(Ll.get(i) + " ");

		}

	}
}
