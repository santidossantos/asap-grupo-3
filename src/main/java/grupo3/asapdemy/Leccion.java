package grupo3.asapdemy;

import grupo3.asapdemy.enums.TipoDeLeccion;

/**
 * Representa una lección dentro de un curso.
 */
public class Leccion {
	private String nombre;
	private int min;
	private TipoDeLeccion tipo;

	/**
	 * Constructor para inicializar una lección con su nombre, duración y tipo.
	 *
	 * @param nombre El nombre de la lección.
	 * @param min La duración de la lección en minutos.
	 * @param tipo El tipo de la lección.
	 */
	public Leccion(String nombre, int min, TipoDeLeccion tipo) {
		this.nombre = nombre;
		this.min = min;
		this.tipo = tipo;
	}
}
