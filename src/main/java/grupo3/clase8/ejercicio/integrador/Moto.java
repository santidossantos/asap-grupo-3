package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

@Getter
public class Moto extends Vehiculo {

    private boolean espejosCompletos;

	public Moto(String patente, String marca, Integer cilindrada, boolean espejosCompletos) {
		super(patente, marca, cilindrada);
		this.espejosCompletos = espejosCompletos;
	}

}
