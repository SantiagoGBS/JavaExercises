package Ejercicio2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ingresocuenta extends JFrame {
	static ingresocuenta frameingresocuenta;
	private JPanel contentPane;
	private JTextField campoingresocuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameingresocuenta = new ingresocuenta();
					frameingresocuenta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ingresocuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cuanto dinero quieres ingresar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(111, 10, 261, 92);
		contentPane.add(lblNewLabel);

		campoingresocuenta = new JTextField();
		campoingresocuenta.setBounds(144, 93, 96, 19);
		contentPane.add(campoingresocuenta);
		campoingresocuenta.setColumns(10);

		JButton btningresocuenta = new JButton("Ingresar");
		btningresocuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameingresocuenta.setVisible(false);
				cuenta.frame.setVisible(true);

			}
		});
		btningresocuenta.setBounds(144, 145, 104, 39);
		contentPane.add(btningresocuenta);
	}

}
