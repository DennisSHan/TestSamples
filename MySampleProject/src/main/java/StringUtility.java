import java.util.HashMap;

public class StringUtility {
	
	public static String concat (String... strs) {
		
		StringBuilder builder = new StringBuilder ();
		for (String str : strs) {
			builder.append(str);
		}
		return builder.toString();
	}
	
	
	public static <K, V> boolean compare (Pair <K, V> pair1, Pair<K, V> pair2) {
		return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
	}
	
	public static <K, V> HashMap<K, V> getHashInstance () {
		return new HashMap <K, V> ();
	}
}
