package abhay.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import abhay.java8.model.Person;

public class SortByPerson {

	public static void main(String[] args) {
		// comparatorComparing();
		comparingByLambda();
	}

	private static void comparatorComparing() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "delhi", "comp1", 12));
		personList.add(new Person("shantanu", "delhi", "comp1", 12));
		personList.add(new Person("kiranpal", "delhi", "comp1", 12));
		personList.add(new Person("shashank", "delhi", "comp1", 12));
		personList.add(new Person("anuj", "delhi", "comp1", 12));
		System.out.println("before sorting: " + personList);
		personList.sort(Comparator.comparing(Person::getName));
		System.out.println("after sorting: " + personList);
	}

	private static void comparingByLambda() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "delhi", "comp1", 12));
		personList.add(new Person("shantanu", "delhi", "comp1", 12));
		personList.add(new Person("kiranpal", "delhi", "comp1", 12));
		personList.add(new Person("shashank", "delhi", "comp1", 12));
		personList.add(new Person("anuj", "delhi", "comp1", 12));
		System.out.println("before sorting: " + personList);
		personList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("after sorting: " + personList);
	}

}
