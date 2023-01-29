package ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class usuario_pass extends JFrame {

	private JPanel contentPane;
	private JTextField campouser;
	private JTextField campopass;
	static usuario_pass frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new usuario_pass();
					frame.setVisible(true);
					ventanabienveido.framec = new ventanabienveido();
					ventanabienveido.framec.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public usuario_pass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(26, 54, 77, 30);
		contentPane.add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(26, 96, 77, 30);
		contentPane.add(lblContrasea);

		campouser = new JTextField();
		campouser.setBounds(113, 60, 96, 19);
		contentPane.add(campouser);
		campouser.setColumns(10);

		campopass = new JTextField();
		campopass.setColumns(10);
		campopass.setBounds(113, 102, 96, 19);
		contentPane.add(campopass);

		JButton btnentrar = new JButton("Entrar");
		btnentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = "Santiago";
				if (campouser.getText().equals(user)) {
					ventanabienveido.framec.setVisible(true);
				}
			}
		});
		btnentrar.setBounds(26, 159, 85, 21);
		contentPane.add(btnentrar);

		JButton btnsalir = new JButton("Salir");
		btnsalir.setBounds(141, 159, 85, 21);
		contentPane.add(btnsalir);
	}
}
