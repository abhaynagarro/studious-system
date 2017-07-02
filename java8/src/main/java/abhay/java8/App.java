package abhay.java8;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String[] strList = new String[] { "abhay", "anuj", "shantanu", "amit", "ankit", "dubey" };
		System.out.println("brfore sorting: " + Arrays.asList(strList));
		Arrays.sort(strList, String::compareToIgnoreCase);
		System.out.println("after sorting: " + Arrays.asList(strList));
	}
}
