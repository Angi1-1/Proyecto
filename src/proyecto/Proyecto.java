package proyecto;

import java.sql.Date;

public class Proyecto {
	private String codigo; 
	private String nombre; 
	private String empleado;
	private Date fechaInicio; 
	private Date fechaFinal; 
	
	public Proyecto (String codigo, String nombre, String empleado, Date fechaIn, Date fechaFin) {
		this.codigo =codigo; 
		this.nombre= nombre; 
		this.empleado= empleado; 
		this.fechaFinal = fechaFin; 
		this.fechaInicio = fechaIn;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public void RegistraTareas() {
		
	}
}
