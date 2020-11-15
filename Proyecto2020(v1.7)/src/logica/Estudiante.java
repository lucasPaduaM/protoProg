package logica;

import java.time.LocalDate;

public class Estudiante extends Usuario {
	private Orientacion orientacion;
	private Estado estado;
	private Generacion generacion;

	public Estudiante(String ci, String contrasenia, String nombre, String apellido, String mail, LocalDate fechaNacimiento,
			Orientacion orientacion, Estado estado, Generacion generacion){
		
		super(ci, contrasenia, nombre, apellido, mail, fechaNacimiento);
		this.orientacion=orientacion;
		this.estado=estado;
		this.generacion=generacion;
	
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}
	
	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Generacion getGeneracion() {
		return generacion;
	}

	public void setGeneracion(Generacion generacion) {
		this.generacion = generacion;
	}

}