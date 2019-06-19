import java.util.Scanner;

public class esVideo53 {
	
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
		/*L'esercizio chiede di creare un programma che, depositata una somma di denaro
		 * e data una certa percentuale di interesse, mi dice dopo quanto tempo la somma 
		 * sarà diventata di 1.000.000€
		 */
		
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
