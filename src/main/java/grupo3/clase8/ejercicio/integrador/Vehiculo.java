package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase abstracta que representa un vehículo con información básica.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Vehiculo {

    /**
     * Patente del vehículo.
     */
    private String patente;

    /**
     * Marca del vehículo.
     */
    private String marca;

    /**
     * Cilindrada del vehículo, en centímetros cúbicos (cc).
     */
    private Integer cilindrada;

}
