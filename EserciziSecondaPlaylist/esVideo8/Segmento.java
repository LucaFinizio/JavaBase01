/*
 *  L'esercizio chiede di creare la classe Punto, la classe Segmento e la classe Rettanoglo.
 *  Il rettangolo dev'essere definito dalle coordinate del suo angolo in alto a sinistra
 *  e dai valori di base e altezza; inoltre creiamo un costruttore che crea un rettangolo con le 
 *  coordinate del punto in alto a sinistra e del punto in basso a destra.
 *  Poi creiamo i metodi per calcolare  perimetro e area di un rettangolo.
 */

public class Segmento {
	private Punto p1 = null;
	private Punto p2 = null;
	
	//Costruttore che prende in ingresso le coordinate di due punti
	public Segmento(int x1, int y1, int x2, int y2)
	{
		p1 = new Punto(x1,y1);
		p2 = new Punto(x2,y2);
	}
	
	
	//Costruttore che crea un segmento senza specificare gli estremi
	public Segmento()
	{
		p1 = new Punto();
		p2 = new Punto();
	}
}
