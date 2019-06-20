import java.util.Scanner;

public class esVideo50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*L'esercizio chiede di sperimentare un pò i metodi "next" della classe String
		 */
		
		/*NOTA: Inserendo valori diversi da quelli richiesti si ottengono delle
		 * eccezioni, che potranno essere gestite con la struttra try...catch
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Chiediamo di inserire un valore intero
		System.out.println("Inserisci un valore intero: ");
		int intero = sc.nextInt();
		System.out.println("Il valore intero inserito è: " + intero);
		
		//Chiediamo di inserire un double
		System.out.println("Inserisci un valore double: ");
		double valoredouble = sc.nextDouble();
		System.out.println("Il valore double inserito è: " + valoredouble);
		
		//Chiediamo di inserire una stringa
		System.out.println("Inserisci una stringa: ");
		String stringa = sc.next();
		System.out.println("Hai inserito la stringa: " + stringa);
	}

}
