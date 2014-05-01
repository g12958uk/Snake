package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void test() {
		SnakeCamelUtil scu = new SnakeCamelUtil(); 
		String ac1 = scu.snakeToCamelcase("abcdefg");
		String ac2 = scu.camelToSnakecase("abcdefg");
		System.out.println(ac1);
		System.out.println(ac2);
	}
}
