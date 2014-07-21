import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;


public class TestStringUtility {

	@Test
	public void testStringBuilder () {
		
		String first = "dennis";
		String second = "han";
		String third = "seunghyun";
		
		System.out.println(StringUtility.concat(first, second, third));
		
	}
	
	
	/**
	 * Benefit Java Generic Types
	 * 1. Strong type checking at compile time
	 * 2. Eliminate type casts
	 * 3. enable programmers to implement generic algorithms 
	 */
	/** 
	 * Generic Method
	 * Generic methods are methods that introduce their own type parameters. 
	 * This is similar to declaring a generic type, but the type parameter's scope
	 * is limited to the method where it is declared.
	 */
	@Test
	public void testGenerics () {
		
		List<String> stringList = new ArrayList<String> ();
		List<Object> objectList = new ArrayList<Object> ();		
		
		// wrong expression because Generics don't allow subtyping 
		// In general, if Foo is a subtype (subclass or subinterface) of Bar, 
		// and G is some generic type declaration, it is not the case that G<Foo> is a subtype of G<Bar>. 
//		objectList = stringList;
		
		Collection<Object> c = new ArrayList<Object>();
		for (Object o:c) {
			System.out.println (o.toString());
		}
	}
	
	@Test
	public void testCompare () {
		Pair <String, Integer> pair1 = new Pair <String, Integer>("One", 1);
		Pair <String, Integer> pair2 = new Pair <String, Integer>("Two", 2);
		
		boolean value = StringUtility.compare(pair1, pair2);
		System.out.println(value);
		
	}
	
	@Test
	public void testHashMap () {
		
		HashMap <String, String> hashmap = StringUtility.getHashInstance();
		
	}
	
	
}





