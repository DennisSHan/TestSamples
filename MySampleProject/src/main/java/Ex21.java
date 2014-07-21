
public class Ex21 {
	
	public static void main (String args[]) {
		int c = 'a';
		float f = 10;
		long ell = 100L;
		
		/**
		 * this printf() function results in error because %ld is illegal... UnknownFormatConversionException
		 */
		System.out.printf("char val is %c, float val is %f, long int val is %ld \n", c, f, ell);
	}
}
