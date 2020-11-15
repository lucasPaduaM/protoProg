package persistencia;

import persistencia.Conn;
import logica.*;
import java.sql.*;
import java.time.LocalDate;

import logica.Funcionario;
import logica.Generacion;
import logica.Orientacion;
import logica.ControladorLogic;
import logica.Estado;
import logica.Estudiante;

public class ControladorDB {
	
	public static void main(String args) {
		Conn con = new Conn();
		Connection connection = con.conectar();

		Estudiante estudiante = new Estudiante("55712925", "holahola", "Lucas", "Padua", "lucaspadua@gmail.com",
				LocalDate.of(1999, 10, 22), Orientacion.TIC, Estado.ACTIVO, Generacion.PRIMERO);

		String values = "";

		values = estudiante.getCi() + ", " + estudiante.getContrasenia() + ", " + estudiante.getNombre() + ", "
				+ estudiante.getApellido() + ", " + estudiante.getMail() + ", " + estudiante.getFechaNacimiento() + ", "
				+ estudiante.getOrientacion() + ", " + estudiante.getEstado() + ", " + estudiante.getGeneracion()
				+ ");";

		String insert = "INSERT INTO estudiante VALUES (" + values + ");";

		try {
			Statement s = connection.createStatement();
			s.executeUpdate(insert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ControladorDB controladorDB() {
		Conn con = new Conn();
		Connection connection = con.conectar();

		Estudiante estudiante = new Estudiante("55712925", "holahola", "Lucas", "Padua", "lucaspadua@gmail.com",
				LocalDate.of(1999, 10, 22), Orientacion.TIC, Estado.ACTIVO, Generacion.PRIMERO);

		String values = "";

		values = estudiante.getCi() + ", " + estudiante.getContrasenia() + ", " + estudiante.getNombre() + ", "
				+ estudiante.getApellido() + ", " + estudiante.getMail() + ", " + estudiante.getFechaNacimiento() + ", "
				+ estudiante.getOrientacion() + ", " + estudiante.getEstado() + ", " + estudiante.getGeneracion()
				+ ");";

		String insert = "INSERT INTO estudiante VALUES (" + values + ");";

		try {
			Statement s = connection.createStatement();
			s.executeUpdate(insert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public void persistirUsuario(Usuario usuario) {
	}

	public void persistirMateria(Materia materia) {

	}

	public void persistirInasistencia() {

	}

	public void persistirExamen() {

	}

	// String ci, String contrasenia, String nombre, String apellido, String mail,
	// LocalDate fechaNacimiento,
	// Orientacion orientacion, Estado estado, Generacion generacion

	// Estudiante estudiante = new Estudiante(, null, null, null, null, null, null,
	// null, null);

	// Estudiante e = new Estudiante();

	/* ci, contrasenia, nombre, apellido, mail, fechaNacimiento */

	/*
	 * public recuperarUsuario (String ci) {
	 * 
	 * return usuario; }
	 */
}
