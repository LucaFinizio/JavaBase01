import java.util.Scanner;

/**
 * Esercizio playlist 1, video 25, minuto 7:22
 * L'esercizio chiede di riprendere gli esempi precedenti in cui si davano valori fissi e implementarli tramite la
 * classe Scanner e i comandi next di vario tipo
 * 
 * @author Luca Finizio
 *
 */
public class esVideo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo l'oggetto che legge da tastiera
		Scanner tastiera=new Scanner(System.in);
		
		//Chiedo il nome in input
		System.out.print("Inserisci il tuo nome:");
		String nome = tastiera.nextLine();
		
		//Chiedo l'età in input
		System.out.print("Inserisci la tua età: ");
		int eta = tastiera.nextInt();
		
		//Verifico se l'età inserita ha un valore valido
		if (eta<0 || eta>150)
			System.out.println("Il valore inserito non è corretto!");
		else
			//Stampo nome ed età della persona
			System.out.println("Ti chiami " + nome + " e hai " + eta + "anni.");
	}

}
