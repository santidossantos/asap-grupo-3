package grupo3.clase6.adminpersonal;

import java.time.LocalDate;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private int ingreso;
	
	public Empleado(String dni, String nombre, String apellido, int ingreso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ingreso = ingreso;
	}
	
	public abstract double calcularSalario();
	
	public int getIngreso() {
		return this.ingreso;
	}
	
	public int getAntiguedad() {
		return LocalDate.now().getYear() - getIngreso(); 
	}

	@Override
	public String toString() {
		return "Empleado nombre=" + nombre + ", apellido=" + apellido + "salario: "+this.calcularSalario();
	}

}
