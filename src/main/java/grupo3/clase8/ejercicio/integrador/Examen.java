package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Examen implements Evaluable {

    private String fecha;
    private Persona autor;

    public abstract boolean estaAprobado();

    public abstract int getPromedioTiempo();
}
