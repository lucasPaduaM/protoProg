package logica;

import java.time.LocalDate;

public class Inasistencia {
	private LocalDate fecha;
	private TipoInasistencia tipoInasistencia;
	private int cantidadHoras;
	private int ciEstudiante;
	
	Inasistencia(LocalDate fecha, TipoInasistencia tipoInasistencia, int cantidadHoras, int ciEstudiante){
		this.fecha=fecha;
		this.tipoInasistencia=tipoInasistencia;
		this.cantidadHoras=cantidadHoras;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoInasistencia getTipoInasistencia() {
		return tipoInasistencia;
	}

	public void setTipoInasistencia(TipoInasistencia tipoInasistencia) {
		this.tipoInasistencia = tipoInasistencia;
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public int getCiEstudiante() {
		return ciEstudiante;
	}

	public void setCiEstudiante(int ciEstudiante) {
		this.ciEstudiante = ciEstudiante;
	}
}