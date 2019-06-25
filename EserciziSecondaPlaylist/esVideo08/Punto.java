package esVideo08_OOP;

/**Classe Punto
 * 
 * @author Luca Finizio
 *
 */
public class Punto {
	private int x = 0;
	private int y = 0;
	
	//Costruttore principale
	/**Costruttore per creare un punto specificando le sue coordinate
	 * @param x coordinata x
	 * @param y coordinata y
	 */
	public Punto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**Costruttore per creare un punto nell'origine (nessun parametro viene passato al costruttore)
	 * 
	 */
	public Punto() {this(0,0);}
	
	/**Metodo per ottenere la coordinata x di un punto
	 * @return ritorna la coordinata x
	 */
	public int getX() {return x;}
	
	/**Metodo per ottenere la coordinata y di un punto
	 * @return ritorna la coordinata y
	 */
	public int getY() {return y;}
}
