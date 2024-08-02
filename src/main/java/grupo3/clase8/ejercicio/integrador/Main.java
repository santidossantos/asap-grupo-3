package grupo3.clase8.ejercicio.integrador;

/**
 * Clase principal que ejecuta el programa y muestra el informe de los exámenes gestionados por una sede.
 */
public class Main {
	/**
	 * Método principal que crea una sede, agrega exámenes y muestra un informe basado en los exámenes.
	 *
	 * @param args Argumentos de línea de comandos (no utilizados en este caso).
	 */
	public static void main(String[] args) {
		// Crear una instancia de la sede
		Sede sede = new Sede();

		// Crear exámenes de tipo ExamenAuto
		ExamenAuto examenAuto01 = new ExamenAuto("2022-04-10",
				new Persona("11111111", "Laura", "laura@mail.com"),
				new Circuito(10, 2),
				new Auto("IHW900", "Fiat", 1400, 5));

		ExamenAuto examenAuto02 = new ExamenAuto("2022-04-10",
				new Persona("22222222", "Marcelo", "marcelo@mail.com"),
				new Circuito(5, 2),
				new Auto("LFP182", "Renault", 1400, 5));

		ExamenAuto examenAuto03 = new ExamenAuto("2022-04-10",
				new Persona("33333333", "Victoria", "victoria@mail.com"),
				new Circuito(100, 1),
				new Auto("CHC078", "Renault", 1400, 5));

		// Crear un examen de tipo ExamenMoto y agregar circuitos
		ExamenMoto examenMoto01 = new ExamenMoto("2022-04-10",
				new Persona("44444444", "Damian", "damian@mail.com"),
				new Moto("PAS911", "Kawasaki", 250, true));

		examenMoto01.agregarCircuito(new Circuito(120, 1));
		examenMoto01.agregarCircuito(new Circuito(110, 0));

		// Agregar los exámenes a la sede
		sede.agregarExamen(examenAuto01);
		sede.agregarExamen(examenAuto02);
		sede.agregarExamen(examenAuto03);
		sede.agregarExamen(examenMoto01);

		// Mostrar el informe basado en los exámenes en la sede
		System.out.println(sede.obtenerInforme());
	}
}
