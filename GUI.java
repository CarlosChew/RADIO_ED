import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnApagar = new JButton("APAGAR");
		btnApagar.setBounds(96, 24, 89, 23);
		frame.getContentPane().add(btnApagar);
		
		JButton btnEncender = new JButton("ENCENDER");
		btnEncender.setBounds(208, 24, 89, 23);
		frame.getContentPane().add(btnEncender);
		
		JButton btnAdelanet = new JButton("ADELANET");
		btnAdelanet.setBounds(96, 58, 89, 23);
		frame.getContentPane().add(btnAdelanet);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(208, 58, 89, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnCambiarFrecuencia = new JButton("CAMBIAR FRECUENCIA");
		btnCambiarFrecuencia.setBounds(124, 92, 146, 23);
		frame.getContentPane().add(btnCambiarFrecuencia);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(96, 130, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBounds(208, 130, 89, 23);
		frame.getContentPane().add(btnMostrar);
		
		textField = new JTextField();
		textField.setBounds(124, 167, 146, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
