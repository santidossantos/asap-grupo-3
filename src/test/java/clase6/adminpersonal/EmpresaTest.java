package clase6.adminpersonal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import grupo3.clase6.adminpersonal.Empleado;
import grupo3.clase6.adminpersonal.EmpleadoComision;
import grupo3.clase6.adminpersonal.EmpleadoFijo;

public class EmpresaTest {
	
	EmpleadoFijo empleado1;
	EmpleadoFijo empleado2;
	EmpleadoComision empleado3;
	EmpleadoComision empleado4;
	List <Empleado> empleados;

	 @BeforeEach
	    void setUp() {
		 	this.empleado1 = new EmpleadoFijo("Juan","Java","30987657",5);
		 	this.empleado2 = new EmpleadoFijo("Martin","Python","30956657",9);
		 	this.empleado3 = new EmpleadoComision("Pedro","Agil","23654867",3,7);
		 	this.empleado4 = new EmpleadoComision("Maria","React","45854867",3,15);
		 	this.empleados = Arrays.asList(empleado1,empleado2,empleado3,empleado4);
	 }
	 
	 	public void mostrarSalario() {
	 		this.empleados.forEach(empleado ->System.out.println(empleado.toString()));
	 	}
	 	
	 	public Empleado empleadoConMasClientes() {
	 		this.empleados.stream().InstanceOf(sorted(Comparator.comparingInt(Empleado::getClientesCaptados));
	 	}
	 	
	}
	 	
