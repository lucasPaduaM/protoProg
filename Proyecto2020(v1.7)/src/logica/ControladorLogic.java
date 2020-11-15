package logica;

import logica.*;
import persistencia.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ControladorLogic {
	ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	ArrayList<Docente> docentes = new ArrayList<Docente>();
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	ArrayList<Materia> materias = new ArrayList<Materia>();

	ControladorDB ctrlDB = new ControladorDB();

	public Usuario altaUsuario(Usuario usuario) {
		ctrlDB.persistirUsuario(usuario);
		return usuario;
	}

	public Materia altaMateria(Materia materia) {
		ctrlDB.persistirMateria(materia);
		return materia;
	}

	public Inasistencia altaInasistencia(Inasistencia inasistencia) {
	
	return inasistencia;
	}
}