package a;

import java.util.Date;

public class Tarea {
	String identificador;
	String nombre;
	int duracion;
	Date fechaInicio;
	Date fechaFin;
	boolean tareaTerminada;

	public Tarea(String identificador, String nombre, int duracion, Date fechaInicio, Date fechaFin, boolean tareaTerminada) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.duracion = duracion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tareaTerminada = tareaTerminada;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public boolean isTareaTerminada() {
		return tareaTerminada;
	}

	public void setTareaTerminada(boolean tareaTerminada) {
		this.tareaTerminada = tareaTerminada;
	}
	
	
}
