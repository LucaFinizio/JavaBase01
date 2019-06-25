/**Esercizio playlist 2, video 5, minuto 8:00
 * L'esercizio chiede di implementare una classe per rappresentare i numeri frazionari, che possa creare le 
 * frazioni in questi modi:
 *      1) Frazione f1 = new Frazione(1,7);         che genererà un settimo
 *      2) Frazione f2 = new Frazione(7);           che genererà sette primi
 *      3) Frazione f3 = new Frazione("23/43");     genere la frazione partendo da una stringa
 * Inoltre l'esercizio chiede di creare un metodo per sommare due frazioni
 * 
 * @author Luca Finizio
 */
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frazione f1 = new Frazione(3,5);
		System.out.println("Prima frazione: " + f1.stampaFrazione());
		
		Frazione f2 = new Frazione (6);
		System.out.println("Seconda frazione: " + f2.stampaFrazione());
		
		Frazione f3 = new Frazione("23/34");
		System.out.println("Terza frazione: " + f3.stampaFrazione());
		
		System.out.println("La somma della prima e della terza frazione è: " + f1.somma(f3));
	}

}
