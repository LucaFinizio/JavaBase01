/*
 *  L'esercizio chiede di creare la classe Punto, la classe Segmento e la classe Rettanoglo.
 *  Il rettangolo dev'essere definito dalle coordinate del suo angolo in alto a sinistra
 *  e dai valori di base e altezza; inoltre creiamo un costruttore che crea un rettangolo con le 
 *  coordinate del punto in alto a sinistra e del punto in basso a destra.
 *  Poi creiamo i metodi per calcolare  perimetro e area di un rettangolo.
 */

public class Rettangolo {
	//Usiamo il punto p1 come punto in alto a sinistra e il p2 come punto in basso a estra
	private Punto p1 = null;
	private Punto p2 = null;
	private int base = 0;
	private int altezza = 0;
	
	//Primo costruttore in cui specifichiamo angolo in alto a sinistra, base e altezza
	public Rettangolo(Punto p, int base, int altezza)
	{
		p1 = new Punto(p.getX(), p.getY());
		this.base = base;
		this.altezza = altezza;
	}
	
	//Secondo costruttore in cui specifico il punto in alto a sinistra e in basso a destra
	public Rettangolo(Punto _p1, Punto _p2)
	{
		p1 = new Punto(_p1.getX(), _p1.getY());
		p2 = new Punto(_p2.getX(), _p2.getY());
		
		//Calcolo base e altezza in funzione dei punti presi in input
		//Creiamo un if in modo da avere valore sempre positivi di base e altezza
		if(_p1.getX() < _p2.getX())
			base = _p2.getX() - _p1.getX();
		else
			base = _p1.getX() - _p2.getX();
		
		if(_p1.getY() > _p2.getY())
			altezza = _p1.getY() - _p2.getY();
		else 
			altezza = _p2.getY() - _p1.getY();
	}
	
	//Metodo per calcolo del perimetro
	public int perimetro()
	{
		int perimetro = base*2 + altezza*2;
		return perimetro;
	}
	
	public int area()
	{
		int area = base * altezza;
		return area;
	}
	
	
}
