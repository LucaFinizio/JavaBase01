/*
 *  L'esercizio chiede di creare la classe Punto, la classe Segmento e la classe Rettanoglo.
 *  Il rettangolo dev'essere definito dalle coordinate del suo angolo in alto a sinistra
 *  e dai valori di base e altezza; inoltre creiamo un costruttore che crea un rettangolo con le 
 *  coordinate del punto in alto a sinistra e del punto in basso a destra.
 *  Poi creiamo i metodi per calcolare  perimetro e area di un rettangolo.
 */
public class Punto {
	private int x = 0;
	private int y = 0;
	
	//Costruttore principale in cui specifichiamo le coordinate del punto
	public Punto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//Costruttore che crea semplicemente un punto, non ci interessano le coordinate iniziali
	public Punto() {this(0,0);}
	
	//Metodo per leggere la x di un punto
	public int getX() {return x;}
	
	//Metodo per leggere la y di un punto
	public int getY() {return y;}
}
