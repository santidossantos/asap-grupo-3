package grupo3.clase7.comercioInformatico;

public abstract class Servicio implements Facturable {
	private int cantidadHoras;
	private final int VALOR_HORA = 0; 
	
	public Servicio (int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
	public double calcularPrecio() {
		return cantidadHoras*VALOR_HORA;
	}
}
