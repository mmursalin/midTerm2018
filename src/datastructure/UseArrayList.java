package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		List<Integer> numList = new ArrayList<Integer>();

		System.out.println("Added values");
		for (int j = 1; j<= 10;j++){
			numList.add(j);
			System.out.print(j + " ");
		}

		System.out.println("\n accesing the first element");
		System.out.println(numList.get(0));

		System.out.println("\n removing the first element\n");
		numList.remove(0);

		for (int n: numList) {
			System.out.print(n +" ");
		}
		System.out.println();

		List<String> wishList = new ArrayList<String>();

		wishList.add("Finish this class");
		wishList.add("Get a new job");
		wishList.add("Tell people say no to PNT");
		wishList.add("Tell Mafi Bhaiya to shave his head already");
		wishList.add("buy new car");
		wishList.add("remodel house");

		System.out.println("while loop\n");
		int j = 0;
		while (wishList.size() > j) {
			System.out.println(wishList.get(j));
			j++;
		}
		System.out.println();
		System.out.println("for each\n");

		for (String str: wishList) {
			System.out.println(str);
		}

		System.out.println();
		System.out.println("Iterator\n");
		Iterator itr = wishList.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}