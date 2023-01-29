package appmusic;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class inicio extends JFrame {
	private JPanel contentPane;
	private JTextField txtcodgrupo;
	static inicio frame2;
	static ArrayList<grupo> grupos = new ArrayList<>();
	static ArrayList<cancion> canciones = new ArrayList<>();

	public static inicio getFrame2() {
		return frame2;
	}

	public static void setFrame2(inicio frame2) {
		inicio.frame2 = frame2;
	}

	public static ArrayList<grupo> getGrupos() {
		return grupos;
	}

	public static void setGrupos(ArrayList<grupo> grupos) {
		inicio.grupos = grupos;
	}

	public static ArrayList<cancion> getCanciones() {
		return canciones;
	}

	public static void setCanciones(ArrayList<cancion> canciones) {
		inicio.canciones = canciones;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new inicio();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 448);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(210, 10, 304, 319);
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(210, 10, 304, 319);
		contentPane.add(scroll);

		JButton btnMostrarGrupos = new JButton("Mostrar Grupos");
		btnMostrarGrupos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMostrarGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File CSV = new File("grupos.csv");

				String[] espacio;
				String cadena = "";
				textArea.setText("");
				try {
					Scanner sc = new Scanner(CSV);
					while (sc.hasNext()) {
						cadena = sc.nextLine();
						espacio = cadena.split(";");
						grupos.add(new grupo(Integer.parseInt(espacio[0]), espacio[1], Integer.parseInt(espacio[2]),
								espacio[3]));
						textArea.append(espacio[1] + "\n");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("Error en boton mostrar grupos");
					System.out.println(e1);
				}

			}
		});
		btnMostrarGrupos.setBounds(48, 29, 134, 36);
		contentPane.add(btnMostrarGrupos);

		JLabel lblNewLabel = new JLabel("Codigo de Grupo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(73, 112, 109, 27);
		contentPane.add(lblNewLabel);

		txtcodgrupo = new JTextField();
		txtcodgrupo.setBounds(73, 149, 96, 19);
		contentPane.add(txtcodgrupo);
		txtcodgrupo.setColumns(10);

		JButton btnMostrarcanciones = new JButton("Ver Canciones");
		btnMostrarcanciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMostrarcanciones.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (canciones.isEmpty()) {
					File CSV = new File("canciones.csv");

					String[] espacio;
					String cadena = "";
					textArea.setText("");
					try {
						Scanner sc = new Scanner(CSV);
						while (sc.hasNext()) {
							cadena = sc.nextLine();
							espacio = cadena.split(";");
							canciones.add(new cancion(Integer.parseInt(espacio[0]), espacio[1], (espacio[2]),
									Integer.parseInt(espacio[3])));
							textArea.append(espacio[2] + "\n");
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println("Error en boton mostrar CANCIONES");
						System.out.println(e1);
					}

				}
				textArea.setText("");
				try {
					for (cancion i : canciones) {
						if (i.getCodigogrupo() == Integer.parseInt(txtcodgrupo.getText())) {
							textArea.append(i.getCancion() + "\n");
						}
					}
				} catch (Exception e2) {
					for (cancion i : canciones) {
//						if (i.getCodigogrupo() == Integer.parseInt(txtcodgrupo.getText())) {
						textArea.append(i.getCancion() + "\n");
//						}
					}
				}
			}

		});
		btnMostrarcanciones.setBounds(48, 211, 134, 36);
		contentPane.add(btnMostrarcanciones);

	}
}
