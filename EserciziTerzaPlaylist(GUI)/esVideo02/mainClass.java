/* L'esercizio chiede di provare a cambiare il colore dello sfondo della finestra
 * (il problema è stato nel fatto nel fatto che per poter attivare setBackground 
 *  bisogna prima chiamare getContentPane() )
 */

import java.awt.Color;
import javax.swing.*;


public class mainClass {
	
	//Metodo per mettere in pausa il programma di un tot di secondi
	static void pausa(int secondi)
	{
		try 
		{
			Thread.sleep(1000*secondi);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo una nuova finestra
		JFrame finestra = new JFrame("La mia prima finestra con Java!");
		finestra.setBounds(500,500,600,300); //Coordinate dell'angolo in alto a sinistra, larghezza e altezza
		
		//Aggoungo una label (etichetta)
		JLabel label1 = new JLabel("Il mio primo applicativo SWING!");
		finestra.add(label1);
		finestra.setVisible(true);
		
		//chiamo il metodo che mette il programma in pausa per 2 secondi
		pausa(2);
		
		//Cambio colore al test dell'etichetta
		label1.setText("Sona cambiata!");
		label1.setForeground(Color.RED);
		
		//Cambio colore allo sfondo
		finestra.getContentPane().setBackground(Color.GREEN);
		
		//Per far sì che l'applicativo venga chiuso effettivamente:
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
