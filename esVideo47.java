import java.io.*;

import javax.naming.LimitExceededException;

public class esVideo47 {
	
	//Funzione che legge il valore e lo controlla
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
		}while (errore);
		
		return misuraLetta;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*L'esercizio chiede di creare una funzione che legga un valore da tastiera
		 * e controlli che il valore inserito sia giusto, inoltre il valore inserito
		 * deve essere compreso tra due valori (nel caso di un'industria potrebbe essere
		 * una tolleranza)
		 * */
		double misura;
		misura = leggiDouble("Inserisci la misura: ", 0.3, 2.7);
	}

}
