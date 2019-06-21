/*Un pò di esperimenti con elementi grafici...
 * 
 */

import java.awt.*;
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
		
		//Creiamo un oggetto Container in modo da non dover scrivere sempre finestra.getContentPane()
		Container contenuto = finestra.getContentPane();
		
		//La struttura di contenuto sarà una struttua che si sviluppa in orizzontale
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.X_AXIS));
		
		//Creo tre pannelli
		JPanel sx = new JPanel();
		JPanel dx = new JPanel();
		JPanel sep = new JPanel();
		
		//Ognuno dei seguenti BoxLayout si sviluppa in verticale
		sx.setLayout(new BoxLayout(sx, BoxLayout.Y_AXIS));
		sep.setLayout(new BoxLayout(sep, BoxLayout.Y_AXIS));
		dx.setLayout(new BoxLayout(dx, BoxLayout.Y_AXIS));
		
		//Aggiungo i tre BoxLayout a contenuto, che si sviluppa in orizzontale da sinistra a destra
		contenuto.add(sx);
		contenuto.add(sep);
		contenuto.add(dx);
		
		//Setto semplicemente lo sfondo a verde
		contenuto.setBackground(Color.GREEN);
		
		//Aggiungo bottoni al pannello centrale, senza salvare i riferimenti dei bottoni
		//I bottoni verranno aggiunti in verticale (dall'alto in basso) dato che il pannello sep è stato definito con BoxLayout.Y_AXIS
		sep.add(new JButton("Bottone 1"));
		sep.add(new JButton("Bottone 2"));
		sep.add(new JButton("Bottone 3"));
		
		//Creo tre label di colore diverso e le aggiungo al BoxLayout sinistro
		//Verranno impilate orizzontalmente perchè il BoxLayout sx è definito come Y_AXIS
		JLabel label1 = new JLabel("XXX   ");
		label1.setOpaque(true);
		label1.setBackground(Color.BLUE);
		label1.setForeground(Color.white);
		sx.add(label1);
		
		JLabel label2 = new JLabel("XXX   ");
		label2.setOpaque(true);
		label2.setBackground(Color.black);
		label2.setForeground(Color.yellow);
		sx.add(label2);
		
		JLabel label3 = new JLabel("XXX   ");
		label3.setOpaque(true);
		label3.setBackground(Color.PINK);
		label3.setForeground(Color.white);
		sx.add(label3);
		
		//Creo altri tre label e li aggiungo al BoxLayout destro
		JLabel label4 = new JLabel("YYY   ");
		label4.setOpaque(true);
		label4.setBackground(Color.CYAN);
		label4.setForeground(Color.white);
		dx.add(label4);
		
		JLabel label5 = new JLabel("YYY   ");
		label5.setOpaque(true);
		label5.setBackground(Color.yellow);
		label5.setForeground(Color.white);
		dx.add(label5);
		
		JLabel label6 = new JLabel("YYY   ");
		label6.setOpaque(true);
		label6.setBackground(Color.green);
		label6.setForeground(Color.white);
		dx.add(label6);
		
		finestra.setVisible(true);
		
		//Per far sì che l'applicativo venga chiuso effettivamente:
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
