/**
*  Esercizio playlist 1, video 16 minuto 7:58.	
  
*  L'esercizio chiede se gli operatori unari in forma pre e postfissa sono applicabili a un char, una 
*  stringa o un boolean. Andiamo a testare quindi i vari tipi.
*  
*  @author Luca Finizio
*/

public class esVideo16 {

	
	/**
	 * x variabile usata per testare il tipo byte;
	 * y variabile usata per testare il tipo short;
	 * z variabile usata per testare il tipo long;
	 * f variabile usata per testare il tipo float;
	 * c variabile usata per testare il tipo char;
	 * vf variabile usata per testare il tipo boolean;
	 * s variabile usata per testare il tipo String;
	 */
	public static void main(String[] args) {
		
		byte x = 1;
		System.out.println("byte x++: " + x++);
		System.out.println("byte ++x: " + ++x);
		System.out.println("byte x--: " + x--);
		System.out.println("byte --x: " + --x);
		
		short y = 1;
		System.out.println("short y++: " + y++);
		System.out.println("short ++y: " + ++y);
		System.out.println("short y--: " + y--);
		System.out.println("short --y: " + --y);
		
		long z = 1;
		System.out.println("long z++: " + z++);
		System.out.println("long ++z: " + ++z);
		System.out.println("long z--: " + z--);
		System.out.println("long --z: " + --z);
		
		float f = (float)1.1;
		System.out.println("float f++: " + f++);
		System.out.println("float ++f: " + ++f);
		System.out.println("float f--: " + f--);
		System.out.println("float --f: " + --f);
		//NOTA:Quando sottraiamo al float arriviamo a 1.0999999
		
		char c = 'A';
		System.out.println("char c++: " + c++);
		System.out.println("char ++c: " + ++c);
		System.out.println("char c--: " + c--);
		System.out.println("char --c: " + --c);
		//NOTA: Aggiungendo (o sottraendo) al char, andiamo a spostarci sul carattere successivo (o precedente) in ordine alfabetico
		
		
		/**
		 *  Non è possibile applicare gli operatori unari ai tipi boolean e String
		 */
		/*
		boolean vf = false;
		System.out.println("boolean vf++: " + vf++);
		System.out.println("boolean ++vf: " + ++vf);
		System.out.println("boolean vf--: " + vf--);
		System.out.println("boolean --vf: " + --vf);
		*/
		
		/*
		String s = "ciao";
		System.out.println("String s++: " + s++);
		System.out.println("String ++s: " + ++s);
		System.out.println("String s--: " + s--);
		System.out.println("String --s: " + --s);
		*/
	}

}
