package test;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

public class Test {

	@org.junit.Test
	public void test() {

		 int range = (10 - 1) + 1;
		 //(int)(Math.random() * range) + 1
		 
		 IntStream.range(0, 10).forEach(
					nbr -> System.out.println((int)(Math.random() * range) + 1)
				);
	}

}
