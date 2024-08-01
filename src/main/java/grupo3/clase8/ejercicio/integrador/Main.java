package grupo3.clase8.ejercicio.integrador;

public class Main {
	public static void main(String[] args) {
		Sede sede = new Sede();
		
		ExamenAuto examenAuto01 = new ExamenAuto("2022-04-10", new Persona("11111111", "Laura", "laura@mail.com"),
				new Circuito(10, 2), new Auto("IHW900", "Fiat", 1400, 5));
		ExamenAuto examenAuto02 = new ExamenAuto("2022-04-10", new Persona("22222222", "Marcelo", "marcelo@mail.com"),
				new Circuito(5, 2), new Auto("LFP182", "Renault", 1400, 5));
		ExamenAuto examenAuto03 = new ExamenAuto("2022-04-10", new Persona("33333333", "Victoria", "victoria@mail.com"),
				new Circuito(100, 1), new Auto("CHC078", "Renault", 1400, 5));
		ExamenMoto examenMoto01 = new ExamenMoto("2022-04-10", new Persona("44444444", "Damian", "damian@mail.com"),
				new Moto("PAS911", "Kawasaki", 250, true));
		examenMoto01.agregarCircuito(new Circuito(120, 1));
		examenMoto01.agregarCircuito(new Circuito(110, 0));
		sede.agregarExamen(examenAuto01);
		sede.agregarExamen(examenAuto02);
		sede.agregarExamen(examenAuto03);
		sede.agregarExamen(examenMoto01);

		System.out.println(sede.obtenerInforme());
	}
}
