package a;

public class EmpleadoTarea {
	int duraciónTarea;
	double porcentajeEsfuerzo;
	Empleado empleado;
	Tarea tarea;
	
	public EmpleadoTarea(int duraciónTarea, double porcentajeEsfuerzo) {
		super();
		this.duraciónTarea = duraciónTarea;
		this.porcentajeEsfuerzo = porcentajeEsfuerzo;
	}
	
	public int getDuraciónTarea() {
		return duraciónTarea;
	}
	public void setDuraciónTarea(int duraciónTarea) {
		this.duraciónTarea = duraciónTarea;
	}
	public double getPorcentajeEsfuerzo() {
		return porcentajeEsfuerzo;
	}
	public void setPorcentajeEsfuerzo(double porcentajeEsfuerzo) {
		this.porcentajeEsfuerzo = porcentajeEsfuerzo;
	}
	
	
}
