package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;


@Getter
public class Auto extends Vehiculo {

    private Integer cantPuertas;

	public Auto(String patente, String marca, Integer cilindrada, Integer cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}


}
