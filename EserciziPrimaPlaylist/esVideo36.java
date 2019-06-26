import java.io.InputStream;
import java.util.Random;

/**Esercizio playlist 1, video 36, minuto 13:00
 * L'esercizio chiede di scansionare un vettore e, per ogni elemento, controllare se esso è sotto la media di 
 * tutti gli elementi; se lo è, stamparlo a video.
 * 
 * @author Luca Finizio
 *
 */
public class esVideo36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Riempio un vettori di 30 elementi con gli incassi giornalieri di un ipotetico negozio
		Random r = new Random();
		double totaleIncassi=0;
		double[] incassiGiornalieri = new double[30];
		//Riempio il vettore con valori di incassi inventati in maniera casuale
		for (int giorno=0; giorno<30; giorno++)
		{
			System.out.print("Inserire l'incasso del giorno " + giorno + ": ");
			incassiGiornalieri[giorno]=r.nextDouble()*10000;
			System.out.println(incassiGiornalieri[giorno]);
			totaleIncassi+=incassiGiornalieri[giorno];
		}
		
		//Calcolo la media degli incassi
		double mediaIncassi = totaleIncassi/30;
		System.out.println("\nIncasso medio giornaliero: " + mediaIncassi);
		
		/*Ora l'esercizio ci chiede di scansionare tutto il vettore alla ricerca dei giorni
		  che hanno un guadagno sotto la media, e stampare questi ultimi*/
		for(int giorno=0; giorno<30; giorno++)
		{
			if (incassiGiornalieri[giorno] < mediaIncassi) 
				System.out.println("L'incasso del giorno "+(giorno+1)+" è sotto la media, ed è di: "+incassiGiornalieri[giorno]);
		}
	}

}
