/*
 *  L'esercizio chiede di creare la classe Punto, la classe Segmento e la classe Rettanoglo.
 *  Il rettangolo dev'essere definito dalle coordinate del suo angolo in alto a sinistra
 *  e dai valori di base e altezza; inoltre creiamo un costruttore che crea un rettangolo con le 
 *  coordinate del punto in alto a sinistra e del punto in basso a destra.
 *  Poi creiamo i metodi per calcolare  perimetro e area di un rettangolo.
 */
import java.util.*;

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
