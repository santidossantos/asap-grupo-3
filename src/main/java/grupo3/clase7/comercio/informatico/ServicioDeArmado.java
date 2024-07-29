package grupo3.clase7.comercio.informatico;

public class ServicioDeArmado extends Servicio{
	public final int VALOR_HORA = 250;
	
	public ServicioDeArmado(int cantidadHoras) {
		super (cantidadHoras);
	}

	@Override
	public int getValorHora() {
		return this.VALOR_HORA;
	}
}
