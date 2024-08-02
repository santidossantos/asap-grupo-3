package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

/**
 * Clase que representa un auto, que es un tipo de vehículo.
 */
@Getter
public class Auto extends Vehiculo {

	/**
	 * Cantidad de puertas del auto.
	 */
	private Integer cantPuertas;

	/**
	 * Constructor para crear una instancia de la clase Auto.
	 *
	 * @param patente      La patente del auto.
	 * @param marca        La marca del auto.
	 * @param cilindrada   La cilindrada del auto.
	 * @param cantPuertas  La cantidad de puertas del auto.
	 */
	public Auto(String patente, String marca, Integer cilindrada, Integer cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}
}
