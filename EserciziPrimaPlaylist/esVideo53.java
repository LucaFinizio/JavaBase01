import java.util.Scanner;

/**Esercizio playlist 1, video 53, minuto 10:15
 * L'esercizio chiede  di calcolare per quanti anni bisogna lasciare una certa somma in banca affinchè diventi 
 * pari (con gli interessi) a un milione di euro.
 * @author Luca Finizio
 *
 */
public class esVideo53 {
	
	/**Metodo usato per leggere da tastiera la percentuale di interesse e la somma iniziale (con due chiamate diverse)
	 * @param messaggio messaggio da stampare a video
	 * @return restituisce il valore inserito da tastiera 
	 */
	public static double leggiDouble2(String messaggio)
	{
		double sommaLetta = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(messaggio);
		while(!sc.hasNextDouble())     //finchè il valore che viene inserito non è un double
		{			
			System.out.println("Errore, inserire un altro numero come somma iniziale: ");
			sc.nextLine();
		}
		return sc.nextDouble();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sommaIniziale = 0;
		double sommaFinale = 0;
		double percentualeInteresse = 0;
		int anniDeposito = 0;
		sommaIniziale = leggiDouble2("Inserire somma iniziale: ");
		percentualeInteresse = leggiDouble2("Inserisci la percentuale di interesse: ");
		
		sommaFinale = sommaIniziale;
		
		while (sommaFinale < 1000000)
		{
			sommaFinale = sommaFinale + sommaFinale/100 * percentualeInteresse;
			anniDeposito++;
		}
		
		System.out.println("Per arrivare a 1 milione di euro serviranno "+anniDeposito+" anni");
	}

}
