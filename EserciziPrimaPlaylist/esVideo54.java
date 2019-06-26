
/**Esercizio playlist 1, video 54, minuto 8:20
 * L'esercizio chiede di creare dei cicli per contare fino a 10, aggiustando il ciclo quando si parte con la
 * variabile "conta" ad 1. 
 * 
 * @author Luca Finizio
 *
 */
public class esVideo54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soluzione con while e conta=1
		System.out.println("Conto fino a 10 con il while e conta=1");
		int conta = 1;
		while (conta<=10)
		{
			System.out.println(conta);
			conta++;
		}
		
		//Soluzione con while e conta=0
		System.out.println("Conto fino a 10 con il while e conta=0");
		conta=0;
		while(conta<10)
		{
			System.out.println(conta+1);
			conta++;
		}
		
		
		//Soluzione con do...while e conta=1
		System.out.println("Conto fino a 10 con il do...while e conta=1");
		conta = 1;
		do
		{
			System.out.println(conta);
			conta++;
		}while(conta<=10);
		
		//Soluzione con do...while e conta=0
		System.out.println("Conto fino a 10 con il do...while e conta=0");
		conta=0;
		do
		{
			conta++;
			System.out.println(conta);
		}while(conta<10);
		
		
		//Soluzione con for e conta=1
		System.out.println("Conto fino a 10 con il for e conta=1");
		for(conta=1;conta<=10;conta++)
		{
			System.out.println(conta);
		}
		
		//Soluzione con for e conta=0
		System.out.println("Conto fino a 1o con il for e conta=0");
		for(conta=0;conta<10;conta++)
		{
			System.out.println(conta+1);
		}
	}

}
