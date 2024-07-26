package grupo3.clase7.comercioInformatico;

public class ServicioDeReparacion extends Servicio {
	public int VALOR_HORA = 250;
	public int nivelDificultad;
	
	
	public ServicioDeReparacion(int cantidadHoras, int nivelDificultad){
		super(cantidadHoras);
		this.nivelDificultad = nivelDificultad;
	}
	
	public double calcularPrecio() {
		double precio;
		precio = super.calcularPrecio();
		if (nivelDificultad > 3) {
			precio = precio + (precio*0.25);
		}
		return precio;
	}
}
