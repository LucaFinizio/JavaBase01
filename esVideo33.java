
public class esVideo33 {

	/*Metodo per stampare a video un messaggio con la cornicetta.
	  Il simbolo da usare nella cornicetta può essere modificato;
	  possiamo inoltre scegliere quante volte stampare il simbolo della cornicetta*/
	static void messaggio(String ilMessaggio, char simbolo, int lunghezza)
	{
		stampaCornice(simbolo, lunghezza);
		System.out.println("\n" + ilMessaggio);
		stampaCornice(simbolo, lunghezza);
	}
	
	
	//Metodo per stampare il simbolo della cornicetta un certo numero di volte scelto dall'utente
	static void stampaCornice(char simbolo1, int lunghezza1)
	{
		for (int i=0; i<=lunghezza1; i++) System.out.print(simbolo1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		messaggio("ciao ciao ... ", '#', 30);      //al posto di * possiamo usare qualsiasi altro carattere
	}

}