package grupo3.clase7.comercio.informatico;

public class Insumo implements Facturable{

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
		double precio = precioLista + (precioLista * porcentajeGanancia);
		double precioConIva = precio + precio * IVA;
		return precioConIva;
	}
}


