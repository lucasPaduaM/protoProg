package logica;

import java.time.LocalDate;

public class Docente extends Usuario {
	private TipoUsuario tipousuario;
	public Docente(String ci, String contrasenia, String nombre, String apellido, String mail, LocalDate fechaNacimiento, TipoUsuario tipousuario) {
		super(ci, contrasenia, nombre, apellido, mail, fechaNacimiento);
	}
	public TipoUsuario getTipousuario() {
		return tipousuario;
	}
	public void setTipousuario(TipoUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}
}
