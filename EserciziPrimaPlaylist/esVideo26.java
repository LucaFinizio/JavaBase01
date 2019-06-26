import java.util.Scanner;

/** Esercizio playlist 1, video 26, minuto 9:20
 *  L'esercizio chiede di:
 *       1) creare un ciclo per calcolare e stampare la somma dei primi cento numeri
 *       2) somma dei numeri compresi tra A e B (con A e B letti da tastiera)
 *       3) far inserire numeri da tastiera e sommarli fintanto che la somma rimane inferiore a 1000
 *       
 * @author Luca Finizio
 *
 */
public class esVideo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		
		//Calcolo e stampo la somma dei primi cento numeri
		int k=1,somma=0;
		while(k<=100) {
			somma += k;
			k++;
		}
		System.out.println("La somma dei primi cento numeri (da 0 a 100) è: " + somma);
		
		
		//Calcolo la somma dei numeri compresi tra A e B letti da tastiera
		System.out.println("Calcoliamo la somma dei numeri compresi tra A e B.");
		System.out.println("Inserisci il valore A: ");
		int A = tastiera.nextInt();
		System.out.println("Inserisci il valore B: ");
		int B = tastiera.nextInt();
		
		//Se A<B allora sommo da A a B
		if (A<B) 
		{
			somma=0;
			int C = A;
			while (C<=B) 
			{
				somma += C;
				C++;
			}
			System.out.println("La somma dei numeri compresi tra A e B è: " + somma);
		}
		
		if (A>B) 
		{
			somma=0;
			int C = B;
			while (C<=A) 
			{
				somma += C;
				C++;
			}
			System.out.println("La somma dei numeri compresi tra A e B è: " + somma);
		}
		if (A==B) System.out.println("La somma dei numeri compresi tra A e B è: " + (A+B));
		
		
		//Leggo numeri da tastiera e li sommo finchè non supero quota 1000
		somma=0; int i=1;
		System.out.println("Sommiamo numeri finchè non arriviamo a 100!");
		while(somma<1000) 
		{
			System.out.println("Inserisci il " + i + "° numero");
			int numero = tastiera.nextInt();
			somma += numero;
			i++;	
		}
		System.out.println("Abbiamo superato il valore 1000, con una quantità pari a: " +somma);
	}

}
