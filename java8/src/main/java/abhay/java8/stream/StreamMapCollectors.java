package abhay.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import abhay.java8.model.Person;

public class StreamMapCollectors {
	public static void collectToMap() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "address1", "tcs", 10));
		personList.add(new Person("ankit", "address1", "nagarro", 20));
		personList.add(new Person("amit", "address1", "accenture", 30));
		personList.add(new Person("rachit", "address1", "tcs", 35));
		Map<String, Integer> map1 = personList.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
		System.out.println(map1);
	}

	public static void collectObjectToMap() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "address1", "tcs", 10));
		personList.add(new Person("ankit", "address1", "nagarro", 20));
		personList.add(new Person("amit", "address1", "accenture", 30));
		personList.add(new Person("rachit", "address1", "tcs", 35));
		Map<String, Person> map1 = personList.stream().collect(Collectors.toMap(Person::getName, Function.identity()));
		System.out.println(map1);
	}

	public static void main(String[] args) {
		// collectToMap();
		collectObjectToMap();
	}
}
