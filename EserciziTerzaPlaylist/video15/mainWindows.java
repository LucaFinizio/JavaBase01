/* Esercitazione su utilizzo di Window Builder
 * 
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class mainWindows {

	private JFrame frame;
	private JTextField user;
	private JTextField psw;
	private JButton btnLogin;
	private JPanel panel;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindows window = new mainWindows();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//Aggiungo un ascoltatore che modifica la dimensione del tabPane al variare della dimensione del JFrame
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				tabbedPane.setPreferredSize(new Dimension(frame.getWidth()-20, 120));
			}
		});
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setPreferredSize(new Dimension(200, 0));
		frame.setBounds(100, 100, 547, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 153, 255));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("User Name");
		panel.add(lblNewLabel);
		
		user = new JTextField();
		user.setBackground(new Color(0, 255, 255));
		panel.add(user);
		user.setColumns(10);
		
		btnLogin = new JButton("Login");
		//Testo l'ascoltatore del click del mouse, andando a cambiare la dimensione del tasto di Login quando viene cliccato
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLogin.setPreferredSize(new Dimension(50,50)); //Cambio anche la preferredSize altrimenti il bottone torna alla sua grandezza originaria quando ridimensiono la finestra
				btnLogin.setSize(50,50);
			}
		});
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 255));
		frame.getContentPane().add(panel_1);
		
		JLabel lblPassword = new JLabel("Password");
		panel_1.add(lblPassword);
		
		psw = new JTextField();
		psw.setBackground(new Color(0, 255, 255));
		panel_1.add(psw);
		psw.setColumns(10);
		frame.getContentPane().add(btnLogin);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		//La seguente riga non va tolta altrimenti il tabPane all'inizio sarebbe minuscolo
		tabbedPane.setPreferredSize(new Dimension(frame.getWidth()-20, 120));
		frame.getContentPane().add(tabbedPane);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		comboBox = new JComboBox();
		panel_2.add(comboBox);
		
		comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox_1);
	}
}
