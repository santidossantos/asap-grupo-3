package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Clase que representa un circuito evaluable.
 */
@AllArgsConstructor
@Getter
public class Circuito implements Evaluable {

    /**
     * Tiempo en segundos que tomó completar el circuito.
     */
    private Integer tiempoEnSegundos;

    /**
     * Número de faltas cometidas durante el circuito.
     */
    private Integer faltasCometidas;

    /**
     * Verifica si el circuito está aprobado.
     *
     * @return {@code true} si el número de faltas cometidas es menor o igual a 2, {@code false} en caso contrario.
     */
    public boolean estaAprobado() {
        return this.faltasCometidas <= 2;
    }
}