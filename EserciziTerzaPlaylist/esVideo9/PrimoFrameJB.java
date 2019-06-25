package esVideo09_Grafica;

/*Creato con New->Other->WindowBuilder->JFrame
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**Classe che crea una nuova finestra, con controllo try...catch
 * NOTA: questa classe è stata creata tramite il WB: New->Other->WindowBuilder->JFrame
 * 
 * @author Luca Finizio
 *
 */
public class PrimoFrameJB extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimoFrameJB frame = new PrimoFrameJB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Costruttore che crea il frame
	 */
	public PrimoFrameJB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
