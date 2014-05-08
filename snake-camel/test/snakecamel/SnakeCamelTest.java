package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void test() {
		SnakeCamelUtil scu = new SnakeCamelUtil(); 
	//	String c1 = scu.capitalize("");
		//System.out.println(c1);
		String c2 = scu.capitalize("a");
		System.out.println(c2);
		String c3 = scu.capitalize("xyz");
		System.out.println(c3);
		
//		String u1 = scu.uncapitalize("");
	//	System.out.println(u1);
		String u2 = scu.uncapitalize("A");
		System.out.println(u2);
		String u3 = scu.uncapitalize("Xyz");
		System.out.println(u3);
		
		String cc1 = scu.snakeToCamelcase("abc");
		System.out.println(cc1);
		String cc2 = scu.snakeToCamelcase("abc_def");
		System.out.println(cc2);
		String cc3 = scu.snakeToCamelcase("abc_def_gh");
		System.out.println(cc3);
		String cc4 = scu.snakeToCamelcase("abc__def___gh");
		System.out.println(cc4);
		String cc5 = scu.snakeToCamelcase("_abc_def__");
		System.out.println(cc5);
		
		String sc1 = scu.camelToSnakecase("Abc");
		System.out.println(sc1);
		String sc2 = scu.camelToSnakecase("AbcDef");
		System.out.println(sc2);
		String sc3 = scu.camelToSnakecase("AbcDefGh");
		System.out.println(sc3);
	}
}
