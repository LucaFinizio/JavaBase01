import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.colorchooser.DefaultColorSelectionModel;

public class FinestraConBottoneWB {
	Container contenuto = null;
	
	public FinestraConBottoneWB()
	{
		//Creo una nuova finestra
		JFrame finestra = new JFrame("Esempio con listener");
		finestra.setBounds(500,500,180,200);
		//Creo l'oggetto contenuto di tipo Container (andrò a lavorare su di lui)
		contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.Y_AXIS));
		
		//Aggiungo un bottone a contenuto e gli associo un ActionListener
		JButton b1 = new JButton("Bottone WB");
		b1.addMouseListener(new MouseAdapter() {
			//Cambio colore del bottone quando il cursore ci va sopra
			@Override
			public void mouseEntered(MouseEvent arg0) {
				((JButton)arg0.getSource()).setBackground(Color.green);
			}
			
			//Cambio colore del bottone quando il cursore esce
			@Override
			public void mouseExited(MouseEvent arg1) {
				((JButton)arg1.getSource()).setBackground(Color.white);
			}
		});
		
		contenuto.add(b1);
		b1.addActionListener(new ClicBottone());
		
		JTextField cognome = new JTextField();
		//cognome.addKeyListener(new intercettaTasti());
		
		cognome.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent e)
			{
				
			}
		});
	
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class ClicBottone implements ActionListener
	{
		public void actionPerformed(ActionEvent evento)
		{contenuto.setBackground(Color.cyan);
		PrimoFrameJB pfJB = new PrimoFrameJB();
		pfJB.setVisible(true);
		}
	}
}

