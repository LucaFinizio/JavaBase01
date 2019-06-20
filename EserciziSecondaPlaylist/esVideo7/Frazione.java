//Classe per gestire numeri frazionari
public class Frazione {
	private int numeratore = 0;
	private int denominatore = 1;
	
	/* Primo costruttore 
	 * a cui passo sia numeratore che denominatore, inoltre calcola
	 * il valore della divisione (nel caso fosse necessario usarlo in altri calcoli)
	 */
	public Frazione(int numeratore, int denominatore)
	{
		this.numeratore = numeratore;
		if(denominatore!=0)
			this.denominatore = denominatore;
		else
			this.denominatore = 1;
	}
	
	/* Secondo costruttore
	 * A cui passo solo il numeratore, il denominatore sarà 1 di default
	 */
	public Frazione(int numeratore)
	{
		this.numeratore = numeratore;
	}
	
	/* Terzo costruttore
	 * che prende in input la frazione sottoforma di stringa "numero/numero"
	 */
	public Frazione(String f)
	{
		this(Integer.parseInt(f.split("/")[0]),
			  Integer.parseInt(f.split("/")[1]));
	}
	
	//Metodo per stampare la frazione
	public String ToString()
	{	return numeratore + "/" + denominatore;	}
	
	// Metodo per sommar una frazione ad un'altra
	public Frazione somma(Frazione daSommare)
	{
		return new Frazione(numeratore*daSommare.denominatore + denominatore*daSommare.numeratore, denominatore*daSommare.denominatore);
	}
}
