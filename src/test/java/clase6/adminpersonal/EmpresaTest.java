package clase6.adminpersonal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import grupo3.clase6.adminpersonal.Empleado;
import grupo3.clase6.adminpersonal.EmpleadoComision;
import grupo3.clase6.adminpersonal.EmpleadoFijo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaTest {

	private EmpleadoFijo empleado1;
	private EmpleadoFijo empleado2;
	private EmpleadoComision empleado3;
	private EmpleadoComision empleado4;
	private List<Empleado> empleados;

	@BeforeEach
	void setUp() {
		empleado1 = new EmpleadoFijo("Juan", "Java", "30987657", 2022);
		empleado2 = new EmpleadoFijo("Martin", "Python", "30956657", 2010);
		empleado3 = new EmpleadoComision("Pedro", "Agil", "23654867", 2024, 7);
		empleado4 = new EmpleadoComision("Maria", "React", "45854867", 2003, 15);
		empleados = Arrays.asList(empleado1, empleado2, empleado3, empleado4);
	}

	public void mostrarSalario() {
		empleados.forEach(empleado -> System.out.println(empleado.toString()));
	}

	public Empleado empleadoConMasClientes() {
		return empleados.stream()
				.filter(empleado -> empleado instanceof EmpleadoComision)
				.max(Comparator.comparingInt(empleado -> ((EmpleadoComision) empleado).getClientesCaptados()))
				.orElse(null);
	}

	@Test
	public void testMostrarSalario() {
		this.mostrarSalario();
	}

	@Test
	public void testEmpleadoConMasClientes() {
		assertEquals(empleado4, this.empleadoConMasClientes());
	}
}
