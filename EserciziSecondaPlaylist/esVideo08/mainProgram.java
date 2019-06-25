package esVideo08_OOP;

import java.util.*;

/**Esercizio playlist 2, video 8, minuto 7:51
 * L'esercizio chiede di ricreare la classe del punto e del segmento, e creare la classe rettangolo. Il rettangolo
 * dev'essere definito dalle coordinate del suo angolo in alto a sinistra e dai valori di base e altezza. Aggiungere
 * anche un costruttore in grado di costruire un rettangolo dando al costruttore le coordinate del punto in alto a 
 * sinistra e di quello in basso a destra.
 * Infine implementare il metodo per il calcolo del perimetro e dell'aera.
 * 
 * @author Luca Finizio
 *
 */
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Testiamo il primo costruttore della classe Rettangolo
		System.out.println("Creiamo un rettangolo usando il primo costruttore della classe Rettangolo");
		System.out.println("Inserisci le coordinate del punto in alto a sinistra");
		
		//leggo x in input
		System.out.println("X: ");
		int x = sc.nextInt();
		
		//leggo y in input
		System.out.println("Y: ");
		int y = sc.nextInt();
		
		//creo il punto con le coordinate inserite
		Punto p = new Punto(x,y);
		
		//Ora chiediamo base e altezza del rettangolo
		System.out.println("Inserisci la lunghezza della base: ");
		int base = sc.nextInt();
		System.out.println("Inserisci l'altezza: ");
		int altezza = sc.nextInt();
		
		//Chiamiamo il primo costruttore passando tutti i valori presi in input
		Rettangolo r = new Rettangolo (p, base, altezza);
		
		//Mostriamo il perimetro e l'area del rettangolo inserito
		System.out.println("Il perimetro del rettangolo inserito è "
							+ r.perimetro() + " e l'area è " + r.area());
		
		
		
		
		System.out.println();
		
		
		
		
		
		//Testiamo il secondo costruttore della classe Rettangolo
		System.out.println("Creiamo un rettangolo usando il secondo costruttore della classe Rettangolo");
		System.out.println("Inserisci le coordinate del punto in alto a sinistra");
		//leggo x in input
		System.out.println("X: ");
		int x1 = sc.nextInt();
		//leggo y in input
		System.out.println("Y: ");
		int y1 = sc.nextInt();
		//creo il punto con le coordinate inserite
		Punto p1 = new Punto (x1, y1);
		
		System.out.println("Inserisci le coordinate del punto in basso a destra");
		//leggo x in input
		System.out.println("X: ");
		int x2 = sc.nextInt();
		//leggo y in input
		System.out.println("Y: ");
		int y2 = sc.nextInt();
		//creo il punto con le coordinate inserite
		Punto p2 = new Punto(x2,y2);
		
		//Chiamiamo il secondo costruttore della classe Rettangolo
		r = new Rettangolo(p1, p2);
		
		//Mostriamo il perimetro e l'area del rettangolo inserito
		System.out.println("Il perimetro del rettangolo inserito è "
							+ r.perimetro() + " e l'area è " + r.area());
	}

}

