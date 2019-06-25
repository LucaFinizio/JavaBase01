package esVideo08_OOP;

/**Classe Segmento
 * 
 * @author Luca Finizio
 *
 */
public class Segmento {
	private Punto p1 = null;
	private Punto p2 = null;
	
	
	/**Costruttore che prende in ingresso le coordinate di due punti
	 * @param x1 coordinata x del primo punto
	 * @param y1 coordinata y del primo punto
	 * @param x2 coordinata x del secondo punto
	 * @param y2 coordinata y del secondo punto
	 */
	public Segmento(int x1, int y1, int x2, int y2)
	{
		p1 = new Punto(x1,y1);
		p2 = new Punto(x2,y2);
	}
	
	
	
	/**
	 * Costruttore che crea un segmento senza specificare gli estremi
	 */
	public Segmento()
	{
		p1 = new Punto();
		p2 = new Punto();
	}
}
