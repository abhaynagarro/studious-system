package abhay.java8.test;

import abhay.java8.model.Person;

public class Test {
	public static void main(String[] args) {
		String abc = "project %s is not working";
		Person p = new Person("abc", "ac", "45", 0);
		System.out.println(String.format(abc, p));
	}
}
