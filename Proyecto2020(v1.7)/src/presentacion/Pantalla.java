package presentacion;

import logica.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import logica.*;

import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.SwingConstants;

public class Pantalla extends JFrame {
	private ControladorLogic c = new ControladorLogic();
	private JPanel contentPane;
	private JTextField textFieldCI;
	@SuppressWarnings("unused")
	private JTextField textFieldDia;
	private JTextField textFieldCI_1;
	private JTextField textFieldNombre;
	private JTextField textFieldNombre_1;
	private JTextField textFieldApellido;
	private JTextField textFieldApellido_1;
	private JTextField textFieldDia_1;
	private JTextField textFieldMes_1;
	private JTextField textFieldMail;
	private JTextField textFieldMail_1;
	private JPasswordField passwordFieldContrasenia;
	private JPasswordField passwordFieldContrasenia_1;
	private JTextField textField_6;
	private JPasswordField passwordField_1;
	private JTextField textFieldNombreMateria;
	private JTextField textFieldCodigoMateria;
	private JTextField textFieldAnioMateria;
	private JTextField textFieldMateriaProfesor;
	private JTextField textField;
	private JTextField textFieldConsultarMateriaNomCod;
	private JLabel labelCodigoMateria;
	private JTable table;
	private JTable tableListFuncionarios;
	private JTable tableListarDocentes;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_1;
	private JTable table_3;
	private JTextField textFieldInicioDiaConsInasist;
	private JTextField textFieldInicioMesConsInasist;
	private JTextField textFieldInicioAnioConsInasist;
	private JTextField textFieldFinDiaConsInasist;
	private JTextField textFieldFinMesConsInasist;
	private JTextField textFieldFinAnioConsInasist;
	private JTable table_4;
	private JTable table_5;
	private JTextField textFieldCiAlumnoExamen;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textFieldMes;
	private JTextField textFieldAnio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pantalla() {

		// cons inasist = consultar inasistencia

		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 467);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Menu");
		setJMenuBar(menuBar);
		menuBar.setVisible(false);

		JMenu mnNewMenu = new JMenu("Dar de alta");

		menuBar.add(mnNewMenu);

		JMenuItem mntmUsuario = new JMenuItem("Usuario");

		mnNewMenu.add(mntmUsuario);

		JMenuItem mntmMateria = new JMenuItem("Materia");

		mnNewMenu.add(mntmMateria);

		JMenuItem mntmInasistencia = new JMenuItem("Inasistencia");

		mnNewMenu.add(mntmInasistencia);

		JMenuItem mntmExamen = new JMenuItem("Examen");

		mnNewMenu.add(mntmExamen);

		JMenu mnNewMenu_1 = new JMenu("Listar");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Estudiantes");

		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Funcionarios");

		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Docentes");

		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmEstudiantesConPendientes = new JMenuItem("Estudiantes con pendientes");

		mnNewMenu_1.add(mntmEstudiantesConPendientes);

		JMenuItem mntmMaterias = new JMenuItem("Materias");
		mntmMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnNewMenu_1.add(mntmMaterias);

		JMenuItem mntmInasistencias = new JMenuItem("Inasistencias");

		mnNewMenu_1.add(mntmInasistencias);

		JMenuItem mntmReporteDeEstadisticas = new JMenuItem("Reporte de estadisticas");

		mnNewMenu_1.add(mntmReporteDeEstadisticas);

		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Materia");

		mnConsultar.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Usuario");

		mnConsultar.add(mntmNewMenuItem_4);

		JMenuItem mntmInasistencias_1 = new JMenuItem("Inasistencias");

		mnConsultar.add(mntmInasistencias_1);

		JButton btnLogout = new JButton("Logout");

		menuBar.add(btnLogout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		CardLayout cardLayout = new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);

		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, "panelPrincipal");

		JButton btnRegistrar = new JButton("Registrarse");
		btnRegistrar.setBounds(312, 140, 111, 31);

		panelPrincipal.setLayout(null);
		panelPrincipal.add(btnRegistrar);

		JButton btnIniciarSesion = new JButton("Iniciar sesion");

		btnIniciarSesion.setBounds(312, 198, 111, 31);
		panelPrincipal.add(btnIniciarSesion);

		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblBienvenido.setBounds(302, 65, 139, 46);
		panelPrincipal.add(lblBienvenido);

		JPanel consultarInasistenciaJTable = new JPanel();
		contentPane.add(consultarInasistenciaJTable, "consultarInasistenciaJTable");
		consultarInasistenciaJTable.setLayout(null);

		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(10, 86, 754, 314);
		consultarInasistenciaJTable.add(scrollPane_1_1);

		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, },
				new String[] { "Nombre materia", "Nombre de estudiante", "Fecha de inasistencia",
						"Tipo de inasistencia", "Cantidad de horas" }));
		scrollPane_1_1.setViewportView(table_4);

		JLabel lblListadoDeInasistencias = new JLabel("Consulta de inasistencias");
		lblListadoDeInasistencias.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListadoDeInasistencias.setBounds(79, 26, 199, 30);
		consultarInasistenciaJTable.add(lblListadoDeInasistencias);

		JButton btnAtrasConsultInasist = new JButton("Atras");

		btnAtrasConsultInasist.setBounds(359, 32, 91, 23);
		consultarInasistenciaJTable.add(btnAtrasConsultInasist);

		JPanel registrar = new JPanel();
		contentPane.add(registrar, "registrar");
		registrar.setLayout(null);

		JButton btnAtras_1 = new JButton("Atras");

		btnAtras_1.setBounds(485, 310, 89, 23);
		registrar.add(btnAtras_1);

		JLabel lblCi = new JLabel("C.I.");
		lblCi.setBounds(33, 68, 46, 14);
		registrar.add(lblCi);

		textFieldCI = new JTextField();
		textFieldCI.setBounds(164, 65, 99, 20);
		registrar.add(textFieldCI);
		textFieldCI.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(33, 104, 46, 14);
		registrar.add(lblNewLabel);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(164, 101, 99, 20);
		registrar.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(33, 149, 46, 14);
		registrar.add(lblApellido);

		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(164, 146, 99, 20);
		registrar.add(textFieldApellido);
		textFieldApellido.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_1.setBounds(32, 204, 122, 14);
		registrar.add(lblNewLabel_1);

		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(33, 251, 46, 14);
		registrar.add(lblMail);

		textFieldMail = new JTextField();
		textFieldMail.setBounds(164, 248, 156, 20);
		registrar.add(textFieldMail);
		textFieldMail.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(32, 298, 86, 14);
		registrar.add(lblContrasea);

		passwordFieldContrasenia = new JPasswordField();
		passwordFieldContrasenia.setBounds(164, 295, 156, 20);
		registrar.add(passwordFieldContrasenia);

		JLabel lblNewLabel_2 = new JLabel("Tipo de usuario");
		lblNewLabel_2.setBounds(509, 28, 99, 14);
		registrar.add(lblNewLabel_2);

		JRadioButton radioButtonEstudiante = new JRadioButton("Estudiante");

		radioButtonEstudiante.setBounds(388, 49, 109, 23);
		registrar.add(radioButtonEstudiante);

		JRadioButton radioButtonFuncionario = new JRadioButton("Funcionario");
		radioButtonFuncionario.setBounds(610, 49, 109, 23);
		registrar.add(radioButtonFuncionario);

		JRadioButton radioButtonDocente = new JRadioButton("Docente");

		radioButtonDocente.setBounds(499, 49, 109, 23);
		registrar.add(radioButtonDocente);

		JComboBox comboBoxOrientacion = new JComboBox();
		comboBoxOrientacion.setModel(new DefaultComboBoxModel(Orientacion.values()));
		comboBoxOrientacion.setBounds(464, 101, 99, 20);
		registrar.add(comboBoxOrientacion);

		JLabel lblOrientacion = new JLabel("Orientacion");
		lblOrientacion.setBounds(375, 104, 66, 14);
		registrar.add(lblOrientacion);

		JLabel lblGeneracion = new JLabel("Generacion");
		lblGeneracion.setBounds(375, 149, 66, 14);
		registrar.add(lblGeneracion);

		JComboBox comboBoxGeneracion = new JComboBox();
		comboBoxGeneracion.setModel(new DefaultComboBoxModel(Generacion.values()));
		comboBoxGeneracion.setBounds(451, 146, 99, 20);
		registrar.add(comboBoxGeneracion);

		JButton btnHecho = new JButton("Hecho");

		btnHecho.setBounds(485, 247, 89, 23);
		registrar.add(btnHecho);// */

		JPanel iniciarSesion = new JPanel();
		contentPane.add(iniciarSesion, "iniciarSesion");
		iniciarSesion.setLayout(null);

		JLabel lblCi_1 = new JLabel("C.I.");
		lblCi_1.setBounds(248, 110, 46, 14);
		iniciarSesion.add(lblCi_1);

		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setBounds(248, 149, 76, 14);
		iniciarSesion.add(lblContrasea_1);

		textField_6 = new JTextField();
		textField_6.setBounds(333, 107, 86, 20);
		iniciarSesion.add(textField_6);
		textField_6.setColumns(10);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(333, 146, 86, 20);
		iniciarSesion.add(passwordField_1);

		JButton btnAtras = new JButton("Atras");

		btnAtras.setBounds(230, 204, 89, 23);
		iniciarSesion.add(btnAtras);

		JButton btnHecho_1 = new JButton("Hecho");
		btnHecho_1.setBounds(358, 204, 89, 23);
		iniciarSesion.add(btnHecho_1);
		comboBoxGeneracion.setBounds(464, 146, 99, 20);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(585, 104, 46, 14);
		registrar.add(lblEstado);

		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(Estado.values()));
		comboBoxEstado.setBounds(641, 101, 89, 20);
		registrar.add(comboBoxEstado);

		JTextField textFieldDia = new JTextField();
		textFieldDia.setBounds(164, 201, 46, 20);
		registrar.add(textFieldDia);
		textFieldDia.setColumns(10);

		textFieldMes = new JTextField();
		textFieldMes.setBounds(220, 201, 43, 20);
		registrar.add(textFieldMes);
		textFieldMes.setColumns(10);

		textFieldAnio = new JTextField();
		textFieldAnio.setBounds(273, 201, 86, 20);
		registrar.add(textFieldAnio);
		textFieldAnio.setColumns(10);

		JPanel darDeAltaExamen = new JPanel();
		contentPane.add(darDeAltaExamen, "panelDarDeAltaExamen");
		darDeAltaExamen.setLayout(null);

		JLabel lblIngreseCiDel = new JLabel("Ingrese C.I. del alumno");
		lblIngreseCiDel.setBounds(139, 113, 174, 22);
		darDeAltaExamen.add(lblIngreseCiDel);

		JLabel lblIngreseFechaDel = new JLabel("Ingrese fecha del examen");
		lblIngreseFechaDel.setBounds(139, 159, 174, 22);
		darDeAltaExamen.add(lblIngreseFechaDel);

		textFieldCiAlumnoExamen = new JTextField();
		textFieldCiAlumnoExamen.setBounds(323, 114, 86, 20);
		darDeAltaExamen.add(textFieldCiAlumnoExamen);
		textFieldCiAlumnoExamen.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(323, 160, 35, 20);
		darDeAltaExamen.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(368, 160, 35, 20);
		darDeAltaExamen.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(413, 160, 66, 20);
		darDeAltaExamen.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNota = new JLabel("Nota");
		lblNota.setBounds(139, 205, 46, 14);
		darDeAltaExamen.add(lblNota);

		textField_5 = new JTextField();
		textField_5.setBounds(323, 202, 35, 20);
		darDeAltaExamen.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblMateria = new JLabel("Materia");
		lblMateria.setBounds(139, 238, 46, 14);
		darDeAltaExamen.add(lblMateria);

		textField_7 = new JTextField();
		textField_7.setBounds(323, 235, 86, 20);
		darDeAltaExamen.add(textField_7);
		textField_7.setColumns(10);

		JButton btnHechoAltaExamen = new JButton("Hecho");
		btnHechoAltaExamen.setBounds(320, 294, 89, 23);
		darDeAltaExamen.add(btnHechoAltaExamen);

		JPanel darDeAltaUsuario = new JPanel();
		contentPane.add(darDeAltaUsuario, "darDeAltaUsuario");
		darDeAltaUsuario.setLayout(null);

		JLabel lblCi_2 = new JLabel("C.I.");
		lblCi_2.setBounds(49, 76, 56, 14);
		darDeAltaUsuario.add(lblCi_2);

		textFieldCI_1 = new JTextField();
		textFieldCI_1.setBounds(184, 73, 86, 20);
		darDeAltaUsuario.add(textFieldCI_1);
		textFieldCI_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(49, 107, 56, 14);
		darDeAltaUsuario.add(lblNewLabel_3);

		textFieldNombre_1 = new JTextField();
		textFieldNombre_1.setBounds(184, 107, 86, 20);
		darDeAltaUsuario.add(textFieldNombre_1);
		textFieldNombre_1.setColumns(10);

		JLabel lblApellido_1 = new JLabel("Apellido");
		lblApellido_1.setBounds(49, 146, 56, 14);
		darDeAltaUsuario.add(lblApellido_1);

		textFieldApellido_1 = new JTextField();
		textFieldApellido_1.setBounds(184, 143, 86, 20);
		darDeAltaUsuario.add(textFieldApellido_1);
		textFieldApellido_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_4.setBounds(49, 222, 125, 14);
		darDeAltaUsuario.add(lblNewLabel_4);

		textFieldDia_1 = new JTextField();
		textFieldDia_1.setBounds(184, 219, 25, 20);
		darDeAltaUsuario.add(textFieldDia_1);
		textFieldDia_1.setColumns(10);

		textFieldMes_1 = new JTextField();
		textFieldMes_1.setBounds(219, 219, 25, 20);
		darDeAltaUsuario.add(textFieldMes_1);
		textFieldMes_1.setColumns(10);

		JTextField textFieldAnio_1 = new JTextField();
		textFieldAnio_1.setBounds(254, 219, 59, 20);
		darDeAltaUsuario.add(textFieldAnio_1);
		textFieldAnio_1.setColumns(10);

		JLabel lblMail_1 = new JLabel("Mail");
		lblMail_1.setBounds(50, 268, 55, 14);
		darDeAltaUsuario.add(lblMail_1);

		textFieldMail_1 = new JTextField();
		textFieldMail_1.setBounds(184, 265, 86, 20);
		darDeAltaUsuario.add(textFieldMail_1);
		textFieldMail_1.setColumns(10);

		JLabel lblContrasenia = new JLabel("Contrase\u00F1a");
		lblContrasenia.setBounds(49, 173, 75, 14);
		darDeAltaUsuario.add(lblContrasenia);

		passwordFieldContrasenia_1 = new JPasswordField();
		passwordFieldContrasenia_1.setBounds(184, 170, 86, 20);
		darDeAltaUsuario.add(passwordFieldContrasenia_1);

		JLabel lblNewLabel_5 = new JLabel("Tipo de usuario");
		lblNewLabel_5.setBounds(372, 37, 97, 14);
		darDeAltaUsuario.add(lblNewLabel_5);

		JRadioButton radioButtonEstudiante_1 = new JRadioButton("Estudiante");

		radioButtonEstudiante_1.setBounds(460, 33, 92, 23);
		darDeAltaUsuario.add(radioButtonEstudiante_1);

		JRadioButton radioButtonFuncionario_1 = new JRadioButton("Funcionario");
		radioButtonFuncionario_1.setBounds(554, 33, 97, 23);
		darDeAltaUsuario.add(radioButtonFuncionario_1);

		JRadioButton radioButtonDocente_1 = new JRadioButton("Docente");

		radioButtonDocente_1.setBounds(653, 33, 86, 23);
		darDeAltaUsuario.add(radioButtonDocente_1);

		JComboBox comboBoxOrientacion_1 = new JComboBox();
		comboBoxOrientacion_1.setModel(new DefaultComboBoxModel(Orientacion.values()));
		comboBoxOrientacion_1.setBounds(460, 143, 92, 20);
		darDeAltaUsuario.add(comboBoxOrientacion_1);

		JLabel lblOrientacion_1 = new JLabel("Orientacion");
		lblOrientacion_1.setBounds(372, 146, 75, 14);
		darDeAltaUsuario.add(lblOrientacion_1);

		JLabel lblGeneracion_1 = new JLabel("Generacion");
		lblGeneracion_1.setBounds(372, 107, 75, 14);
		darDeAltaUsuario.add(lblGeneracion_1);

		JButton btnHecho_3 = new JButton("Hecho");

		btnHecho_3.setBounds(507, 242, 83, 23);
		darDeAltaUsuario.add(btnHecho_3);

		JComboBox comboBoxGeneracion_1 = new JComboBox();
		comboBoxGeneracion_1.setBounds(460, 104, 92, 20);
		comboBoxGeneracion_1.setModel(new DefaultComboBoxModel(Generacion.values()));
		darDeAltaUsuario.add(comboBoxGeneracion_1);

		JLabel lblDarDeAlta = new JLabel("Dar de alta usuario");
		lblDarDeAlta.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDarDeAlta.setBounds(49, 28, 195, 23);
		darDeAltaUsuario.add(lblDarDeAlta);

		JLabel lblEstado_1 = new JLabel("Estado");
		lblEstado_1.setBounds(575, 107, 46, 14);
		darDeAltaUsuario.add(lblEstado_1);

		JComboBox comboBoxEstado_1 = new JComboBox();
		comboBoxEstado_1.setModel(new DefaultComboBoxModel(Estado.values()));
		comboBoxEstado_1.setBounds(631, 104, 108, 20);
		darDeAltaUsuario.add(comboBoxEstado_1);

		JPanel darDeAltaMateria = new JPanel();
		contentPane.add(darDeAltaMateria, "darDeAltaMateria");
		darDeAltaMateria.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Nombre");
		lblNewLabel_6.setBounds(140, 104, 77, 14);
		darDeAltaMateria.add(lblNewLabel_6);

		textFieldNombreMateria = new JTextField();
		textFieldNombreMateria.setBounds(298, 101, 86, 20);
		darDeAltaMateria.add(textFieldNombreMateria);
		textFieldNombreMateria.setColumns(10);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(140, 157, 53, 14);
		darDeAltaMateria.add(lblCodigo);

		textFieldCodigoMateria = new JTextField();
		textFieldCodigoMateria.setBounds(298, 154, 86, 20);
		darDeAltaMateria.add(textFieldCodigoMateria);
		textFieldCodigoMateria.setColumns(10);

		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(140, 205, 46, 14);
		darDeAltaMateria.add(lblAo);

		textFieldAnioMateria = new JTextField();
		textFieldAnioMateria.setBounds(298, 202, 86, 20);
		darDeAltaMateria.add(textFieldAnioMateria);
		textFieldAnioMateria.setColumns(10);

		JButton btnGuardarMateria = new JButton("Guardar");
		btnGuardarMateria.setBounds(298, 304, 89, 23);
		darDeAltaMateria.add(btnGuardarMateria);

		JLabel lblProfesor = new JLabel("Profesor");
		lblProfesor.setBounds(140, 250, 63, 14);
		darDeAltaMateria.add(lblProfesor);

		textFieldMateriaProfesor = new JTextField();
		textFieldMateriaProfesor.setBounds(298, 250, 86, 20);
		darDeAltaMateria.add(textFieldMateriaProfesor);
		textFieldMateriaProfesor.setColumns(10);

		JLabel lblDarDeAlta_1 = new JLabel("Dar de alta una materia");
		lblDarDeAlta_1.setBounds(251, 38, 133, 23);
		darDeAltaMateria.add(lblDarDeAlta_1);

		JPanel darDeAltaInasistencia_2 = new JPanel();
		contentPane.add(darDeAltaInasistencia_2, "panelAltaInasistJtable");
		darDeAltaInasistencia_2.setLayout(null);

		JLabel lblIngreseCodigoDe = new JLabel("Ingrese codigo de materia");
		lblIngreseCodigoDe.setBounds(10, 11, 161, 25);
		darDeAltaInasistencia_2.add(lblIngreseCodigoDe);

		textField_1 = new JTextField();
		textField_1.setBounds(178, 13, 86, 20);
		darDeAltaInasistencia_2.add(textField_1);
		textField_1.setColumns(10);

		JButton btnHechoAltaInasistencia = new JButton("Hecho");

		btnHechoAltaInasistencia.setBounds(173, 55, 91, 23);
		darDeAltaInasistencia_2.add(btnHechoAltaInasistencia);

		JButton btnAtras_2 = new JButton("Atras");

		btnAtras_2.setBounds(20, 55, 91, 23);
		darDeAltaInasistencia_2.add(btnAtras_2);

		JScrollPane scrollPaneAltaInasist = new JScrollPane();
		scrollPaneAltaInasist.setBounds(10, 89, 754, 313);
		darDeAltaInasistencia_2.add(scrollPaneAltaInasist);
		scrollPaneAltaInasist.setVisible(false);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(new Object[][] { { null, null, null, Boolean.FALSE }, }, new String[] {
				"Nombre alumno", "Cantidad de horas inasistidas", "Tipo de inasistencia", "Inasistencia" }) {
			Class[] columnTypes = new Class[] { Object.class, Object.class, Object.class, Boolean.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPaneAltaInasist.setViewportView(table_3);

		JPanel consultarInasistencia = new JPanel();
		contentPane.add(consultarInasistencia, "panelConsultarInasistencia");
		consultarInasistencia.setLayout(null);

		JLabel lblIngreseFechaDe = new JLabel("Ingrese fecha de inicio");
		lblIngreseFechaDe.setBounds(77, 115, 155, 14);
		consultarInasistencia.add(lblIngreseFechaDe);

		JLabel lblIngreseFechaDe_1 = new JLabel("Ingrese fecha de fin");
		lblIngreseFechaDe_1.setBounds(77, 177, 155, 14);
		consultarInasistencia.add(lblIngreseFechaDe_1);

		textFieldInicioDiaConsInasist = new JTextField();
		textFieldInicioDiaConsInasist.setBounds(259, 112, 43, 20);
		consultarInasistencia.add(textFieldInicioDiaConsInasist);
		textFieldInicioDiaConsInasist.setColumns(10);

		textFieldInicioMesConsInasist = new JTextField();
		textFieldInicioMesConsInasist.setColumns(10);
		textFieldInicioMesConsInasist.setBounds(313, 112, 43, 20);
		consultarInasistencia.add(textFieldInicioMesConsInasist);

		textFieldInicioAnioConsInasist = new JTextField();
		textFieldInicioAnioConsInasist.setColumns(10);
		textFieldInicioAnioConsInasist.setBounds(366, 112, 86, 20);
		consultarInasistencia.add(textFieldInicioAnioConsInasist);

		textFieldFinDiaConsInasist = new JTextField();
		textFieldFinDiaConsInasist.setColumns(10);
		textFieldFinDiaConsInasist.setBounds(259, 174, 43, 20);
		consultarInasistencia.add(textFieldFinDiaConsInasist);

		textFieldFinMesConsInasist = new JTextField();
		textFieldFinMesConsInasist.setColumns(10);
		textFieldFinMesConsInasist.setBounds(313, 174, 43, 20);
		consultarInasistencia.add(textFieldFinMesConsInasist);

		textFieldFinAnioConsInasist = new JTextField();
		textFieldFinAnioConsInasist.setColumns(10);
		textFieldFinAnioConsInasist.setBounds(366, 174, 86, 20);
		consultarInasistencia.add(textFieldFinAnioConsInasist);

		JButton btnHechoConsInasist = new JButton("Hecho");

		btnHechoConsInasist.setBounds(259, 245, 91, 23);
		consultarInasistencia.add(btnHechoConsInasist);

		JLabel lblConsultarInasistencia = new JLabel("Consultar inasistencia");
		lblConsultarInasistencia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConsultarInasistencia.setBounds(77, 33, 165, 35);
		consultarInasistencia.add(lblConsultarInasistencia);

		JPanel darDeAltaInasistencia = new JPanel();
		contentPane.add(darDeAltaInasistencia, "darDeAltaInasistencia");
		darDeAltaInasistencia.setLayout(null);

		JLabel lblNewLabel_8 = new JLabel("Seleccione un grupo");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(49, 38, 290, 23);
		darDeAltaInasistencia.add(lblNewLabel_8);

		JButton btnTic_1 = new JButton("1\u00B0 TIC");

		btnTic_1.setBounds(180, 118, 91, 23);
		darDeAltaInasistencia.add(btnTic_1);

		JButton btnTic_2 = new JButton("2\u00B0 TIC");

		btnTic_2.setBounds(180, 187, 91, 23);
		darDeAltaInasistencia.add(btnTic_2);

		JButton btnTic_3 = new JButton("3\u00B0 TIC");
		btnTic_3.setBounds(180, 254, 91, 23);
		darDeAltaInasistencia.add(btnTic_3);

		JButton btnAdm_1 = new JButton("1\u00B0 ADM");
		btnAdm_1.setBounds(407, 118, 91, 23);
		darDeAltaInasistencia.add(btnAdm_1);

		JButton btnAdm_2 = new JButton("2\u00B0 ADM");
		btnAdm_2.setBounds(407, 187, 91, 23);
		darDeAltaInasistencia.add(btnAdm_2);

		JButton btnAdm_3 = new JButton("3\u00B0 ADM");
		btnAdm_3.setBounds(407, 254, 91, 23);
		darDeAltaInasistencia.add(btnAdm_3);

		JPanel consultarUsuario = new JPanel();
		contentPane.add(consultarUsuario, "consultarUsuario");
		consultarUsuario.setLayout(null);

		JLabel lblCi_3 = new JLabel("C.I.");
		lblCi_3.setBounds(74, 79, 46, 14);
		consultarUsuario.add(lblCi_3);

		textField = new JTextField();
		textField.setBounds(130, 76, 86, 20);
		consultarUsuario.add(textField);
		textField.setColumns(10);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(130, 107, 89, 23);
		consultarUsuario.add(btnConsultar);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(311, 79, 57, 14);
		consultarUsuario.add(lblNombre);

		JLabel lblApellido_2 = new JLabel("Apellido:");
		lblApellido_2.setBounds(311, 116, 70, 14);
		consultarUsuario.add(lblApellido_2);

		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(311, 152, 134, 14);
		consultarUsuario.add(lblFechaDeNacimiento);

		JLabel lblMail_2 = new JLabel("Mail:");
		lblMail_2.setBounds(311, 190, 46, 14);
		consultarUsuario.add(lblMail_2);

		JLabel lblOrientacion_2 = new JLabel("Orientacion:");
		lblOrientacion_2.setBounds(311, 230, 86, 14);
		consultarUsuario.add(lblOrientacion_2);

		JLabel lblGeneracion_2 = new JLabel("Generacion:");
		lblGeneracion_2.setBounds(311, 273, 70, 14);
		consultarUsuario.add(lblGeneracion_2);

		JLabel labelNombre = new JLabel("");
		labelNombre.setBounds(455, 79, 89, 14);
		consultarUsuario.add(labelNombre);

		JLabel label = new JLabel("");
		label.setBounds(455, 116, 89, 14);
		consultarUsuario.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(455, 152, 89, 14);
		consultarUsuario.add(label_1);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(455, 190, 89, 14);
		consultarUsuario.add(lblNewLabel_7);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(455, 230, 89, 14);
		consultarUsuario.add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(455, 273, 89, 14);
		consultarUsuario.add(label_3);

		JPanel consultarMateria = new JPanel();
		contentPane.add(consultarMateria, "consultarMateria");
		consultarMateria.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Consultar materia");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(10, 11, 155, 22);
		consultarMateria.add(lblNewLabel_9);

		JLabel lblNombreOCodigo = new JLabel("Nombre o codigo");
		lblNombreOCodigo.setBounds(162, 88, 103, 14);
		consultarMateria.add(lblNombreOCodigo);

		textFieldConsultarMateriaNomCod = new JTextField();
		textFieldConsultarMateriaNomCod.setBounds(270, 85, 91, 20);
		consultarMateria.add(textFieldConsultarMateriaNomCod);
		textFieldConsultarMateriaNomCod.setColumns(10);

		JButton btnHechoConsMateria = new JButton("Hecho");
		btnHechoConsMateria.setBounds(270, 134, 91, 23);
		consultarMateria.add(btnHechoConsMateria);

		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(412, 88, 57, 14);
		consultarMateria.add(lblNombre_1);

		JLabel lblCodigo_1 = new JLabel("Codigo:");
		lblCodigo_1.setBounds(412, 127, 46, 14);
		consultarMateria.add(lblCodigo_1);

		JLabel lblNewLabel_10 = new JLabel("Orientacion:");
		lblNewLabel_10.setBounds(412, 166, 76, 14);
		consultarMateria.add(lblNewLabel_10);

		JLabel lblGeneracion_3 = new JLabel("Generacion:");
		lblGeneracion_3.setBounds(412, 204, 76, 14);
		consultarMateria.add(lblGeneracion_3);

		JLabel lblNewLabel_11 = new JLabel("Cantidad de inscriptos:");
		lblNewLabel_11.setBounds(412, 243, 136, 14);
		consultarMateria.add(lblNewLabel_11);

		JLabel labelNombreMateria = new JLabel("");
		labelNombreMateria.setBounds(549, 88, 91, 14);
		consultarMateria.add(labelNombreMateria);

		labelCodigoMateria = new JLabel("");
		labelCodigoMateria.setBounds(549, 138, 91, 14);
		consultarMateria.add(labelCodigoMateria);

		JLabel labelOrientacionMateria = new JLabel("");
		labelOrientacionMateria.setBounds(549, 166, 91, 14);
		consultarMateria.add(labelOrientacionMateria);

		JLabel labelGeneracionMateria = new JLabel("");
		labelGeneracionMateria.setBounds(549, 204, 91, 14);
		consultarMateria.add(labelGeneracionMateria);

		JLabel labelCantInscriptosMateria = new JLabel("");
		labelCantInscriptosMateria.setBounds(550, 243, 90, 14);
		consultarMateria.add(labelCantInscriptosMateria);

		JPanel listarEstudiantes = new JPanel();
		contentPane.add(listarEstudiantes, "listarEstudiantes");

		JLabel lblNewLabel_12 = new JLabel("Listar estudiantes");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JScrollPane scrollPane = new JScrollPane();

		JButton btnFiltrar = new JButton("Filtrar");

		GroupLayout gl_listarEstudiantes = new GroupLayout(listarEstudiantes);
		gl_listarEstudiantes.setHorizontalGroup(gl_listarEstudiantes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listarEstudiantes.createSequentialGroup().addGap(10)
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnFiltrar).addContainerGap())
				.addGroup(Alignment.TRAILING, gl_listarEstudiantes.createSequentialGroup().addGap(20)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)));
		gl_listarEstudiantes.setVerticalGroup(gl_listarEstudiantes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listarEstudiantes.createSequentialGroup().addGap(11)
						.addGroup(gl_listarEstudiantes.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 28,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnFiltrar))
						.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, },
				new String[] { "Nombre", "Apellido", "C.I.", "Generacion", "Orientacion", "Mail", "Nacimiento" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(6).setPreferredWidth(78);
		scrollPane.setViewportView(table);
		listarEstudiantes.setLayout(gl_listarEstudiantes);

		JPanel panelFiltrarEstudiantes = new JPanel();
		contentPane.add(panelFiltrarEstudiantes, "panelFiltrarEstudiantes");
		panelFiltrarEstudiantes.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("Filtre por generacion u orientacion");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(241, 72, 271, 29);
		panelFiltrarEstudiantes.add(lblNewLabel_13);

		JComboBox comboBoxFiltrarOri = new JComboBox();
		comboBoxFiltrarOri.setModel(new DefaultComboBoxModel(Orientacion.values()));
		comboBoxFiltrarOri.setBounds(401, 133, 91, 22);
		panelFiltrarEstudiantes.add(comboBoxFiltrarOri);

		JComboBox comboBoxFiltrarGen = new JComboBox();
		comboBoxFiltrarGen.setModel(new DefaultComboBoxModel(Generacion.values()));
		comboBoxFiltrarGen.setBounds(241, 133, 91, 22);
		panelFiltrarEstudiantes.add(comboBoxFiltrarGen);

		JButton btnHechoFiltrar = new JButton("Hecho");
		btnHechoFiltrar.setFont(new Font("Tahoma", Font.PLAIN, 11));

		btnHechoFiltrar.setBounds(241, 193, 91, 23);
		panelFiltrarEstudiantes.add(btnHechoFiltrar);

		JButton btnCancelarFiltrar = new JButton("Cancelar");

		btnCancelarFiltrar.setBounds(401, 193, 91, 23);
		panelFiltrarEstudiantes.add(btnCancelarFiltrar);

		JPanel reporteEstadisticas = new JPanel();
		contentPane.add(reporteEstadisticas, "panelEstadisticas");
		reporteEstadisticas.setLayout(null);

		JLabel lblIndice = new JLabel("Indice de inasistencias:");
		lblIndice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIndice.setBounds(130, 110, 246, 27);
		reporteEstadisticas.add(lblIndice);

		JLabel labelIndInasistencias = new JLabel("");
		labelIndInasistencias.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelIndInasistencias.setBounds(419, 110, 90, 27);
		reporteEstadisticas.add(labelIndInasistencias);

		JLabel lblMateriaConMas = new JLabel("Materia con mas inasistencias:");
		lblMateriaConMas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMateriaConMas.setBounds(130, 181, 246, 27);
		reporteEstadisticas.add(lblMateriaConMas);

		JLabel labelMatMasInasist = new JLabel("");
		labelMatMasInasist.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelMatMasInasist.setBounds(419, 181, 90, 27);
		reporteEstadisticas.add(labelMatMasInasist);

		JPanel listarInasistenciasJTable = new JPanel();
		contentPane.add(listarInasistenciasJTable, "panelListarInasistenciasJTable");
		listarInasistenciasJTable.setLayout(null);

		JScrollPane scrollPaneListarMaterias_1 = new JScrollPane();
		scrollPaneListarMaterias_1.setBounds(63, 75, 630, 325);
		listarInasistenciasJTable.add(scrollPaneListarMaterias_1);

		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "Materia", "Nombre del alumno", "Fecha de inasistencia", "Tipo de inasistencia" }));
		scrollPaneListarMaterias_1.setViewportView(table_5);

		JLabel lblListadoDeInasistencias_1 = new JLabel("Listado de inasistencias");
		lblListadoDeInasistencias_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListadoDeInasistencias_1.setBounds(41, 28, 209, 26);
		listarInasistenciasJTable.add(lblListadoDeInasistencias_1);

		JButton btnAtrasListInasist = new JButton("Atras");

		btnAtrasListInasist.setBounds(321, 32, 91, 23);
		listarInasistenciasJTable.add(btnAtrasListInasist);

		JPanel listarInasistencias = new JPanel();
		contentPane.add(listarInasistencias, "panelListarInasistencias");
		listarInasistencias.setLayout(null);

		JLabel lblSeleccioneOrientacion = new JLabel("Seleccione orientacion:");
		lblSeleccioneOrientacion.setBounds(92, 118, 142, 23);
		listarInasistencias.add(lblSeleccioneOrientacion);

		JLabel lblSeleccioneGeneracion = new JLabel("Seleccione generacion:");
		lblSeleccioneGeneracion.setBounds(92, 197, 142, 23);
		listarInasistencias.add(lblSeleccioneGeneracion);

		JComboBox comboBoxOrientacionListInasist = new JComboBox();
		comboBoxOrientacionListInasist.setModel(new DefaultComboBoxModel(Orientacion.values()));
		comboBoxOrientacionListInasist.setBounds(319, 118, 84, 22);
		listarInasistencias.add(comboBoxOrientacionListInasist);

		JComboBox comboBoxGeneracionListInasist = new JComboBox();
		comboBoxGeneracionListInasist.setModel(new DefaultComboBoxModel(Generacion.values()));
		comboBoxGeneracionListInasist.setBounds(319, 197, 84, 22);
		listarInasistencias.add(comboBoxGeneracionListInasist);

		JButton btnHechoListInasist = new JButton("Hecho");

		btnHechoListInasist.setBounds(258, 269, 91, 23);
		listarInasistencias.add(btnHechoListInasist);

		JLabel lblFiltreElListado = new JLabel("Filtre el listado de las inasistencias");
		lblFiltreElListado.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblFiltreElListado.setBounds(77, 46, 272, 31);
		listarInasistencias.add(lblFiltreElListado);

		JPanel listarDocentes = new JPanel();
		contentPane.add(listarDocentes, "panelListarDocentes");
		listarDocentes.setLayout(null);

		JScrollPane scrollPaneListarDocentes = new JScrollPane();
		scrollPaneListarDocentes.setBounds(0, 61, 774, 346);
		listarDocentes.add(scrollPaneListarDocentes);

		tableListarDocentes = new JTable();
		tableListarDocentes.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, },
				new String[] { "Nombre", "Apellido", "C.I.", "Mail", "Nacimiento" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPaneListarDocentes.setViewportView(tableListarDocentes);

		JLabel lblListarDocentes = new JLabel("Listar docentes");
		lblListarDocentes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListarDocentes.setBounds(10, 11, 126, 39);
		listarDocentes.add(lblListarDocentes);

		JPanel listarMaterias = new JPanel();
		contentPane.add(listarMaterias, "panelListarMaterias");
		listarMaterias.setLayout(null);

		JScrollPane scrollPaneListarMaterias = new JScrollPane();
		scrollPaneListarMaterias.setBounds(220, 82, 511, 325);
		listarMaterias.add(scrollPaneListarMaterias);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, },
						new String[] { "Nombre", "Codigo", "A\u00F1o", "Profesor" }) {
					Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
		scrollPaneListarMaterias.setViewportView(table_1);

		JLabel lblListarMaterias = new JLabel("Listar materias");
		lblListarMaterias.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblListarMaterias.setBounds(45, 82, 124, 40);
		listarMaterias.add(lblListarMaterias);

		JPanel listarEstudiantesConPend = new JPanel();
		contentPane.add(listarEstudiantesConPend, "panelEstudiantesConPend");
		listarEstudiantesConPend.setLayout(null);

		JScrollPane scrollPane_3_1 = new JScrollPane();
		scrollPane_3_1.setBounds(253, 71, 511, 325);
		listarEstudiantesConPend.add(scrollPane_3_1);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "Nombre", "C.I.", "Materia" }));
		scrollPane_3_1.setViewportView(table_2);

		JLabel lblEstudiantesConPendientes = new JLabel("Estudiantes con pendientes");
		lblEstudiantesConPendientes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstudiantesConPendientes.setBounds(23, 48, 189, 30);
		listarEstudiantesConPend.add(lblEstudiantesConPendientes);

		JPanel listarFuncionarios = new JPanel();
		contentPane.add(listarFuncionarios, "panelListarFuncionarios");
		listarFuncionarios.setLayout(null);

		JLabel lblListarEstudiantes = new JLabel("Listar funcionarios");
		lblListarEstudiantes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListarEstudiantes.setBounds(10, 11, 186, 35);
		listarFuncionarios.add(lblListarEstudiantes);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 57, 774, 350);
		listarFuncionarios.add(scrollPane_1);

		tableListFuncionarios = new JTable();
		tableListFuncionarios.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, },
				new String[] { "Nombre", "Apellido", "C.I.", "Mail", "Nacimiento" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(tableListFuncionarios);

		comboBoxGeneracion_1.setVisible(false);
		comboBoxOrientacion_1.setVisible(false);
		lblEstado_1.setVisible(false);
		lblOrientacion_1.setVisible(false);
		lblGeneracion_1.setVisible(false);
		comboBoxEstado_1.setVisible(false);
		// Radio button estudiante DAR DE ALTA
		radioButtonEstudiante_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonEstudiante_1.isSelected()) {
					lblOrientacion_1.setVisible(true);
					lblGeneracion_1.setVisible(true);
					comboBoxGeneracion_1.setVisible(true);
					comboBoxOrientacion_1.setVisible(true);
					radioButtonFuncionario_1.setSelected(false);
					radioButtonDocente_1.setSelected(false);
					radioButtonEstudiante_1.setSelected(true);
					comboBoxEstado_1.setVisible(true);
					lblEstado_1.setVisible(true);

				} else {
					comboBoxGeneracion_1.setVisible(false);
					comboBoxOrientacion_1.setVisible(false);
					lblOrientacion_1.setVisible(false);
					lblGeneracion_1.setVisible(false);
					lblEstado_1.setVisible(false);
					comboBoxEstado_1.setVisible(false);
				}
			}
		});
		// radio button docente
		radioButtonDocente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonDocente_1.isSelected()) {
					comboBoxGeneracion_1.setVisible(false);
					comboBoxOrientacion_1.setVisible(false);
					lblOrientacion_1.setVisible(false);
					lblGeneracion_1.setVisible(false);
					radioButtonDocente_1.setSelected(true);
					radioButtonEstudiante_1.setSelected(false);
					radioButtonFuncionario_1.setSelected(false);
					lblEstado_1.setVisible(false);
					comboBoxEstado_1.setVisible(false);
				}
			}
		});
		// radio button funcionario
		radioButtonFuncionario_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonFuncionario_1.isSelected()) {
					comboBoxGeneracion_1.setVisible(false);
					comboBoxOrientacion_1.setVisible(false);
					lblOrientacion_1.setVisible(false);
					lblGeneracion_1.setVisible(false);
					radioButtonDocente_1.setSelected(false);
					radioButtonEstudiante_1.setSelected(false);
					radioButtonFuncionario_1.setSelected(true);
					lblEstado_1.setVisible(false);
					comboBoxEstado_1.setVisible(false);
				}
			}
		});

		// RADIO BUTTONS REGISTRAR

		comboBoxGeneracion.setVisible(false);
		comboBoxOrientacion.setVisible(false);
		comboBoxEstado.setVisible(false);
		lblOrientacion.setVisible(false);
		lblGeneracion.setVisible(false);
		lblEstado.setVisible(false);

		radioButtonEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonEstudiante.isSelected()) {
					lblOrientacion.setVisible(true);
					lblGeneracion.setVisible(true);
					comboBoxGeneracion.setVisible(true);
					comboBoxOrientacion.setVisible(true);
					radioButtonFuncionario.setSelected(false);
					radioButtonDocente.setSelected(false);
					radioButtonEstudiante.setSelected(true);
					lblEstado.setVisible(true);
					comboBoxEstado.setVisible(true);

				} else {
					comboBoxGeneracion.setVisible(false);
					comboBoxOrientacion.setVisible(false);
					lblOrientacion.setVisible(false);
					lblGeneracion.setVisible(false);
					lblEstado_1.setVisible(false);
					lblEstado.setVisible(false);
					comboBoxEstado.setVisible(false);
				}
			}
		});

		radioButtonDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonDocente.isSelected()) {
					comboBoxGeneracion.setVisible(false);
					comboBoxOrientacion.setVisible(false);
					lblOrientacion.setVisible(false);
					lblGeneracion.setVisible(false);
					radioButtonDocente.setSelected(true);
					radioButtonEstudiante.setSelected(false);
					radioButtonFuncionario.setSelected(false);
					lblEstado.setVisible(false);
					comboBoxEstado.setVisible(false);
				}
			}
		});

		radioButtonFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonFuncionario.isSelected()) {
					comboBoxGeneracion.setVisible(false);
					comboBoxOrientacion.setVisible(false);
					lblOrientacion.setVisible(false);
					lblGeneracion.setVisible(false);
					radioButtonDocente.setSelected(false);
					radioButtonEstudiante.setSelected(false);
					radioButtonFuncionario.setSelected(true);
					lblEstado.setVisible(false);
					comboBoxEstado.setVisible(false);
				}
			}
		});
		//
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if (pantallaPrincipal.setVisible(true)) {

			}
		});
		// Boton registrar
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "registrar");
			}
		});
		// botones atras
		btnAtras_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelPrincipal");
				radioButtonEstudiante.setSelected(false);
				radioButtonFuncionario.setSelected(false);
				radioButtonDocente.setSelected(false);
				comboBoxOrientacion.setVisible(false);
				comboBoxGeneracion.setVisible(false);
				comboBoxEstado.setVisible(false);
				lblOrientacion.setVisible(false);
				lblEstado.setVisible(false);
				lblGeneracion.setVisible(false);
				vaciarCampos();

			}

			private void vaciarCampos() {
				// TODO Auto-generated method stub
				textFieldCI.setText("");
				passwordFieldContrasenia.setText("");
				textFieldNombre.setText("");
				textFieldApellido.setText("");
				textFieldMail.setText("");
				textFieldDia.setText("");
				textFieldMes.setText("");
				textFieldAnio.setText("");
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelPrincipal");
			}
		});
		// boton iniciar sesion
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayout.show(contentPane, "iniciarSesion");
			}
		});
		// botones hecho
		btnHecho.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				int dia;
				int mes;
				int anio;

				/*
				 * if (textFieldCI.getText() == "" && passwordFieldContrasenia.getText() == ""
				 * && textFieldNombre.getText() == "" && textFieldApellido.getText() == "" &&
				 * textFieldMail.getText() == "" && textFieldDia.getText() == "" &&
				 * textFieldMes.getText() == "" && textFieldAnio.getText() == "") {
				 * 
				 * JOptionPane.showMessageDialog(null,
				 * "Ingrese valores a los respectivos campos");
				 * 
				 * } else {
				 */

				try {
					dia = Integer.parseInt(textFieldDia.getText());
					mes = Integer.parseInt(textFieldMes.getText());
					anio = Integer.parseInt(textFieldAnio.getText());

					Usuario usuario;

					if (radioButtonEstudiante.isSelected()) {

						usuario = new Estudiante(textFieldCI.getText(), passwordFieldContrasenia.getText(),
								textFieldNombre.getText(), textFieldApellido.getText(), textFieldMail.getText(),
								LocalDate.of(anio, mes, dia),
								Orientacion.valueOf(comboBoxOrientacion.getSelectedItem().toString()),
								Estado.valueOf(comboBoxEstado.getSelectedItem().toString()),
								Generacion.valueOf(comboBoxGeneracion.getSelectedItem().toString()));
						c.altaUsuario(usuario);

						System.out.println("Nombre estudiante: " + textFieldNombre.getText());
						JOptionPane.showMessageDialog(null, "Funcionario creado con exito");
					} else if (radioButtonDocente.isSelected()) {

						usuario = new Docente(textFieldCI.getText(), passwordFieldContrasenia.getText(),
								textFieldNombre.getText(), textFieldApellido.getText(), textFieldMail.getText(),
								LocalDate.of(anio, mes, dia), TipoUsuario.DOCENTE);
						c.altaUsuario(usuario);
						System.out.println("Nombre docente: " + textFieldNombre.getText());
						JOptionPane.showMessageDialog(null, "Docente creado con exito");
					} else if (radioButtonFuncionario.isSelected()) {

						usuario = new Funcionario(textFieldCI.getText(), passwordFieldContrasenia.getText(),
								textFieldNombre.getText(), textFieldApellido.getText(), textFieldMail.getText(),
								LocalDate.of(anio, mes, dia), TipoUsuario.FUNCIONARIO);

						c.altaUsuario(usuario);

						JOptionPane.showMessageDialog(null, "Funcionario creado con exito");
						System.out.println("Nombre funcionario: " + textFieldNombre.getText());
					} else {
						JOptionPane.showMessageDialog(null, "Seleccione el tipo de usuario");
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Los valores ingresados son incorrectos");
					// e2.printStackTrace();

				}
				/*
				 * menuBar.setVisible(true); cardLayout.show(contentPane, "darDeAltaUsuario");
				 */
				// VA EN BOTON ATRAS

				/*
				 * menuBar.setVisible(true); cardLayout.show(contentPane, "darDeAltaUsuario");
				 */

			}

			// METODO PARA VACIAR TEXTS FIELD

		});

		btnHecho_3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

				int dia;
				int mes;
				int anio;

				try {
					dia = Integer.parseInt(textFieldDia_1.getText());
					mes = Integer.parseInt(textFieldMes_1.getText());
					anio = Integer.parseInt(textFieldAnio_1.getText());

					Usuario usuario;

					if (radioButtonEstudiante_1.isSelected()) {

						usuario = new Estudiante(textFieldCI_1.getText(), passwordFieldContrasenia_1.getText(),
								textFieldNombre_1.getText(), textFieldApellido_1.getText(), textFieldMail_1.getText(),
								LocalDate.of(anio, mes, dia),
								Orientacion.valueOf(comboBoxOrientacion_1.getSelectedItem().toString()),
								Estado.valueOf(comboBoxEstado_1.getSelectedItem().toString()),
								Generacion.valueOf(comboBoxGeneracion_1.getSelectedItem().toString()));

						c.altaUsuario(usuario);

						System.out.println("Nombre estudiante: " + textFieldNombre_1.getText());
						JOptionPane.showMessageDialog(null, "Estudiante creado con exito");
					} else if (radioButtonDocente_1.isSelected()) {

						usuario = new Docente(textFieldCI_1.getText(), passwordFieldContrasenia_1.getText(),
								textFieldNombre_1.getText(), textFieldApellido_1.getText(), textFieldMail_1.getText(),
								LocalDate.of(anio, mes, dia), TipoUsuario.DOCENTE);

						c.altaUsuario(usuario);

						System.out.println("Nombre docente: " + textFieldNombre.getText());
						JOptionPane.showMessageDialog(null, "Docente creado con exito");

					} else {

						usuario = new Funcionario(textFieldCI_1.getText(), passwordFieldContrasenia_1.getText(),
								textFieldNombre_1.getText(), textFieldApellido_1.getText(), textFieldMail_1.getText(),
								LocalDate.of(anio, mes, dia), TipoUsuario.FUNCIONARIO);

						c.altaUsuario(usuario);

						System.out.println("Nombre funcionario: " + textFieldNombre_1.getText());
						JOptionPane.showMessageDialog(null, "Funcionario creado con exito");
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Los valores ingresados son incorrectos");
				}
				vaciarCampos();

			}

			private void vaciarCampos() {
				// TODO Auto-generated method stub
				textFieldCI_1.setText("");
				passwordFieldContrasenia_1.setText("");
				textFieldNombre_1.setText("");
				textFieldApellido_1.setText("");
				textFieldMail_1.setText("");
				textFieldDia_1.setText("");
				textFieldMes_1.setText("");
				textFieldAnio_1.setText("");
			}
		});
		btnHecho_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBar.setVisible(true);
				cardLayout.show(contentPane, "darDeAltaUsuario");
			}
		});

		// menu dar de alta
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "darDeAltaUsuario");
			}
		});
		// panel dar de alta inasistencia

		mntmInasistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "darDeAltaInasistencia");
			}
		});

		// panel dar de alta materia

		mntmMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "darDeAltaMateria");
			}
		});

		// panel dar de alta examen

		mntmExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "panelDarDeAltaExamen");
			}
		});

		// panel consultar usuario
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "consultarUsuario");
			}
		});

		// panel consultar materia

		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "consultarMateria");
			}
		});

		// panel listar estudiante

		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "listarEstudiantes");
			}
		});

		// panel listar inasistencias

		mntmInasistencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelListarInasistencias");
			}
		});

		// boton filtrar lista de estudiantes
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelFiltrarEstudiantes");
			}
		});

		// boton hecho filtrar estudiantes

		btnHechoFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (comboBoxFiltrarGen.getSelectedItem().toString().equals("PRIMERO")
						&& comboBoxFiltrarOri.getSelectedItem().toString().equals("TIC")) {

				} else if (comboBoxFiltrarOri.getSelectedItem().toString().equals("TIC")
						&& comboBoxFiltrarGen.getSelectedItem().toString().equals("SEGUNDO")) {

				} else if (comboBoxFiltrarOri.getSelectedItem().toString().equals("TIC")
						&& comboBoxFiltrarGen.getSelectedItem().toString().equals("TERCERO")) {

				} else if (comboBoxFiltrarOri.getSelectedItem().toString().equals("ADM")
						&& comboBoxFiltrarGen.getSelectedItem().toString().equals("PRIMERO")) {

				} else if (comboBoxFiltrarOri.getSelectedItem().toString().equals("ADM")
						&& comboBoxFiltrarGen.getSelectedItem().toString().equals("SEGUNDO")) {

				} else {

				}
				cardLayout.show(contentPane, "listarEstudiantes");
			}
		});

		// boton cancelar filtrar estudiantes

		btnCancelarFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "listarEstudiantes");
			}
		});

		// mostrar panel estadisticas

		mntmReporteDeEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelEstadisticas");
			}
		});

		// mostrar panel list funcionarios

		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelListarFuncionarios");
			}
		});

		// mostrar panel listar docentes

		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelListarDocentes");
			}
		});

		// mostrar panel listar materias

		mntmMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "panelListarMaterias");
			}
		});

		// BOTON LOGOUT

		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelPrincipal");
				menuBar.setVisible(false);

			}
		});

		// mostrar panel listar estudiantes con pendientes

		mntmEstudiantesConPendientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(contentPane, "panelEstudiantesConPend");
			}
		});

		// mostar panel consultar inasistencia

		mntmInasistencias_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelConsultarInasistencia");
			}
		});

		// boton hecho que muestra jtable consulta de inasistencias

		btnHechoConsInasist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO listar inasistencias en tabla
				cardLayout.show(contentPane, "consultarInasistenciaJTable");
			}
		});

		// boton atras que vuelve al panel de la consulta de inasitencias
		btnAtrasConsultInasist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelConsultarInasistencia");
			}
		});

		// PANEL LISTAR INASISTENCIAS

		btnHechoListInasist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelListarInasistenciasJTable");
			}
		});

		// boton atras listado de inasistencias

		btnAtrasListInasist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelListarInasistencias");
			}
		});

		// PANEL DAR DE ALTA UNA INASISTENCIA CON BOTONES Y RESPECTIVAS FUNCIONALIDADES

		btnTic_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// filtrar estudiantes de primero tic
				cardLayout.show(contentPane, "panelAltaInasistJtable");
			}
		});

		btnTic_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// filtrar estudiantes de segundo tic
				cardLayout.show(contentPane, "panelAltaInasistJtable");
			}
		});

		btnTic_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// filtrar estudiantes de tercero tic
				cardLayout.show(contentPane, "panelAltaInasistJtable");
			}
		});

		btnAdm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// filtrar estudiantes de primero adm
				cardLayout.show(contentPane, "panelAltaInasistJtable");
			}
		});

		btnAdm_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// filtrar estudiantes de segundo adm
				cardLayout.show(contentPane, "panelAltaInasistJtable");
			}
		});

		btnAdm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// filtrar estudiantes de tercero adm
				cardLayout.show(contentPane, "panelAltaInasistJtable");
			}
		});

		btnAtras_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "darDeAltaInasistencia");
				scrollPaneAltaInasist.setVisible(false);
			}
		});

		btnHechoAltaInasistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// filtrar estudiantes por materia y grupo (anteriormente seleccionado)
				scrollPaneAltaInasist.setVisible(true);
			}
		});

		//

	}
}
