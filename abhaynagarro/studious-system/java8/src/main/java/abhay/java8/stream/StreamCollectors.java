package abhay.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectors {

	public static void collectToList() {
		List<Double> list = Stream.generate(Math::random).limit(10).collect(Collectors.toList());
		System.out.println(list);

	}

	public static void collectToSet() {
		String[] names = { "abhay", "ankit", "abhishek", "ankit", "abhay", "sunil", "rachit", "rachit" };
		Stream<String> stream = Stream.of(names);
		System.out.println(stream.collect(Collectors.toSet()));

	}

	public static void collectToSortedSet() {
		String[] names = { "abhay", "ankit", "abhishek", "ankit", "abhay", "sunil", "rachit", "rachit" };
		Stream<String> stream = Stream.of(names);
		System.out.println(stream.collect(Collectors.toCollection(TreeSet::new)));

	}

	public static void joinToString() {
		String[] names = { "abhay", "ankit", "abhishek", "ankit", "abhay", "sunil", "rachit", "rachit" };
		Stream<String> stream = Stream.of(names);
		System.out.println(stream.collect(Collectors.joining(",")));

	}

	public static void replaceDelimiter() {
		String[] names = { "abhay", "ankit", "abhishek", "ankit", "abhay", "sunil", "rachit", "rachit" };
		Stream<String> stream = Stream.of(names);
		String s1 = stream.collect(Collectors.joining(","));
		s1 = s1.replace(',', ';');
		System.out.println(s1);

	}

	public static void streamForEach() {
		String[] names = { "abhay", "ankit", "abhishek", "ankit", "abhay", "sunil", "rachit", "rachit" };
		Stream<String> stream = Stream.of(names);
		stream.forEach(System.out::println);

		String[] names1 = { "abhay", "ankit", "abhishek", "ankit", "abhay", "sunil", "rachit", "rachit" };
		List<String> listStr = Arrays.asList(names1);
		listStr.forEach(new MyConsumer());

	}

	public static void main(String[] args) {
		// collectToList();
		// collectToSet();
		// collectToSortedSet();
		// joinToString();
		// replaceDelimiter();
		streamForEach();
	}

}
