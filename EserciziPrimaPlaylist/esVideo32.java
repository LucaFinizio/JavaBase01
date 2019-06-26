
/**Esercizio playlist 1, video 32, minuto 8:23
 * L'esercizio chiede di creare un metodo che stampa una "cornicetta", indicando al metodo quale simbolo utilizzare
 * per la creazione della stessa
 * 
 * @author Luca Finizio
 *
 */
public class esVideo32 {

	
	/**Metodo per stampare a video un messaggio con la cornicetta.
	 *  Il simbolo da usare nella cornicetta può essere modificato
	 * @param ilMessaggio il messaggio che voglio stampare con la "cornicetta" intorno
	 * @param simbolo il simbolo che voglio utilizzare per la cornicetta
	 */
	static void messaggio(String ilMessaggio, char simbolo)
	{
		for (int i=0; i<=20; i++) System.out.print(simbolo);
		System.out.println("\n" + ilMessaggio);
		for (int i=0; i<=20; i++) System.out.print(simbolo);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		messaggio("ciao ciao ... ", '#');      //al posto di * possiamo usare qualsiasi altro carattere
	}

}
