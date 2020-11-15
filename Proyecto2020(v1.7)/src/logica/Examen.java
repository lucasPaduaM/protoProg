package logica;

import java.time.LocalDate;

public class Examen {
	private LocalDate fecha;
	private int nota;
	
	Examen(LocalDate fecha, int nota){
		this.fecha=fecha;
		this.nota=nota;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
