package grupo3.asapdemy;

import enums.TipoDeLeccion;

public class Leccion {
	private String nombre;
	private int min;
	private TipoDeLeccion tipo;
	
	public Leccion(String nombre, int min, TipoDeLeccion tipo) {
		this.nombre = nombre;
		this.min = min;
		this.tipo = tipo;
	}
}
