package abhay.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import abhay.java8.model.Person;

public class GroupByCollectors {
	public static void groupPersonsByName() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "address1", "tcs", 10));
		personList.add(new Person("ankit", "address1", "nagarro", 20));
		personList.add(new Person("abhay", "address1", "accenture", 30));
		personList.add(new Person("rachit", "address1", "tcs", 35));
		Map<String, List<Person>> map1 = personList.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println(map1);
	}

	public static void groupByCounting() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "address1", "tcs", 10));
		personList.add(new Person("ankit", "address1", "nagarro", 20));
		personList.add(new Person("abhay", "address1", "accenture", 30));
		personList.add(new Person("rachit", "address1", "tcs", 35));
		Map<String, Long> map1 = personList.stream()
				.collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
		System.out.println(map1);
	}

	public static void groupBySummingInt() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abhay", "address1", "tcs", 10));
		personList.add(new Person("ankit", "address1", "nagarro", 20));
		personList.add(new Person("abhay", "address1", "accenture", 30));
		personList.add(new Person("rachit", "address1", "tcs", 35));
		Map<String, Integer> map1 = personList.stream()
				.collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));
		System.out.println(map1);
	}

	public static void main(String[] args) {
		// groupPersonsByName();
		// groupByCounting();
		groupBySummingInt();
	}
}
