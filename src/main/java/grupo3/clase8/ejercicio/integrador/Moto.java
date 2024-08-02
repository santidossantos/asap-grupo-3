package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

/**
 * Clase que representa una moto, que es un tipo de vehículo.
 */
@Getter
public class Moto extends Vehiculo {

	/**
	 * Indica si la moto tiene todos los espejos completos.
	 */
	private boolean espejosCompletos;

	/**
	 * Constructor para crear una instancia de {@code Moto}.
	 *
	 * @param patente         La patente de la moto.
	 * @param marca           La marca de la moto.
	 * @param cilindrada      La cilindrada de la moto.
	 * @param espejosCompletos Indica si la moto tiene todos los espejos completos.
	 */
	public Moto(String patente, String marca, Integer cilindrada, boolean espejosCompletos) {
		super(patente, marca, cilindrada);
		this.espejosCompletos = espejosCompletos;
	}

}
