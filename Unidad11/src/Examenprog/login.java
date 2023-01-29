package Examenprog;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField password;
	static login acceso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acceso = new login();
					acceso.setVisible(true);
					login frame = new login();
					frame.setVisible(false);
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

		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 27, 88, 36);
		contentPane.add(lblNewLabel);

		user = new JTextField();
		user.setBounds(169, 27, 120, 46);
		contentPane.add(user);
		user.setColumns(10);

		password = new JTextField();
		password.setBounds(169, 122, 120, 46);
		contentPane.add(password);
		password.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 135, 125, 33);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("IDENTIFICARSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BD miconexion = BD.getInstance();
				miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521:xe");
				miconexion.setUsuario("examen");
				miconexion.setPass("examen");
				String variable1 = "";
				String variable2 = "";
				String tipousuario = "";
				try {
					ResultSet rset = miconexion
							.consultaBD("select login, password, tipo_usuario from usuarios where login = '"
									+ user.getText() + "'");
					while (rset.next()) {

						variable1 = rset.getString(1);
						variable2 = rset.getString(2);
						tipousuario = rset.getString(3);
					}
					if (variable1.equals("")) {
						System.out.println("El usuario no existe");
					} else {
						if (!variable2.equals(password.getText())) {
							System.out.println("Contraseña incorrecta");
						} else {

						}
					}

					if (variable1.equals(user.getText()) && variable2.equals(password.getText())) {
						acceso.setVisible(false);
						int opcion = 1;
						// creo el nuevo objeto de la clase grupo
						grupo g = new grupo();
						Scanner sc = new Scanner(System.in);
						do {
							System.out.println("Elija una opcion");
							System.out.println("0. Para salir de la aplicacion.");
							System.out.println("1. Dar de alta nuevo grupo en la BD.");
							System.out.println("2. Dar de baja un grupo borrando todas sus canciones.");
							System.out.println("3. Dar de baja una canción de un grupo.");
							System.out.println("4. Dar de alta canción de un grupo.");
							System.out.println(
									"5. Consultar usuarios: Donde se genera un fichero .txt con los datos de los usuarios de la aplicación.");
							System.out.println(
									"6. Generar grupos.csv: Crea un fichero csv con todos los grupos de la BD");
							System.out.println(
									"7. Generar canciones.csv: Crea un fichero csv con todos las canciones disponibles en la BD");
							opcion = Integer.parseInt(sc.nextLine());
							switch (opcion) {
							case 0: {
								System.out.println("Adios!");
								break;
							}
							case 1: {
								// 1. Dar de alta nuevo grupo en la BD
								System.out.println("Ponga un codigo de grupo");
								g.setCodigo(sc.nextLine());
								System.out.println("Escriba el nombre del grupo");
								g.setNombre(sc.nextLine());
								System.out.println("Escriba el año del grupo");
								g.setAño(sc.nextLine());
								System.out.println("Escriba el genero musical del grupo");
								g.setGenero(sc.nextLine());
								System.out.println(g);
								miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521:xe");
								miconexion.setUsuario("examen");
								miconexion.setPass("examen");
								ResultSet rset2;
								try {
									rset2 = miconexion.consultaBD(
											"INSERT INTO grupos (codigo, nombre, anio, tipo_musica) VALUES ('"
													+ g.getCodigo() + "', '" + g.getNombre() + "', '" + g.getAño()
													+ "','" + g.getGenero() + "')");
									rset = miconexion.consultaBD("commit");
									miconexion.cerrarConsulta();
								} catch (Exception e2) {
									// TODO: handle exception
									System.out.println("Error insertar grupo");
								}
								break;
							}
							case 2: {
								// 2. Dar de baja un grupo borrando todas sus canciones
								System.out.println("Escriba el nombre del grupo que desea borrar");
								g.setNombre(sc.nextLine());
								miconexion.setCadenaConexion("jdbc:oracle:thin:@localhost:1521:xe");
								miconexion.setUsuario("examen");
								miconexion.setPass("examen");
								ResultSet rset3;
								String codigogrupo = "";
								try {
									// Selecciono el codigo del grupo
									rset3 = miconexion.consultaBD(
											"SELECT codigo from grupos where nombre='" + g.getNombre() + "'");
									// asigno el codgio del grupo a la variable codigogrupo
									codigogrupo = rset.getString(1);
									System.out.println(rset.getString(1));
//									rset3 = miconexion.consultaBD(
//											"delete codigo_grupo, disco, titulo, minutos, segundos from canciones where codigo_grupo='"
//													+ codigogrupo + "'");
									rset = miconexion.consultaBD("commit");
									miconexion.cerrarConsulta();
								} catch (Exception e2) {
									// TODO: handle exception
									System.out.println(e2);
								}
								break;
							}
							case 3: {

								break;
							}
							case 4: {

								break;
							}
							case 5: {

								break;
							}
							case 6: {

								break;
							}
							case 7: {

								break;
							}
							default:
								throw new IllegalArgumentException("Unexpected value: " + opcion);
							}
						} while (opcion != 0);

					}
					miconexion.cerrarConsulta();
				} catch (Exception f) {
					System.out.println("no hay datos");
				}

			}
		});

		btnNewButton.setBounds(306, 207, 120, 46);
		contentPane.add(btnNewButton);
	}

}