package esVideo08_OOP;

/**Classe Rettangolo
 * 
 * @author Luca Finizio
 *
 */
public class Rettangolo {
	/**Usiamo il punto p1 come punto in alto a sinistra e il punto p2 come punto in basso a destra
	 */
	private Punto p1 = null;
	private Punto p2 = null;
	private int base = 0;
	private int altezza = 0;
	
	/**Costruttore che crea un rettangolo in cui specifichiamo l'angolo in alto a sinistra, la base e l'altezza
	 * @param p il punto in alto a sinistra
	 * @param base la lunghezza della base del rettangolo
	 * @param altezza la lunghezza dell'altezza del rettangolo
	 */
	public Rettangolo(Punto p, int base, int altezza)
	{
		p1 = new Punto(p.getX(), p.getY());
		this.base = base;
		this.altezza = altezza;
	}
	
	/**Costruttore che crea un rettangolo in cui specifichiamo l'angolo in alto a sinistra e quello in basso a destra
	 * @param _p1 punto in alto a sinistra
	 * @param _p2 punto in alto a destra
	 */
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
	
	/**Metodo per calcolare il perimetro del rettangolo
	 * @return ritorna il valore del perimetro
	 */
	public int perimetro()
	{
		int perimetro = base*2 + altezza*2;
		return perimetro;
	}
	
	/**Metodo per calcolare l'area del rettangolo
	 * @return ritorna il valore dell'area del rettangolo
	 */
	public int area()
	{
		int area = base * altezza;
		return area;
	}
	
	
}
