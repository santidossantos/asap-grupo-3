package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Examen implements Evaluable {

    private String fecha;

    public abstract boolean estaAprobado();

}
