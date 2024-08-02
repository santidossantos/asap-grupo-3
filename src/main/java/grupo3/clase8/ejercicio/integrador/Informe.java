package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase que representa un informe con estadísticas sobre exámenes.
 */
@AllArgsConstructor
@Data
public class Informe {

    /**
     * Porcentaje de exámenes aprobados en el informe.
     */
    private double porcentajeExamenesAprobados;

    /**
     * Promedio de tiempo de los exámenes evaluados en el informe.
     */
    private double promedioTiempo;

}
