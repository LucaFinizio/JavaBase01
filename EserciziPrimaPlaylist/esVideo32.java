
public class esVideo32 {

	/*Metodo per stampare a video un messaggio con la cornicetta.
	  Il simbolo da usare nella cornicetta può essere modificato*/
	static void messaggio(String ilMessaggio, char simbolo)
	{
		for (int i=0; i<=20; i++) System.out.print(simbolo);
		System.out.println("\n" + ilMessaggio);
		for (int i=0; i<=20; i++) System.out.print(simbolo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		messaggio("ciao ciao ... ", '#');      //al posto di * possiamo usare qualsiasi altro carattere
	}

}
