package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> faveSpots = new ArrayList<String>();
		faveSpots.add("Brooklyn");
		faveSpots.add("Manhattan");
		faveSpots.add("Queens");
		faveSpots.add("Atlantic City");

		List<String> wishList = new ArrayList<String>();
		wishList.add("Finish this class");
		wishList.add("Get a new job");
		wishList.add("Tell people say no to PNT");
		wishList.add("Tell Mafi Bhaiya to shave his head already");
		wishList.add("buy new car");
		wishList.add("remodel house");

		Map<String,List<String>> demo = new HashMap<>();
		demo.put("Places I Stay", faveSpots);
		demo.put("goals",wishList);

		System.out.println("\n foreach traversal \n");
		for (Map.Entry en: demo.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue()+"\n");

		}

		System.out.println("\n iterator traversal \n");
		Iterator<Map.Entry<String, List<String>>> itr = demo.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry entry = itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue()+ "\n");
		}

	}

}