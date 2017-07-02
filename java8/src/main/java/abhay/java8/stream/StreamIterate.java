package abhay.java8.stream;

import java.util.Arrays;

public class StreamIterate {

	public static long getCount(String[] words) {
		return Arrays.asList(words).stream().filter(w -> w.length()>5).count();
	}
	
	
	
	public static void main(String[] args) {
		String[] words = {"abhay","aashish","abhinav","abhishek","amit","dcjjddfj"};
		System.out.println(getCount(words));
	}
}
