package abhay.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import abhay.java8.model.Person;

public class StreamHandsOn {

	public static void main(String[] args) {

		// count();
		// reduceToGetSumOfInteger();
		// reduceToGetSumOfString();
		// toUpperCaseStream();
		// sortingStream();
		// chainingConsumer();
		// reduceToMap();
		mapForEach();

	}

	private static void count() {
		List<String> list = new ArrayList<>();
		list.add("gfhdjhdjd");
		list.add("sbghf");
		list.add("sfgt");
		list.add("nhjklf");
		list.add("fhg");
		list.add("jfjfjkf");
		list.add("kfkfdk");
		list.add("fdjbfdjkf");
		list.add("jkbfdjkjk");
		long count = list.stream().filter(w -> w.length() > 5).count();
		System.out.println("Words having length greater than 5 are: " + count);
	}

	private static void toUpperCaseStream() {
		List<String> list = new ArrayList<>();
		list.add("gfhdjhdjd");
		list.add("sbghf");
		list.add("sfgt");
		list.add("nhjklf");
		list.add("fhg");
		list.add("jfjfjkf");
		list.add("kfkfdk");
		list.add("fdjbfdjkf");
		list.add("jkbfdjkjk");
		Stream<String> upperCaseStream = list.stream().map(String::toUpperCase);
		System.out.println(upperCaseStream.collect(Collectors.toSet()));
	}

	private static void sortingStream() {
		List<String> list = new ArrayList<>();
		list.add("gfhdjhdjd");
		list.add("sbghf");
		list.add("sfgt");
		list.add("nhjklf");
		list.add("fhg");
		list.add("jfjfjkf");
		list.add("kfkfdk");
		list.add("fdjbfdjkf");
		list.add("jkbfdjkjk");
		Stream<String> longestFirstStream = list.stream().sorted(Comparator.comparing(String::length).reversed());
		System.out.println(longestFirstStream.collect(Collectors.toList()));
	}

	private static void findLargest() {
		List<String> list = new ArrayList<>();
		list.add("gfhdjhdjd");
		list.add("sbghf");
		list.add("sfgt");
		list.add("nhjklf");
		list.add("fhg");
		list.add("jfjfjkf");
		list.add("kfkfdk");
		list.add("fdjbfdjkf");
		list.add("jkbfdjkjk");
		Optional<String> max = list.stream().max(Comparator.comparing(String::length));
		if (max.isPresent()) {
			System.out.println("Largest element is: " + max.get());
		}
	}

	private static void reduceToGetSumOfInteger() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(34);
		list.add(43);
		list.add(45);
		list.add(56);
		list.add(66);
		list.add(67);
		list.add(38);
		Optional<Integer> max = list.stream().reduce((x, y) -> x + y);
		if (max.isPresent()) {
			System.out.println("Largest element is: " + max.get());
		}
	}

	private static void reduceToGetSumOfString() {
		List<String> list = new ArrayList<>();
		list.add("gfhdjhdjd");
		list.add("sbghf");
		list.add("sfgt");
		list.add("nhjklf");
		list.add("fhg");
		list.add("jfjfjkf");
		list.add("kfkfdk");
		list.add("fdjbfdjkf");
		list.add("jkbfdjkjk");
		int max = list.parallelStream().reduce(0, (total, word) -> total + word.length(),
				(total1, total2) -> total1 + total2);
		System.out.println("Sum of elements is: " + max);
	}

	private static void reduceToMap() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("abhay", "address1", "comp1", 10));
		list.add(new Person("ankit", "address1", "comp1", 10));
		list.add(new Person("anuj", "address1", "comp1", 10));
		list.add(new Person("ambuj", "address1", "comp1", 10));
		list.add(new Person("aashish", "address1", "comp1", 10));
		list.add(new Person("archit", "address1", "comp1", 10));
		list.add(new Person("abhishek", "address1", "comp1", 10));
		list.add(new Person("sunil", "address1", "comp1", 10));
		list.add(new Person("vinod", "address1", "comp1", 10));
		list.add(new Person("vinod", "address2", "comp1", 10));
		// Map<String, Person> map =
		// list.stream().collect(Collectors.toMap(Person::getName,
		// Function.identity()));
		Map<String, Person> map1 = list.stream()
				.collect(Collectors.toMap(Person::getName, Function.identity(), (oldValue, newValue) -> newValue));
		System.out.println("Map is: " + map1);
	}

	private static void chainingConsumer() {
		List<String> list = new ArrayList<>();
		list.add("gfhdjhdjd ");
		list.add("sbghf");
		list.add("sfgt");
		list.add("nhjklf");
		list.add("fhg");
		list.add("jfjfjkf");
		list.add("kfkfdk");
		list.add("fdjbfdjkf");
		list.add("jkbfdjkjk");
		Consumer<String> c1 = (str) -> {
			str = str.substring(1, str.length());
			System.out.println(str);
		};
		Consumer<String> c2 = System.out::println;
		list.stream().forEach(c1.andThen(c2));
	}

	private static void mapForEach() {
		Map<String, Integer> map = new HashMap<>();
		map.put("abhay", 10);
		map.put("abhishek", 4);
		map.put("rahul", 7);
		map.put("raina", 8);
		map.put("amit", 3);
		map.put("ankit", 5);

		map.forEach((key, value) -> {
			System.out.println("Age of " + key + " is " + value);
		});

	}

}
