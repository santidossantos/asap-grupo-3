package grupo3.clase7.comercioInformatico;

public abstract class Servicio implements Facturable {
	private int cantidadHoras;
	
	public Servicio (int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
	public double calcularPrecio() {
		return cantidadHoras + getValorHora();
	}
	
	public abstract int getValorHora();
}
