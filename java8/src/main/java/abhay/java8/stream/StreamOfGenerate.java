package abhay.java8.stream;

import java.math.BigInteger;
import java.util.stream.Stream;

public class StreamOfGenerate {

	public static void createStreams() {
		Stream<String> stream1 = Stream.of("abhay","pratap","singh");
		Stream<Double> stream2 = Stream.generate(Math::random);
		
		Stream<BigInteger> stream3=Stream.iterate(BigInteger.ZERO, n->n.add(BigInteger.ONE));
		stream2 = stream2.limit(4);
		System.out.println(stream3.skip(4));
		//System.out.println(stream1.max(String::compareToIgnoreCase).get());
		System.out.println(stream1.findFirst().get());
		System.out.println(stream2.findAny().get());
	}
	
	public static void mapStreams() {
		Stream<String> stream1 = Stream.of("aBHay","praTAP","SIngh");
		Stream<Double> stream2 = Stream.generate(Math::random);
		
		Stream<BigInteger> stream3=Stream.iterate(BigInteger.ZERO, n->n.add(BigInteger.ONE));
		
		Stream<String> streamMap1 = stream1.map(String::toLowerCase);
		Stream<Double> streamMap2 = stream2.map(n->n+2);
		
	}
	
	public static void main(String[] args) {
		createStreams();
		mapStreams();
	}
}
