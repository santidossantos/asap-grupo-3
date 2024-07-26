package grupo3.clase7.comercioInformatico;

public class Insumo {
	private String nombre;
	private	double porcentajeGanancia;
	private double precioLista;
	private TipoDeInsumo tipo;
	
	public Insumo (String nombre, double porcentajeGanancia, double precioLista,TipoDeInsumo tipo) {
		this.nombre = nombre;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioLista = precioLista;
		this.tipo = tipo;
	}
	
	public double calcularPrecio() {
		return precioLista + (precioLista*porcentajeGanancia);
	}
}

