import java.io.*;

public class esVideo44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dati input
		 * somma iniziale
		 * percentuale di interesse annuale
		 * numero di anni deposito
		 */
		double sommaIniziale=0;
		double sommaFinale=0;
		double percentualeInteresse=0;
		int anniDeposito=0;
		
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		String rigaLetta = "";
		
		//Prendiamo in input la somma iniziale da depositare (con la struttura che gestisce le eccezioni)
		System.out.println("Inserisci la somma iniziale da depositare: ");
		
		boolean errore = false;
		do
		{
			errore = false;
			try 
			{
				rigaLetta = bufferTastiera.readLine();
				sommaIniziale = Double.parseDouble(rigaLetta);
			} 
			catch (NumberFormatException e)
			{
				System.out.println("Non hai inserito un numero; riprova!");
				errore = true;
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				errore = true; //Si attiva quando c'è un problema con il dispositivo di input
			}
		}while(errore);
		
	}

}
