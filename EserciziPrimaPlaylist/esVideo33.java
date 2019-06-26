/**Esercizio playlist 1, video 33, minuto 8:00
 * L'esercizio chiede di creare un metodo che stampa una fila di simboli (per creare una "ornicetta"). 
 * Fare in modo di poter scegliere sia il tipo di simbolo da stampare sia quanti stamparne
 * 
 * @author Luca Finizio
 *
 */
public class esVideo33 {

	/**Metodo che stampa il messaggio (preso in input) e richiama i metodi per stampare la cornice
	 * @param ilMessaggio il messaggio da stampare a video
	 * @param simbolo il simbolo che voglio usare per la cornicetta
	 * @param lunghezza mi dice quante volte stampare il simbolo che uso per la cornicetta
	 */
	static void messaggio(String ilMessaggio, char simbolo, int lunghezza)
	{
		stampaCornice(simbolo, lunghezza);
		System.out.println("\n" + ilMessaggio);
		stampaCornice(simbolo, lunghezza);
	}
	
	
	/**Metodo che creare la cornicetta, stampando il simbolo scelto per i volte
	 * @param simbolo1 simbolo scelto per la cornice
	 * @param lunghezza1 numero di volte che bisogna stampare il simbolo scelto per la cornice
	 */
	static void stampaCornice(char simbolo1, int lunghezza1)
	{
		for (int i=0; i<=lunghezza1; i++) System.out.print(simbolo1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		messaggio("ciao ciao ... ", '#', 30);      //al posto di * possiamo usare qualsiasi altro carattere
	}

}