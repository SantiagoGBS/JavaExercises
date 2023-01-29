package appmusic;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField campouser;
	private JPasswordField campopass;
	static login frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new login();
					frame.setVisible(true);
					inicio.frame2 = new inicio();
					inicio.frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(177, 41, 77, 33);
		contentPane.add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(168, 102, 77, 33);
		contentPane.add(lblContrasea);

		campouser = new JTextField();
		campouser.setBounds(158, 73, 96, 19);
		contentPane.add(campouser);
		campouser.setColumns(10);

		campopass = new JPasswordField();
		campopass.setColumns(10);
		campopass.setBounds(158, 134, 96, 19);
		contentPane.add(campopass);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = "admin";
				String pass = "admin";
				if (campouser.getText().equals(user)) {
					if (campopass.getText().equals(pass)) {
						login.frame.setVisible(false);
						inicio.frame2.setVisible(true);
					}

				}
			}
		});
		btnEntrar.setBounds(158, 178, 85, 21);
		contentPane.add(btnEntrar);
	}

}
