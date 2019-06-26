
/**Esercizio playlist 1, video 30, minuto 3:32
 * L'esercizio chiede di calcolare la somma dei numeri compresi tra A e B tramite un ciclo for (possiamo fare a
 * meno di far leggere A e B da tastiera)
 * 
 * @author Luca Finizio
 *
 */
public class esVideo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Somma dei numeri compresi tra A e B con ciclo for
		int a=36, b=67, somma=0;
		for(int contatore=a;contatore<=b;contatore++) somma += contatore;
		System.out.println("La somma dei numeri compresi tra " + a + " e " + b + " è pari a: " + somma);
	}

}
