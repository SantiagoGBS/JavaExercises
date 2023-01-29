package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	static Principal frame1; 
	private JPanel contentPane;
	private JTextField texto1;
	
	

	public JTextField getTexto1() {
		return texto1;
	}

	public void setTexto1(JTextField texto1) {
		this.texto1 = texto1;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new Principal();
					frame1.setVisible(true);
					Ventana2.frame2 = new Ventana2();
					Ventana2.frame2.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta = new JLabel("Principal");
		etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiqueta.setBounds(67, 66, 72, 28);
		contentPane.add(etiqueta);
		
		texto1 = new JTextField();
		texto1.setBounds(149, 72, 136, 22);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		JButton boton1 = new JButton("Ir a Ventana 2");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2.frame2.setVisible(true);
				frame1.setVisible(false);
				
				//Al pulsar el boton el texto de texto1 se escribe en texto2.
				Ventana2.frame2.getTexto2().setText(texto1.getText());
				
				
			}
		});
		boton1.setBounds(155, 145, 115, 28);
		contentPane.add(boton1);
	}
}
