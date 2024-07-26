package grupo3.clase7.comercioInformatico;

public class ServicioDeArmado extends Servicio{
	public final double VALOR_HORA = 250;
	
	public ServicioDeArmado(int cantidadHoras) {
		super (cantidadHoras);
	}

	@Override
	public double getValorHora() {
		return this.VALOR_HORA;
	}
}
