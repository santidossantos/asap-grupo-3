package grupo3.clase7.comercioInformatico;

public abstract class Servicio implements Facturable {

	private int cantidadHoras;
	
	public Servicio (int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
	public double calcularPrecio() {
		double precio = cantidadHoras * getValorHora();
		double precioConIva = precio + precio * (IVA / 2);
		return precioConIva;
	}
	
	public abstract int getValorHora();
}
