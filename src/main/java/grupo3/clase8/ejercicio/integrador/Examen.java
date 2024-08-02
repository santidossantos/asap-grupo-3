package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Clase abstracta que representa un examen, el cual es evaluable.
 */
@NoArgsConstructor
@AllArgsConstructor
public abstract class Examen implements Evaluable {

    /**
     * Fecha en la que se realizó el examen.
     */
    private String fecha;

    /**
     * Persona que ha realizado o es responsable del examen.
     */
    private Persona autor;

    /**
     * Método abstracto que determina si el examen está aprobado.
     *
     * @return {@code true} si el examen está aprobado, {@code false} en caso contrario.
     */
    @Override
    public abstract boolean estaAprobado();

    /**
     * Método abstracto que calcula el promedio de tiempo asociado al examen.
     *
     * @return El promedio de tiempo del examen.
     */
    public abstract int getPromedioTiempo();
}
