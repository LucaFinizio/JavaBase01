import java.io.*;

/**Esercizio playlist 1, video 47, minuto 8:06
 * L'esercizio chiede di migliorare il metodo leggiDouble dando la possibilità a chi lo usa di specificare anche un
 * valore minimo e un valore massimo da non superare per il valore che si sta leggendo
 * 
 * @author Luca Finizio
 *
 */
public class esVideo47 {
	
	/**Metodo che legge il valore da tastiera e controlla che sia corretto
	 * @param messaggio messaggio da stampare a video
	 * @param minimo limite inferiore dell'intervallo
	 * @param massimo limite superiore dell'intervallo
	 * @return restituisce il valore della misura letta da tastiera
	 */
	static double leggiDouble(String messaggio, double minimo, double massimo)
	{
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		
		String rigaLetta="";
		double misuraLetta = 0;
		boolean errore = false;
		do {
			errore = false;
			try 
			{
				System.out.println(messaggio);
				
				//Leggo il valore sotto forma di stringa
				rigaLetta = bufferTastiera.readLine();
				
				//Converto il valore in double
				misuraLetta = Double.parseDouble(rigaLetta);
				
			} 
			catch (NumberFormatException e)
			{
				System.out.println("Il valore inserito non è un valore valido, riprova");
				errore = true;
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Errore nel dispositivo di input");
				errore = true;
			} 
			
			if (misuraLetta < minimo || misuraLetta > massimo)
			{
				System.out.println("Il valore non rientra nell'intervallo "+minimo+"-"+massimo);
				errore = true;
			}
		}while (errore); //Quando il valore inserito è corretto la variabile errore non viene settata a true, e il ciclo finisce
		
		return misuraLetta;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double misura;
		misura = leggiDouble("Inserisci la misura: ", 0.3, 2.7);
	}

}
