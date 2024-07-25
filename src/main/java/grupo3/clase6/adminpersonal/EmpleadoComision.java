package grupo3.clase6.adminpersonal;

public class EmpleadoComision extends Empleado{
	private double SALARIO_MINIMO = 20000;
	private double MONTO_CLIENTE = 1000;
	private int clientesCaptados;
	
	public EmpleadoComision(String dni, String nombre, String apellido, int ingreso, int clientesCaptados) {
		super(dni, nombre, apellido, ingreso);
		this.clientesCaptados = clientesCaptados;
	}
	
	public double calcularSalario() {
		if ((this.clientesCaptados*MONTO_CLIENTE)>SALARIO_MINIMO) {
			return this.clientesCaptados*MONTO_CLIENTE;
		}
		else {
			return this.SALARIO_MINIMO;
		}
	}
	
	public int getClientesCaptados() {
		return this.clientesCaptados;
	}

}
