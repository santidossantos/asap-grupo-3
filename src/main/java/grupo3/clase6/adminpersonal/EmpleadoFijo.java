package grupo3.clase6.adminpersonal;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado{
	private double SUELDO_BASICO = 50000;
	
	public EmpleadoFijo (String dni, String nombre, String apellido, int ingreso){
		super(dni, nombre, apellido, ingreso);
	}

	@Override
	public double calcularSalario() {
		return this.SUELDO_BASICO+(SUELDO_BASICO*calcularPorcentaje());
	}
	
	private double calcularPorcentaje() {
		int antiguedad = this.getAntiguedad();
		
		if (antiguedad < 2) {
			return 1;
		}
		else if (antiguedad >= 2 && antiguedad <=5) {
			return 0.05;
		}
		else if (antiguedad >=6 && antiguedad <=10) {
			return 0.1;
		}
		else {
			return 0.15;
		}
	}
	
}
