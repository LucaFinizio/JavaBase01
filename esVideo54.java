
public class esVideo54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* L'esercizio chiede di creare dei cicli per contare fino a 10, aggiustando
		 * "il tiro" quando si parte con la variabile conta ad 1
		 */
		
		//Soluzione con while
		System.out.println("Esercizio 01a");
		int conta = 1;
		while (conta<=10)
		{
			System.out.println(conta);
			conta++;
		}
		
		//Soluzione con do...while
		conta = 0;
		do
		{
			conta++;
			System.out.println(conta);
		}while(conta<10);
		
		//Soluzione con for
		for(conta=0;conta<10;conta++)
		{
			System.out.println(conta+1);
		}
	}

}
