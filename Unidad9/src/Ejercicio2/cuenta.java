package Ejercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class cuenta extends JFrame {

	private JPanel contentPane;
	private JTextField saldocuenta;
	private JTextField saldotarjeta;
	static cuenta frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new cuenta();
					frame.setVisible(true);
					ingresocuenta.frameingresocuenta = new ingresocuenta();
					ingresocuenta.frameingresocuenta.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btningtarjeta = new JButton("Ingresar a Tarjeta");
		btningtarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btningtarjeta.setBounds(37, 92, 147, 36);
		contentPane.add(btningtarjeta);

		JButton btnretirocuenta = new JButton("Sacar dinero de la cuenta");
		btnretirocuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnretirocuenta.setBounds(197, 35, 174, 34);
		contentPane.add(btnretirocuenta);

		JButton btntransatarj = new JButton("Transferir a Tarjeta");
		btntransatarj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btntransatarj.setBounds(381, 34, 153, 36);
		contentPane.add(btntransatarj);

		JButton btningcuenta = new JButton("Ingresar en cuenta");
		btningcuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresocuenta.frameingresocuenta.setVisible(true);
			}
		});
		btningcuenta.setBounds(37, 34, 147, 36);
		contentPane.add(btningcuenta);

		JButton btnretirotarjeta = new JButton("Sacar dinero de Tarjeta");
		btnretirotarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnretirotarjeta.setBounds(197, 92, 174, 36);
		contentPane.add(btnretirotarjeta);

		JLabel lblNewLabel = new JLabel("Saldo Tarjeta");
		lblNewLabel.setBounds(55, 214, 92, 36);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Saldo Cuenta");
		lblNewLabel_1.setBounds(55, 168, 92, 36);
		contentPane.add(lblNewLabel_1);

		saldocuenta = new JTextField();
		saldocuenta.setEditable(false);
		saldocuenta.setText("600");
		saldocuenta.setBounds(157, 177, 96, 19);
		contentPane.add(saldocuenta);
		saldocuenta.setColumns(10);

		saldotarjeta = new JTextField();
		saldotarjeta.setText("125");
		saldotarjeta.setEditable(false);
		saldotarjeta.setColumns(10);
		saldotarjeta.setBounds(157, 223, 96, 19);
		contentPane.add(saldotarjeta);

		JButton btnsalir = new JButton("Salir");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnsalir.setBounds(381, 214, 121, 36);
		contentPane.add(btnsalir);
	}

}
